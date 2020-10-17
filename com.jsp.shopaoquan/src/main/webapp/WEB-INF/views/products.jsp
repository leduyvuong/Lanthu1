<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>
<%@include file="head" %>
</head>
<body>
	<!------------header------------------>
    <%@include file="header" %>

    <!------------feature categories------------------>
    <div class="small-container">
        <div class="row row-2">
            <h2>All Products</h2>
            <select name="" id="">
                <option value="">Defaut Shorting</option>
                <option value=""><a href="product/sortPrice">Short by price</a></option>
                <option value="">Short by popularity</option>
                <option value="">Short by rating</option>
                <option value="">Short by sale</option>
            </select>
        </div>
        <div class="row">
        <c:forEach var ="a" items="${list }">
        
            <div class="col-4">
                <a href="product-details.html">
                    <img src='<c:url value="/resources/img/products/${a.getImg_Prd() }" ></c:url>' alt="">
                    <h4>${a.getName_Prd() }</h4>
                    <div class="rating">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half"></i>
                    </div>
                    <p><fmt:formatNumber value="${a.getPrice_Prd() }" type="currency"/></p>
                </a>
            </div>
             
           </c:forEach>
           </div>
       
    <div class="page-btn">
        <span>1</span>
        <span>2</span>
        <span>3</span>
        <span>4</span>
        <span>&#8594</span>
    </div>
    </div>
    <!------------feature categories------------------>

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
</body>
</html>