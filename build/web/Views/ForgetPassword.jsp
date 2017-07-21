<%-- 
    Document   : ForgetPassword
    Created on : Jul 20, 2017, 3:57:02 AM
    Author     : BASAK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forget Password</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <link rel="stylesheet" href="../resources/Styles/Style.css">
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700" type="text/css">
    </head>
    <body>
        <div class="demo-layout-waterfall mdl-layout mdl-js-layout">
            <main class="mdl-layout__content">
                <div class="page-content">
                    <section class="mdl-grid tariff-banner">
                        <div class="mdl-cell mdl-cell--8-col ">
                            <h2 class="section-component-heading">Recover your password</h2>
                            <p class="section-para">Please enter your primary email address that you have with <b>site name</b>.</p>
                            <p class="section-para">We will then send you an email with unique link to change your password.</p>


                            <div class="mdl-cell mdl-cell--6-col ">
                                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                    <input class="mdl-textfield__input required" type="text" id="passwd" onkeypress="resetError(this)" onchange="resetError(this)">
                                    <label class="mdl-textfield__label" for="passwd">Email</label>
                                </div>
                            </div>

                            <button class="mdl-button mdl-js-button  mdl-button--raised mdl-js-ripple-effect  mdl-button--colored"  id="signin">
                                send password recovery link
                            </button>
                        </div>
                        <div class="mdl-cell mdl-cell--4-col forget-icon-bg">
                            <h1>
                                <i class="material-icons">lock</i>
                            </h1>

                        </div>
                    </section>
                </div>
            </main>
        </div>


        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    </body>
</html>
