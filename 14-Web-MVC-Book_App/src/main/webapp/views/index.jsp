<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Book Details </h3>
<form action="book">

Book Id:<input type="text" name="id"/>
<input type ="submit" value="search"/>
</form>

 <hr/>
 
 Book Id:   ${book.bookId }    </br>
 BookName:  ${book.bookName}  </br>
 BookPrice: ${book.bookPrice}    </br>


</body>
</html>