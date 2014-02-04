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
<html lang="en">
    <head>
        <title>Online Application</title>
        <%@include file="head.jsp" %>
    </head>
    <body style="">
        <!-- Static navbar -->
        <%@include file="nav.jsp" %>
        <div class="container">
            <form action="<c:url value="/saveSectionATwo"/>" class="form-horizontal" role="form" method="POST" modelAttribute=""> 
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="text-danger section-master-heading">Section A 3</h1>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <h4 class="text-primary section-child-heading">English Language Proficiency</h4>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="contact.title">Title</label>
                            <select class="form-control" id="contact.title" name="contact.title">
                                <option></option>
                                <option>Mr</option>
                                <option>Miss</option>
                                <option>Mrs</option>
                                <option>Ms</option>
                                <option>Dr</option>
                                <option>Prof</option>
                            </select>                            
                        </div>

                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="contact.name">Contact Name</label>
                            <input type="text" class="form-control" id="contact.name" name="contact.name"/>
                        </div>                        
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="contact.cellNumber">Cell Number</label>
                            <input type="text" class="form-control" id="contact.cellNumber" name="contact.cellNumber"/>
                        </div> 
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="contact.email">Email</label>
                            <input type="text" class="form-control" id="contact.email" name="contact.email"/>
                        </div>  
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="contact.telephone">Telephone</label>
                            <input type="text" class="form-control" id="contact.telephone" name="contact.telephone"/>
                        </div>
                    </div>

                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="contact.houseNumber">House Number</label>
                            <input type="text" class="form-control" id="contact.houseNumber" name="contact.houseNumber"/>
                        </div>  
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="contact.street">Street</label>
                            <input type="text" class="form-control" id="contact.street" name="contact.street"/>
                        </div>
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="town">Town</label>
                            <input type="text" class="form-control" id="contact.town" name="contact.town"/>
                        </div> 
                    </div>

                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="contact.country">Country</label>
                            <input type="text" class="form-control" id="contact.country" name="contact.country"/>
                        </div>  
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <h4 class="text-primary section-child-heading">Contact in case of emergency</h4>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="emergencyContact.name">Name</label>
                            <input type="text" class="form-control" id="emergencyContact.name" name="emergencyContact.name"/>
                        </div>
                        <div class="form-group">
                            <label for="emergencyContact.relationship">Relationship to you</label>
                            <input type="text" class="form-control" id="emergencyContact.relationship" name="emergencyContact.relationship"/>
                        </div>
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="emergencyContact.telephoneNumber">Telephone Number</label>
                            <input type="text" class="form-control" id="emergencyContact.telephoneNumber" name="emergencyContact.telephoneNumber"/>
                        </div>
                    </div>

                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="emergencyContact.address">Address</label>
                            <textarea rows="5" class="form-control max-textarea" id="emergencyContact.address" name="emergencyContact.address"></textarea>
                        </div>  
                    </div>
                </div>

                <div class="row" style="margin-top: 38px;">
                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="nationality">Are you a Zimbabwean national?</label>
                            <input type="checkbox" style="margin-bottom: 37px; margin-left: 20px;" id="nationality" name="nationality"/>
                        </div>                        
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group ">
                            <label for="otherNationality">If NOT Zimbabwean, what is your nationality?</label>
                            <input type="text" class="form-control" id="otherNationality" name="otherNationality"/>
                        </div>
                    </div>                    

                </div>

                <div class="row" style="margin-top: 38px;">
                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="citizenship">Do you hold Zimbabwean Citizenship?</label>
                            <input type="checkbox" style="margin-bottom: 37px; margin-left: 20px;" id="citizenship" name="citizenship"/>
                        </div>                        
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group ">
                            <label for="otherCitizenship">If NOT Zimbabwean Citizen, state your Citizenship</label>
                            <input type="text" class="form-control" id="otherCitizenship" name="otherCitizenship"/>
                        </div>
                    </div>

                </div>

                <div class="row">
                    <div class="col-md-8 form-column resize-form-control">
                        <div class="form-group">
                            <label for="drugUseOne[]">I have </label> 
                            <div class="form-control">                                
                                <input class="marital-status-radios-separator" type="radio" value="occasionally" name="drugUseOne[]"/> occasionally
                                <input class="marital-status-radios-separator" type="radio" value="often" name="drugUseOne[]"/> often
                                <input class="marital-status-radios-separator" type="radio" value="once" name="drugUseOne[]"/> once

                                <input class="marital-status-radios-separator" type="radio" value="never" name="drugUseOne[]"/> never
                                <label class="col-md-offset-1 drugLabel">used Alcohol</label>
                            </div>
                        </div>
                    </div>                    
                </div>
                
                <div class="row">
                    <div class="col-md-8 form-column resize-form-control">
                        <div class="form-group">
                            <label for="drugUseTwo[]">I have </label> 
                            <div class="form-control">                                
                                <input class="marital-status-radios-separator" type="radio" value="occasionally" name="drugUseTwo[]"/> occasionally
                                <input class="marital-status-radios-separator" type="radio" value="often" name="drugUseTwo[]"/> often
                                <input class="marital-status-radios-separator" type="radio" value="once" name="drugUseTwo[]"/> once

                                <input class="marital-status-radios-separator" type="radio" value="never" name="drugUseTwo[]"/> never
                                <label class="col-md-offset-1 drugLabel">used Tobacco</label>
                            </div>
                        </div>
                    </div>                    
                </div>
                
                <div class="row">
                    <div class="col-md-8 form-column resize-form-control">
                        <div class="form-group">
                            <label for="drugUseThree[]">I have </label> 
                            <div class="form-control">                                
                                <input class="marital-status-radios-separator" type="radio" value="occasionally" name="drugUseThree[]"/> occasionally
                                <input class="marital-status-radios-separator" type="radio" value="often" name="drugUseThree[]"/> often
                                <input class="marital-status-radios-separator" type="radio" value="once" name="drugUseThree[]"/> once
                                <input class="marital-status-radios-separator" type="radio" value="never" name="drugUseThree[]"/> never
                                <label class="col-md-offset-1 drugLabel">used other drugs</label>
                            </div>
                        </div>
                    </div>                    
                </div>



                <div class="row">
                    <div class="col-md-12">
                        <button type="submit" class="btn btn-primary pull-right">Save and Next</button>
                    </div>
                </div>
            </form>

        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>