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
        <title>Users</title>
        <%@include file="head.jsp" %>

    <body style="">
        <%@include file="nav.jsp" %>

        <div class="container">
            <h4><span id="status" class="col-lg-offset-4"></span></h4>
            <form id="form" method="POST" action="<c:url value="deleteuser"/>">
                <div class="panel panel-default">
                    <!-- Default panel contents -->
                    <div class="panel-heading"><h3>List of users</h3></div>

                    <!-- Table -->
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>Firstname</th>
                                <th>Lastname</th>
                                <th>Username</th>                           
                                <th>Role</th>                           
                                <th>Operation</th>                           
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${users}" var="user">
                                <tr class="${user.id}">
                                    <td class="td-firstname">${user.firstname}</td>
                                    <td class="td-lastname">${user.lastname}</td>
                                    <td class="td-username">${user.username}</td>                            
                                    <td class="td-rolename">${user.role.rolename}</td>
                                    <td>
                                        <div class="btn btn-danger btn-sm delete-user" id="${user.id}"><span class="glyphicon glyphicon-trash"></span> Delete</div>
                                        <div class="btn btn-success btn-sm edit" edit="${user.id}"><span class="glyphicon glyphicon-pencil"></span> Edit User</div>
                                        <div class="btn btn-primary btn-sm save hidden" edit="${user.id}"><span class="glyphicon glyphicon-floppy-save"></span> Save</div>
                                    </td>                                
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <input type="hidden" id="delete-id" value="" name="id"/>
            </form>
            <div class="panel panel-success">
                <!-- Default panel contents -->
                <div class="panel-heading"><h3>Search User</h3></div>

                <span id="msg" style="height: 20px"></span>
                <div class="row">
                    <div class="form-group input-group col-lg-5" style="margin-top: 20px">
                        <span class="input-group-addon search-user">Search by username</span>
                        <input type="text" id="searchvalue" class="form-control" placeholder="Enter Username to search...">                            
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-lg-5">
                        <label for="firstname" class="col-lg-2 control-label">Firstname</label>
                        <div class="col-lg-10">
                            <input type="text" class="form-control" id="firstname" placeholder="Firstname">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="form-group col-lg-5">
                        <label for="lastname" class="col-lg-2 control-label">Lastname</label>
                        <div class="col-lg-10">
                            <input type="text" class="form-control" id="lastname" placeholder="Lastname">
                        </div>
                    </div>
                </div>

            </div>

        </div>
        <!-- /container -->


        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="<c:url value="/resources/js/jquery-1.10.2.min.js"/>"></script>
        <script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $(".search-user").click(function() {
                    if ($("#searchvalue").val() !== '') {
                        $.ajax({
                            url: "searchuser/",
                            type: "GET",
                            data: {
                                username: $("#searchvalue").val()
                            },
                            success: function(user) {
                                if (user !== '') {
                                    var u = $.parseJSON(user);

                                    $("#firstname").val(u.firstname);
                                    $("#lastname").val(u.lastname);
                                } else {
                                    $("#msg").text("No result found for '" + $("#searchvalue").val() + "'.");
                                }
                            },
                            error: function(jqXHR, textStatus, errorThrown) {
                                alert("Error: " + jqXHR.toString() + " " + textStatus + " " + errorThrown);
                            }
                        });
                    } else {
                        $("#msg").text("The search field cannot be empty!!!");
                        $("#firstname").val('');
                        $("#lastname").val('');
                    }
                });

                $("#searchvalue").focus(function() {
                    $("#msg").text('');
                });

                $('.delete-user').click(function() {
                    $('#delete-id').val($(this).attr('id'));
                    $('#form').submit();
                });

                $('.edit').click(function() {
                    $(this).addClass('hidden');
                    var tr = $("." + $(this).attr('edit'));
                    tr.find('.save').removeClass('hidden');
                    var td_firstname = tr.find('.td-firstname').text();
                    var td_lastname = tr.find('.td-lastname').text();
                    var td_username = tr.find('.td-username').text();

                    tr.find('.td-firstname').html('\
                            <input type="text" value="' + td_firstname + '" class="form-control" placeholder="Firstname"/>'
                            );
                    tr.find('.td-lastname').html('\
                            <input type="text" value="' + td_lastname + '" class="form-control" placeholder="Firstname"/>'
                            );
                    tr.find('.td-username').html('\
                            <input type="text" readonly value="' + td_username + '" class="form-control form-control-static" placeholder="Firstname"/>'
                            );

                });

                $('.save').click(function() {
                    $(this).addClass('hidden');
                    var tr = $("." + $(this).attr('edit'));
                    tr.find('.edit').removeClass('hidden');

                    var td_firstname = tr.find('.td-firstname > input').val();
                    var td_lastname = tr.find('.td-lastname  > input').val();
                    var td_username = tr.find('.td-username  > input').val();
                    tr.find('.td-firstname').text(td_firstname);
                    tr.find('.td-lastname').text(td_lastname);
                    tr.find('.td-username').text(td_username);

                    $.ajax({
                        url: "updateuser/" + $(this).attr('edit'),
                        type: "POST",
                        dataType: "text",
                        data: {
                            firstname: td_firstname,
                            lastname: td_lastname
                        },
                        success: function(response) {
                            $("#status").html(response);
                            var x = setInterval(function() {
                                $("#status").html('');
                                x.clearInterval();
                            }, 3000)
                        },
                        error: function(x, y, z) {
                            alert("error occured: " + x + " " + y + " " + z);
                        }
                    });
                });
            });


        </script>

        <style type="text/css">
            .search-user:hover{
                cursor: pointer;
            }
        </style>
    </body>
