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
        <title>Online Application</title>
        <%@include file="head.jsp" %>
    </head>
    <body style="">
        <!-- Static navbar -->
        <%@include file="nav.jsp" %>
        <div class="container">
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <div class="form-group">
                    <label for="exampleInputFile">File input</label>
                    <input type="file" id="exampleInputFile">
                    <p class="help-block">Example block-level help text here.</p>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox"> Check me out
                    </label>
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </body>
</html>
