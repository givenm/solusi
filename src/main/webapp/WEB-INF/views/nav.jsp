<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Static navbar -->
<div class="navbar navbar-default navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value="/"/>">Solusi University Online Registration demo</a>
        </div>  
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">     
            <ul class="nav navbar-nav navbar-right" >
                <li class="conycto-active">
                    <a href="<c:url value="/users"/>" >Users</a>                    
                </li>
                                    
            </ul>
        </div>
    </div>
</div>