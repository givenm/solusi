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
                            <label for="languageProficiency.english">Is English your first/native language?</label>
                            <input type="checkbox" id="languageProficiency.english" name="languageProficiency.english"/>
                        </div>
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="languageProficiency.previousEducationInEnglish">Was your previous education undertaken in English?</label>
                            <input type="checkbox" id="languageProficiency.previousEducationInEnglish" name="languageProficiency.previousEducationInEnglish"/>
                        </div>                        
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="languageProficiency.previousEducationLanguage">If NO please state the language through which you were educated</label>                            
                            <input type="text" class="form-control" id="languageProficiency.previousEducationLanguage" name="languageProficiency.previousEducationLanguage"/>
                        </div> 
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="languageProficiency.firstSpockenLanguage">Please state your first spoken language</label>
                            <input type="text" class="form-control" id="languageProficiency.firstSpockenLanguage" name="languageProficiency.firstSpockenLanguage"/>
                        </div>  
                    </div>             
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <h4 class="text-primary section-child-heading">Previous Solusi University Training</h4>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="languageProficiency.attendedBefore">Have you attended Solusi University before?</label>
                            <input type="checkbox" id="languageProficiency.attendedBefore" name="languageProficiency.attendedBefore"/>
                        </div>
                    </div> 
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="languageProficiency.previousTrainingTypes[].trainingName">If Yes, please specify type of training and Dates:</label>                            
                        </div>  
                    </div>
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="languageProficiency.previousTrainingTypes[].trainingName">Training</label> 
                            <input type="text" class="form-control" id="languageProficiency.previousTrainingTypes[].trainingName" name="languageProficiency.previousTrainingTypes[].trainingName"/>                            
                        </div>  
                    </div>
                </div>

                <div class="row">    

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="languageProficiency.previousTrainingTypes[].studyStatus">Full Time Attendance?</label>
                            <input type="checkbox" id="languageProficiency.previousTrainingTypes[].studyStatus" name="languageProficiency.previousTrainingTypes[].studyStatus"/>
                        </div>                        
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="languageProficiency.previousTrainingTypes[].startDate">Training Start Date</label>
                            <input type="text" class="form-control" id="languageProficiency.previousTrainingTypes[].startDate" name="languageProficiency.previousTrainingTypes[].startDate"/>
                        </div>                        
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="languageProficiency.previousTrainingTypes[].endDate">Training End Date</label>                            
                            <input type="text" class="form-control" id="languageProficiency.previousTrainingTypes[].endDate" name="languageProficiency.previousTrainingTypes[].endDate"/>
                        </div> 
                    </div>
                </div>

                <div class="row">                   
                    <div class="col-md-6">
                        <a href="<c:url value="/section-a-2" />" class="btn btn-primary pull-left">Previous</a>
                    </div>

                    <div class="col-md-6">
                        <button type="submit" class="btn btn-primary pull-right">Save and Next</button>
                    </div>
                </div>
            </form>

        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>