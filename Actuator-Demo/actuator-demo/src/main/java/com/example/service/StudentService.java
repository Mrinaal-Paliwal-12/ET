package com.example.service;

import com.example.model.Student;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

	private static List<Student> students = new ArrayList<Student>();

	static {
		students.add(new Student("1", "Amar", "MCA"));
		students.add(new Student("2", "Rahul", "MA"));
		students.add(new Student("3", "Raj", "MCA"));
	}

	@Cacheable("student")
	public Student getStudent(String id) {
		System.out.println("came here******************* for " + id);

		try {
			System.out.println("sleeping for 5 sec");
			Thread.sleep(1000 * 5);

		} catch (Exception ex) {

		}
		for (Student stud : students) {
			if (stud.getId().equalsIgnoreCase(id)) {
				return stud;
			}
		}
		return students.get(0);
	}
        
        @Cacheable("factorial_n")
        public int getfactorial(int id) {
		//System.out.println("came here******************* for " + id);

		try {
			System.out.println("sleeping for 5 sec");
			Thread.sleep(1000 * 5);

		} catch (Exception ex) {

		}
//		for (Student stud : students) {
//			if (stud.getId().equalsIgnoreCase(id)) {
//				return stud;
//			}
//		}

                int i,fact=1;
                for(i=1;i<=id;i++)
                {
                    fact=fact*i;
                }
		return fact;
	}

	@CacheEvict(value = "student", allEntries = true)
	public void removeValues() {
		System.out.println("removed");
	}

	@Scheduled(fixedRate = 6000)
	public void removeAfterInterval() {

	}
}
