<%-- 
    Document   : Login
    Created on : Jul 8, 2017, 5:15:44 PM
    Author     : BASAK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Login</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
  <link rel="stylesheet" href="../resources/Styles/Style.css">
  <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700" type="text/css">
</head>
<body bgcolor="#ececec">
<div class="demo-layout-waterfall mdl-layout mdl-js-layout">
  <main class="mdl-layout__content">
    <div class="page-content">
      <div class="mdl-grid login-grid">
        <div class="mdl-cell mdl-cell--4-col">
          <div class="mdl-grid login-panel">
            <div class="mdl-cell mdl-cell--12-col">
              <h4>Sign in with your account</h4>
            </div>
            <div class="mdl-cell mdl-cell--10-col">
              <p>Please remember my password next time</p>
            </div>
            <div class="mdl-cell mdl-cell--2-col text-right">
              <label class="mdl-switch mdl-js-switch mdl-js-ripple-effect" for="switch-1">
                <input type="checkbox" id="switch-1" class="mdl-switch__input" checked>
                <span class="mdl-switch__label"></span>
              </label>
            </div>
            <div class="mdl-cell mdl-cell--12-col">
              <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <input class="mdl-textfield__input required email" type="text" id="userid" onkeypress="resetError(this)" onchange="resetError(this)">
                <label class="mdl-textfield__label" for="userid">Email</label>
              </div>
              <span class="error-msg">Please enter a valid email</span>
            </div>
            <div class="mdl-cell mdl-cell--12-col">
              <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <input class="mdl-textfield__input required" type="text" id="passwd" onkeypress="resetError(this)" onchange="resetError(this)">
                <label class="mdl-textfield__label" for="passwd">Password</label>
              </div>
              <span class="error-msg">Please enter a valid password</span>
            </div>
            <div class="mdl-cell mdl-cell--6-col">
              <a href="#" class="text-link">Forgot password?</a>
            </div>
            <div class="mdl-cell mdl-cell--6-col text-right">
              <button class="mdl-button mdl-js-button  mdl-button--raised mdl-js-ripple-effect  mdl-button--colored"  id="signin">
                LOGIN
              </button>
            </div>
            <div class="mdl-cell mdl-cell--12-col">
              <p>Doesn't have an account? <a href="#" class="text-link">Create one</a></p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </main>
</div>


<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
<script src="../resources/Scripts/jquery-2.1.1.js"></script>
<script  src="../resources/Scripts/validation.js"></script>
<script>
    $(document).ready( function() {
        $('#signin').click( function() {
            if(validateLoginForm()){
                $.ajax({
                    url: '${pageContext.request.contextPath}/session/login.do',
                    type: 'POST',
                    data: {
                        userid: $('#userid').val(),
                        passwd: $('#passwd').val(),
                        remember: $('#switch-1').is(':checked')
                    },

                    success: function(response) {
                        if(response === true || response === 'true') {
                            window.location.href = '${pageContext.request.contextPath}/Views/Private/UserHome.jsp';
                        }
                    },
                    error: function(response, error) {
                        alert(error + ": " + response);
                    }   
                });
            }
        });
       
    });
</script>

</body>
</html>