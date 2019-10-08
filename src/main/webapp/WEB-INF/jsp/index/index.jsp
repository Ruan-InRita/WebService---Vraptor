
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  

<title>Ola_Mundo</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css">

	

</head>
<body>
    <div class="body1">
        <div class="intro">
            <p style="font-size: 150%;text-align: center;">${variable}</p>
        </div>
        <div class="submenu">

        </div>
        <div class="container" style="height: 70vh;background-color: white;">
            <form class="form" action="<c:url value='/imagens/'/>">
                <p class="title" style="color:#232323;font-family: arial"><strong>LOGIN</strong></p>
                <input type="text" class="elements text" placeholder="Enter Name" name="login"><br>
                <input type="password" class="elements text"placeholder="Enter Senha" name="senha"><br>
                <input type="submit" style="color:#232323;font-family: arial"  class="btn elements" value="Confirm" name="btn1">
            </form>	
        </div>
    </div>
    <div class="rodape1">
      
    </div>
    <div class="rodape">
        <div class="container">
          
        </div>     
    </div>
</body>
</html>