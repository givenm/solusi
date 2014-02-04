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
            <form action="<c:url value="/saveSectionAOne"/>" class="form-horizontal" role="form" method="POST"> 
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="text-danger section-master-heading">Section A 1</h1>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <h4 class="text-primary section-child-heading">Personal Details</h4>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="firstname">Firstname</label>
                            <input type="text" class="form-control" id="firstname"/>
                        </div>

                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="middlename">Middle name</label>
                            <input type="text" class="form-control" id="middlename" />
                        </div>                        
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="lastname">Lastname</label>
                            <input type="text" class="form-control" id="lastname"/>
                        </div> 
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="maritalStatus">Marital Status</label> 
                            <div class="form-control">
                                Single <input class="marital-status-radios-separator" type="radio" value="Single" name="maritalStatus"/>
                                Married <input class="marital-status-radios-separator" type="radio" value="Married" name="maritalStatus"/>
                                Other <input class="marital-status-radios-separator" type="radio" value="Other" name="maritalStatus"/> 
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="lastname">Date of Birth</label>

                            <div class="row">
                                <div class="col-md-3">
                                    <select class="form-control" id="day" style="padding-right: 2px;">
                                        <option>Day</option>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                        <option>6</option>
                                        <option>7</option>
                                        <option>8</option>
                                        <option>9</option>
                                        <option>10</option>
                                        <option>11</option>
                                        <option>12</option>
                                        <option>13</option>
                                        <option>14</option>
                                        <option>15</option>
                                        <option>16</option>
                                        <option>17</option>
                                        <option>18</option>
                                        <option>19</option>
                                        <option>20</option>
                                        <option>21</option>
                                        <option>22</option>
                                        <option>23</option>
                                        <option>24</option>
                                        <option>25</option>
                                        <option>26</option>
                                        <option>27</option>
                                        <option>28</option>
                                        <option>29</option>
                                        <option>30</option>
                                        <option>31</option>
                                    </select>
                                </div>
                                <div class="col-md-5">
                                    <select class="form-control" id="month">
                                        <option>Month</option>
                                        <option>January</option>
                                        <option>February</option>
                                        <option>March</option>
                                        <option>April</option>
                                        <option>May</option>
                                        <option>June</option>
                                        <option>July</option>
                                        <option>August</option>
                                        <option>September</option>
                                        <option>October</option>
                                        <option>November</option>
                                        <option>December</option>
                                    </select>
                                </div>
                                <div class="col-md-4">
                                    <select class="form-control" id="year">
                                        <option>Year</option>
                                        <option>2001</option>
                                        <option>2002</option>
                                        <option>2003</option>
                                        <option>2004</option>
                                    </select>
                                </div>
                                <input type="hidden" id="dateOfBirth" value="" name="dateOfBirth"/>
                            </div>
                        </div>                       
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="gender">Marital Status</label> 
                            <div class="form-control">
                                Male <input class="marital-status-radios-separator" type="radio" value="Male" name="gender"/>
                                Female <input class="marital-status-radios-separator" type="radio" value="Female" name="gender"/>
                            </div>
                        </div> 
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 form-column">
                        <div class="form-group ">
                            <label for="religion">Religion</label>
                            <input type="text" class="form-control" id="religion" name="religion"/>
                        </div>
                    </div>



                    <div class="col-md-4 form-column">
                        <div class="form-group ">
                            <label for="dinomination">Dinomination</label>
                            <input type="text" class="form-control" id="dinomination" name="dinomination"/>
                        </div>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-12">
                        <h4 class="text-primary section-child-heading">Contact Details</h4>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="title">Title</label>
                            <select class="form-control" id="title">
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
                            <label for="name">Contact Name</label>
                            <input type="text" class="form-control" id="name" name="name"/>
                        </div>                        
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="cellNumber">Cell Number</label>
                            <input type="text" class="form-control" id="cellNumber" name="cellNumber"/>
                        </div> 
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="text" class="form-control" id="email" name="email"/>
                        </div>  
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="telephone">Telephone</label>
                            <input type="text" class="form-control" id="telephone" name="telephone"/>
                        </div>
                    </div>

                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="houseNumber">House Number</label>
                            <input type="text" class="form-control" id="houseNumber" name="houseNumber"/>
                        </div>  
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="street">Street</label>
                            <input type="text" class="form-control" id="street" name="street"/>
                        </div>
                    </div>

                    <div class="col-md-4 form-column">
                        <div class="form-group">
                            <label for="town">Town</label>
                            <input type="text" class="form-control" id="town" name="town"/>
                        </div> 
                    </div>

                    <div class="col-md-4 form-column ">
                        <div class="form-group">
                            <label for="country">Country</label>
                            <input type="text" class="form-control" id="country" name="country"/>
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

        <%@include file="footer.jsp" %>
    </body>
</html>
