<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lectores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link href="<c:url value="/resources/css/main.css" />"         rel="stylesheet"  type="text/css" />
 <link href="<c:url value="/css/custom.css" />"         rel="stylesheet"  type="text/css" />
  <link href="<c:url value="/css/normalize.css" />"         rel="stylesheet"  type="text/css" />
   <link href="<c:url value="/css/skeleton.css" />"         rel="stylesheet"  type="text/css" />
</head>


<body>
    <div id="wrap">
        <div id="wra1p" >
             <c:import url="/WEB-INF/views/tags/navbar.jsp"/>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-2">
                  <div class="well sidebar-nav">
                    <c:import url="/WEB-INF/views/tags/menu.jsp"/>
                  </div>
                </div>
                <div class="col-md-10">
                    <div class = "container  w-50">
                        <h1 class = "text-center"> Libros leidos </h1>
                    </div>

                    <h2 class = "text-center"> Enhorabuena <Nombre> has leido <num> libros </h2>
                    <div class = "row">
                        <div class ="col-sm-3">
                            <label>id libro: </label>
                        </div>
                        <div class ="col-sm-3">
                            <label>Nombre libro: </label>
                        </div>
                        <div class ="col-sm-3">
                            <label>Precio: </label>
                        </div>
                        <div class ="col-sm-3">
                            <label>Cómprame: </label>
                        </div>
                    </div>
                    <c:forEach items="${listaLibros}" var="lItem">
                    <div class = "row">
                        <div class ="col-sm-3">
                            <c:out value="${lItem.book_id}"/>
                        </div>
                        <div class ="col-sm-3">
                            <c:out value="${lItem.book_title}"/>
                        </div>
                        <div class ="col-sm-3">
                            <c:out value="${lItem.precio}"/>
                        </div>
                        <div class ="col-sm-2">
                            <a href="/libros?opt=comprar&id_libro=${lItem.book_id}" class ="btn btn-danger mb-3">Comprar</a>
                        </div>
                    </div>
                    </c:forEach>

            </div><!--/col-->
          </div><!--/row-->

          <hr class="soften">
    </div>

    <c:import url="/WEB-INF/views/tags/footer.jsp"/>

	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/demo.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/json2.js" />"></script>
  <script type="text/javascript" src="<c:url value="/resources/js/date.format.js" />"></script>
</body>

</html>