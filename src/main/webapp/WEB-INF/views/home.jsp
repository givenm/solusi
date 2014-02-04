<%-- 
    Document   : home
    Created on : Sep 3, 2013, 1:29:42 AM
    Author     : given
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" %>

<!DOCTYPE html>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!-- saved from url=(0057)http://getbootstrap.com/examples/navbar-static-top/#about -->
<html lang="en">
    <head>
        <title>Home</title>
        <%@include file="head.jsp" %>
    </head>
    <body style="">        
        <%@include file="nav.jsp" %>
        <div class="container">
            <div class="well row col-md-offset-3 col-md-5 alert-danger" style="text-align: center; height: 251px; padding-top: 80px">
                <a href="<c:url value="section-a-1"/>" class="btn-primary btn"><h2>Start Demo</h2></a>
            </div>
        </div>
    </body>
</html>