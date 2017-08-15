<%-- 
    Document   : UserHome
    Created on : Jul 9, 2017, 1:59:05 AM
    Author     : BASAK
--%>

<%@page import="com.cb.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    if( null == request.getSession(false) || null == request.getSession(false).getAttribute("account")) {
        response.sendRedirect(request.getContextPath() + "/Views/Login.jsp");
        return;
    }
%>

<% User user = (User) request.getSession(false).getAttribute("account"); %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Profile</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
  <link rel="stylesheet" href="../../resources/Styles/Style.css">
  <link rel="stylesheet" href="../../resources/Styles/Account.css">
  
  <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700" type="text/css">
</head>
<body bgcolor="#f1f1f1">
<div class="mdl-layout mdl-js-layout">
  <%@include file="../../WEB-INF/private/Layout/postloginheader.jspf" %>
  <main class="mdl-layout__content">
    <div class="page-content"><!-- Your content goes here -->
      <section class="mdl-grid profile-info">

          <div class="mdl-cell mdl-cell--6-col">
            <h5 class="site-subheading">Personal info</h5>
          </div>
          <div class="mdl-cell mdl-cell--6-col text-right">
            <h5><i class="material-icons">mode_edit</i></h5>
          </div>
          <hr>
        <div class="mdl-cell mdl-cell--4-col">
          <strong>Name</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
            <p><%= user.getFirstName() + " " + user.getLastName() %></p>
        </div>

        <div class="mdl-cell mdl-cell--4-col">
          <strong>Email</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
            <p><%= user.getEmail() %></p>
        </div>

        <div class="mdl-cell mdl-cell--4-col">
          <strong>Birthday</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <p>Not set</p>
        </div>

        <div class="mdl-cell mdl-cell--4-col">
          <strong>Gender</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <p>Not set</p>
        </div>

        <div class="mdl-cell mdl-cell--4-col">
          <strong>Nationality</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <p>Not set</p>
        </div>

        <div class="mdl-cell mdl-cell--4-col">
          <strong>Photo</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <img src="../../Assets/Images/avater.jpg" />
        </div>

      </section>

      <section class="mdl-grid profile-info">

        <div class="mdl-cell mdl-cell--6-col">
          <h5 class="site-subheading">Contact info</h5>
        </div>
        <div class="mdl-cell mdl-cell--6-col text-right">
          <h5><i class="material-icons">mode_edit</i></h5>
        </div>
        <hr>
        <div class="mdl-cell mdl-cell--4-col">
          <strong>Address</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <p><%= user.getAddress() !=null && !user.getAddress().isEmpty() ? user.getAddress() : "Not set" %></p>
        </div>

        <div class="mdl-cell mdl-cell--4-col">
          <strong>Contact</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <p><%= user.getContact()!=null && !user.getContact().isEmpty() ? user.getContact(): "Not set" %></p>
        </div>

        <div class="mdl-cell mdl-cell--4-col">
          <strong>Country</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <p><%= user.getCountry()!=null && !user.getCountry().isEmpty() ? user.getCountry(): "Not set" %></p>
        </div>

        <div class="mdl-cell mdl-cell--4-col">
          <strong>State</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <p>Not set</p>
        </div>

      </section>

      <section class="mdl-grid profile-info">

        <div class="mdl-cell mdl-cell--6-col">
          <h5 class="site-subheading">Security</h5>
        </div>
        <div class="mdl-cell mdl-cell--6-col text-right">
          <h5><i class="material-icons">mode_edit</i></h5>
        </div>
        <hr>
        <div class="mdl-cell mdl-cell--4-col">
          <strong>Password</strong>
        </div>
        <div class="mdl-cell mdl-cell--8-col">
          <a href="" class="text-link">Change</a>
        </div>



      </section>
    </div>
  </main>
</div>




<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
<script src="https://cdn.bootcss.com/jquery/1.9.0/jquery.min.js"></script>
</body>
</html>