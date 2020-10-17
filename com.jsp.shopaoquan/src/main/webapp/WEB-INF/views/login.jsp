<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	
   <%@include file="head" %>
</head>
<body>
<!------------header------------------>
     <%@include file="header" %>
<!----Login page----->
<div class="account-page">
    <div class="container">
        <div class="row">
            <div class="col-2">
                <img src='<c:url value="/resources/img/frontend/1.png" ></c:url>' alt="" width="100%" height="100%">
            </div>
            <div class="col-2">
                <div class="form-container">
                    <div class="form-btn">
                        <span onclick="login()">Login</span>
                        <span onclick="register()">Register</span>
                        <hr id="Indicator">
                    </div>
                    <form id="LoginForm">
                        <input type=" text " placeholder="Username ">
                        <input type="password " placeholder="Password ">
                        <input type="checkbox" class="checkBox">Remember Session</input>
                        <button type="submit " class="btn ">Login</button>
                        <a href=" ">Forgot Password</a>
                    </form>
                    <form id="RegForm">
                        <input type="text" placeholder="Username ">
                        <input type="email" placeholder="Email ">
                        <input type="password " placeholder="Password ">
                        <button type="submit " class="btn ">Register</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!----footer----->
<%@include file="footer" %>
<!----js for MenuToggle()----->
 <script>
        var MenuItems = document.getElementById("MenuItems");
        MenuItems.style.maxHeight = "0px";

        function menuToggle() {
            if (MenuItems.style.maxHeight == "0px") {
                MenuItems.style.maxHeight = "200px";
            } else {
                MenuItems.style.maxHeight = "0px";
            }
        }
    </script>
<!----js for toggle Form----->
<script>
    var LoginForm = document.getElementById("LoginForm");
    var RegForm = document.getElementById("RegForm");
    var Indicator = document.getElementById("Indicator");

    function login() {
        RegForm.style.transform = "translateX(300px)";
        LoginForm.style.transform = "translateX(300px)";
        Indicator.style.transform = "translateX(0px)";
    }

    function register() {
        RegForm.style.transform = "translateX(0px)";
        LoginForm.style.transform = "translateX(0px)";
        Indicator.style.transform = "translateX(100px)";
    }
</script>
</body>
</html>