package com.example.cowindemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@Controller
public class APIController {

    @RequestMapping(value="/postcode", method = RequestMethod.GET)
    public String showDataPage(ModelMap model){
        return "data";
    }

    @RequestMapping(value="/postcode", method = RequestMethod.POST)
    public String showDataPageD(ModelMap model, @RequestParam String postcode){
        model.put("postcode", postcode);
        //https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByPin?pincode=411045&date=15-11-2022
        Date dt = new Date();
        LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC"))).plusDays(1);
        String uri  = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByPin?pincode="+postcode+"&date=19-11-2022";
        System.out.println("URI being called is:"+uri);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri,String.class);
        System.out.println(result);
        ObjectMapper objectMapper = new ObjectMapper();
        Map map = null;
        try {
            map = objectMapper.readValue(result, Map.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        assert map != null;
        Object data =  map.get("sessions");
        Map<String,Map<String,String >> rawData = new HashMap<>();
        for(Object value:((List<?>) data).toArray()){
            for(Object finalValue: Collections.singletonList(value)) {
                rawData.put(((LinkedHashMap<?, ?>) finalValue).get("center_id").toString()+"-"+((LinkedHashMap<?, ?>) finalValue).get("vaccine").toString(), (Map<String, String>) finalValue);
            }
        }
        model.put("rawData", rawData);
        return "show-data";
    }
}
