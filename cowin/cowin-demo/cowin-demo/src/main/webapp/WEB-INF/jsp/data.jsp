<html>
<head>
<link th:href="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
	.login-form {
		width: 340px;
    	margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {
        font-size: 15px;
        font-weight: bold;
    }
</style>
</head>
   <body>
   <div class="login-form">
      <form method = "post">
      <h3>PostCode:</h3>
         <div class="form-group">
               <input type="text" class="form-control" placeholder="Enter postcode here.." required="required" name="postcode" value=${postcode}>
         </div> <br>
          <div class="form-group">
            <input class="btn btn-primary btn-lg btn-block" type="submit" value="Submit">
          </div>

          <table>
          <c:forEach var="item1" items="${rawData}">
              <c:forEach var="item2" items="${item1.value}">
              <tr>
                  <td><c:out value="${item2.value}" />${item2.value}</td>
              </tr>
              </c:forEach>
          </c:forEach>
          </table>
      </form>
</div>
   </body>
</html>