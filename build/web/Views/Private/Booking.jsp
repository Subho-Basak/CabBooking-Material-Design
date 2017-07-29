<%-- 
    Document   : Booking
    Created on : Jul 16, 2017, 2:55:43 AM
    Author     : BASAK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.cb.model.User"%>

<%--
    if( null == request.getSession(false) || null == request.getSession(false).getAttribute("account")) {
        response.sendRedirect(request.getContextPath() + "/Views/Login.jsp");
        return;
    }
--%>

<% User user = (User) request.getSession(false).getAttribute("account");%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Booking</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/Styles/Style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/Styles/calendar.css">
        <link rel="stylesheet" href="../../resources/Styles/Account.css">
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700" type="text/css">

        <style type="text/css">
            html {
                font: 500 14px "Helvetica Neue", Helvetica, Arial, sans-serif;
                color: #333;
                height: 100%;
            }

            body {
                height: 100%;
                margin: 0;
            }

            a {
                text-decoration: none;
            }

            ul,
            ol,
            li {
                list-style: none;
                padding: 0;
                margin: 0;
            }

            #demo {
                width: 400px;
                margin: 30px auto;
            }

            p {
                margin: 0;
            }

            input {
                margin: 10px 0;
                height: 28px;
                width: 200px;
                padding: 0 6px;
                border: 1px solid #ccc;
                outline: none;
            }
            #two{
                top:-40% !important;
                left:calc(50% - 170px) !important;
            }
            .pac-item{
                font-family:roboto;
                padding:10px;
                padding-bottom:0;
                font-size: 13px;
                border-top:none;
            }
            .pac-item >span:nth-last-of-type(1){
                display:block;
                margin-left:22px;
                margin-top: -10px;
                color: darkslategray;
                border-bottom: 1px solid #eee;
                text-overflow: ellipsis;
                overflow: hidden;
                height: 30px;
            }
            .pac-item-query{
                font-size:14px;
                font-weight: 500;
            }
            .pac-matched{
                color:gray;
                font-weight: 500;
            }
            .pac-icon{
                background:url(http://cdn.onlinewebfonts.com/svg/img_171095.svg) no-repeat;
                background-position: 0 0;
                margin-top: 10px;
                opacity:0.5;
            }
        </style>
    </head>
    <body bgcolor="#f3f3f3">

        <div class="demo-layout-waterfall mdl-layout mdl-js-layout height-auto">
            <header class="mdl-layout__header mdl-layout__header--scroll private-header">
                <div class="mdl-layout__header-row">
                    <!-- Title -->
                    <span class="mdl-layout-title">Title</span>
                    <!-- Add spacer, to align navigation to the right -->
                    <div class="mdl-layout-spacer"></div>
                    <!-- Navigation -->
                    <nav class="mdl-navigation">
                        <a class="mdl-navigation__link account-group" href=""><i class="material-icons">account_circle</i><span><%= user.getFirstName()%></span>

                            <div class="profile-dropdown">
                                <div class="top-cap"></div>
                                <div class="user-avatar-bg text-center">
                                    <img src="../../Assets/Images/avater.jpg" />
                                </div>
                                <h5>Full Name</h5>
                                <p>email id</p>
                                <div class="profile-dropdown-footer">
                                    <button href="" class="text-link">profile</button>
                                    <button href="" class="text-link">Logout</button>
                                </div>
                            </div>


                        </a>
                    </nav>
                </div>
            </header>
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Title</span>
                <nav class="mdl-navigation">
                    <a class="mdl-navigation__link" href="${pageContext.request.contextPath}/Views/Private/Booking.jsp""><i class="material-icons">assignment</i> Book cab</a>
                    <a class="mdl-navigation__link" href=""><i class="material-icons">show_chart</i> Booking status</a>
                    <a class="mdl-navigation__link" href=""><i class="material-icons">assignment</i> Settings</a>
                    <a class="mdl-navigation__link" href=""><i class="material-icons">history</i> History</a>
                    <hr>
                    <a class="mdl-navigation__link" href=""><i class="material-icons">settings</i> Settings</a>
                    <a class="mdl-navigation__link" href=""><i class="material-icons">feedback</i> Send feedback</a>
                    <a class="mdl-navigation__link" href=""><i class="material-icons">help</i> Help</a>
                </nav>
            </div>
            <main class="mdl-layout__content">
                <div class="page-content">

                    <section class="mdl-grid booking-banner">
                        <div class="mdl-grid"> 
                            <div class="mdl-cell mdl-cell--12-col text-center stepper">
                                <p class="step-name">Step one</p>
                                <a class="active"></a> <a></a> <a></a>
                            </div>
                        </div>

                        <div class="booking-stepper">
                            <div class="spinner-wrapper"><div class="mdl-spinner mdl-js-spinner is-active"></div></div>

                            <fieldset>
                                <div class="mdl-grid">
                                    <div class="mdl-cell mdl-cell--3-col ">
                                        <h6 class="stepper-heading">Location</h6>
                                    </div>
                                    <div class="mdl-cell mdl-cell--4-col pad_rt">
                                        <h6 class="stepper-subheading">Select start location</h6>
                                        <div class="mdl-textfield mdl-js-textfield">
                                            <input class="mdl-textfield__input placepicker" type="text" id="origin-input" placeholder="Pick location">
                                            <label class="mdl-textfield__label" for="pick-loc"></label>
                                        </div>
                                        <div id="collapseOne" class="collapse">
                                            <div class="placepicker-map thumbnail"></div>
                                        </div>

                                        <a class="text-link " target="_blanck" href="ShowRoute.jsp">View route</a>

                                    </div>
                                    <div class="mdl-cell mdl-cell--1-col v_bar">
                                        <button class="mdl-button mdl-js-button mdl-button--fab" onclick="swapLocation();">
                                            <i class="material-icons">swap_horiz</i>
                                        </button>
                                    </div>
                                    <div class="mdl-cell mdl-cell--4-col pad_lt">
                                        <h6 class="stepper-subheading">Select drop location</h6>
                                        <div class="mdl-textfield mdl-js-textfield">
                                            <input class="mdl-textfield__input placepicker" type="text" id="destination-input" placeholder="Pick location">
                                            <label class="mdl-textfield__label" for="destination-input"></label>
                                        </div>


                                    </div>
                                </div>

                                <div class="mdl-grid">
                                    <div class="mdl-cell mdl-cell--3-col ">
                                        <h6 class="stepper-heading">Date</h6>
                                    </div>
                                    <div class="mdl-cell mdl-cell--2-col">
                                        <h6 class="stepper-subheading">Set journey date:</h6>
                                    </div>
                                    <div class="mdl-cell mdl-cell--2-col">
                                        <span class="date" id="date">Not set</span>
                                        <button class="calendar-btn">
                                            <i class="material-icons" id="dt">today</i>
                                        </button>


                                        <div id="two"></div>
                                    </div>
                                </div>

                                <div class="mdl-grid">
                                    <div class="mdl-cell mdl-cell--3-col ">
                                        <h6 class="stepper-heading">Time</h6>
                                    </div>
                                    <div class="mdl-cell mdl-cell--2-col">
                                        <h6 class="stepper-subheading">Set pickup time:</h6>
                                    </div>
                                    <div class="mdl-cell mdl-cell--1-col">
                                        <div class="md-select time-select">
                                            <label for="hour"><button type="button" class="ng-binding" id="hr">00</button></label>
                                            <ul role="listbox" id="hour" class="md-whiteframe-z1" aria-activedescendant="state2_AK" name="ul-id">
                                                <li role="option" id="state2_AK" class="ng-binding ng-scope active" tabindex="-1" aria-selected="true">01</li>
                                                <li role="option" id="state2_AL" class="ng-binding ng-scope" tabindex="-1" aria-selected="false">02</li>
                                                <li role="option" id="state2_AR" class="ng-binding ng-scope" tabindex="-1" aria-selected="false">03</li>
                                                <li role="option" id="state2_AS" class="ng-binding ng-scope" tabindex="-1" aria-selected="false">04</li>
                                            </ul>       
                                        </div>
                                        <span>:</span>
                                    </div>
                                    <div class="mdl-cell mdl-cell--1-col">
                                        <div class="md-select time-select">
                                            <label for="min"><button type="button" class="ng-binding" id="min">00</button></label>
                                            <ul role="listbox" id="min" class="md-whiteframe-z1" aria-activedescendant="state2_AK" name="ul-id">
                                                <li role="option" id="state2_AK" class="ng-binding ng-scope active" tabindex="-1" aria-selected="true">01</li>
                                                <li role="option" id="state2_AL" class="ng-binding ng-scope" tabindex="-1" aria-selected="false">02</li>
                                                <li role="option" id="state2_AR" class="ng-binding ng-scope" tabindex="-1" aria-selected="false">03</li>
                                                <li role="option" id="state2_AS" class="ng-binding ng-scope" tabindex="-1" aria-selected="false">04</li>
                                            </ul>

                                        </div>
                                    </div>
                                    <div class="mdl-cell mdl-cell--1-col">
                                        <div class="md-select time-select">
                                            <label for="ul-id"><button type="button" class="ng-binding" id="format">AM</button></label>
                                            <ul role="listbox" id="ul-id" class="md-whiteframe-z1" aria-activedescendant="state2_AK" name="ul-id">
                                                <li role="option" id="state2_AK" class="ng-binding ng-scope active" tabindex="-1" aria-selected="true">AM</li>
                                                <li role="option" id="state2_AL" class="ng-binding ng-scope" tabindex="-1" aria-selected="false">PM</li>
                                            </ul>

                                        </div>
                                    </div>

                                </div>

                                <div class="mdl-grid">
                                    <div class="mdl-cell mdl-cell--12-col text-right">
                                        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-js-ripple-effect" onclick="goToNext(this);">
                                            next
                                        </button>
                                    </div>
                                </div>
                            </fieldset>
                            <fieldset>
                                <div class="mdl-grid">
                                    <div class="mdl-cell mdl-cell--3-col ">
                                        <h6 class="stepper-heading">Filter</h6>
                                        <div class="filter-tag">

                                        </div>
                                        <h6 class="stepper-subheading">Type</h6>
                                        <div class="filter-tag">
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" >
                                                <span class="mdl-checkbox__label">Prime</span>
                                            </label>

                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" >
                                                <span class="mdl-checkbox__label">Sedan</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" >
                                                <span class="mdl-checkbox__label">Luxury</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" >
                                                <span class="mdl-checkbox__label">Royal</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" >
                                                <span class="mdl-checkbox__label">Zeep</span>
                                            </label>
                                        </div>
                                        <h6 class="stepper-subheading">Model</h6>
                                        <div class="filter-tag">
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Prime</span>
                                            </label>

                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Sedan</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Luxury</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Royal</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Zeep</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Prime</span>
                                            </label>

                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Sedan</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Luxury</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Royal</span>
                                            </label>
                                            <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="checkbox-1">
                                                <input type="checkbox" id="checkbox-1" class="mdl-checkbox__input" checked>
                                                <span class="mdl-checkbox__label">Zeep</span>
                                            </label>
                                        </div>
                                    </div>

                                    <div class="mdl-cell mdl-cell--9-col">
                                        <h6 class="stepper-subheading">Select your car</h6>
                                        <div class="card-component-wrapper">
                                            
                                        </div>



                                        <ul class="demo-list-icon mdl-list" id="car">
                                            <!--<li class="mdl-list__item">-->
                                            <!--<span class="mdl-list__item-primary-content">-->
                                            <!--<img src="" class="mdl-list__item-icon" />-->
                                            <!--Bryan Cranston-->
                                            <!--</span>-->
                                            <!--</li>-->
                                        </ul>
                                    </div>


                                </div>


                                <div class="mdl-grid">
                                    <div class="mdl-cell mdl-cell--12-col text-right">
                                        <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect">
                                            previous
                                        </button>
                                        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-js-ripple-effect" onclick="goToNext(this);">
                                            next
                                        </button>
                                    </div>
                                </div>
                            </fieldset>
                            <fieldset>
                                <div class="mdl-grid">
                                    <div class="mdl-cell mdl-cell--6-col ">
                                        <h6 class="stepper-heading">Booking summary</h6>
                                        <div>
                                            <h5>User Name</h5>
                                            <p> +91 - 8583866670</p>
                                            <br>
                                            <p class="pay-heading">Pickup location</p>
                                            <p>123 6th St. Melbourne, FL 32904</p>
                                            <p class="pay-heading">Drop location</p>
                                            <p>123 6th St. Melbourne, FL 32904</p>
                                            <hr>
                                            <p class="pay-heading">Distance <span class="pay-data">25 KM</span></p>
                                            <p class="pay-heading">Estimated time <span class="pay-data">1 hr 12 min</span></p>
                                            <div class="mdl-cell mdl-cell--6-col"><i class="material-icons">today</i> 12 Jul 2017</div>

                                            <hr>
                                            <p class="pay-heading">Base fare <span class="pay-data">25</span></p>
                                            <p class="pay-heading">Distance fare <span class="pay-data">352</span></p>
                                            <p class="pay-heading">Other charges <span class="pay-data">35</span></p>
                                            <hr>
                                            <h5>Subtotal <span class="pay-data">412</span></h5>
                                        </div>
                                    </div>
                                    <div class="mdl-cell mdl-cell--1-col v_bar">

                                    </div>
                                    <div class="mdl-cell mdl-cell--5-col pad_lt">
                                        <h6 class="stepper-heading">Payment mode</h6>
                                        <div class="payment-mode-section text-center">
                                            <h1><i class="material-icons car-icon">directions_car</i></h1>
                                            <h5>Please select your payment mode</h5>

                                            <div>
                                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="option-1">
                                                    <input type="radio" id="option-1" class="mdl-radio__button" name="options" value="1" checked>
                                                    <span class="mdl-radio__label">Credit/Debit</span>
                                                </label>

                                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="option-1">
                                                    <input type="radio" id="option-1" class="mdl-radio__button" name="options" value="1" checked>
                                                    <span class="mdl-radio__label">Net Banking</span>
                                                </label>

                                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="option-1">
                                                    <input type="radio" id="option-1" class="mdl-radio__button" name="options" value="1" checked>
                                                    <span class="mdl-radio__label">Cash</span>
                                                </label>

                                            </div>
                                        </div>

                                    </div>

                                </div>


                                <div class="mdl-grid">
                                    <div class="mdl-cell mdl-cell--12-col text-right">
                                        <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect">
                                            previous
                                        </button>
                                        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-js-ripple-effect" onclick="goToNext(this);">
                                            next
                                        </button>
                                    </div>
                                </div>
                            </fieldset>
                        </div>
                    </section>

                    <footer class="mdl-mega-footer">
                        <div class="mdl-mega-footer__middle-section">

                            <div class="mdl-mega-footer__drop-down-section">
                                <input class="mdl-mega-footer__heading-checkbox" type="checkbox" checked>
                                <h1 class="mdl-mega-footer__heading">Features</h1>
                                <ul class="mdl-mega-footer__link-list">
                                    <li><a href="#">About</a></li>
                                    <li><a href="#">Terms</a></li>
                                    <li><a href="#">Partners</a></li>
                                    <li><a href="#">Updates</a></li>
                                </ul>
                            </div>

                            <div class="mdl-mega-footer__drop-down-section">
                                <input class="mdl-mega-footer__heading-checkbox" type="checkbox" checked>
                                <h1 class="mdl-mega-footer__heading">Details</h1>
                                <ul class="mdl-mega-footer__link-list">
                                    <li><a href="#">Specs</a></li>
                                    <li><a href="#">Tools</a></li>
                                    <li><a href="#">Resources</a></li>
                                </ul>
                            </div>

                            <div class="mdl-mega-footer__drop-down-section">
                                <input class="mdl-mega-footer__heading-checkbox" type="checkbox" checked>
                                <h1 class="mdl-mega-footer__heading">Technology</h1>
                                <ul class="mdl-mega-footer__link-list">
                                    <li><a href="#">How it works</a></li>
                                    <li><a href="#">Patterns</a></li>
                                    <li><a href="#">Usage</a></li>
                                    <li><a href="#">Products</a></li>
                                    <li><a href="#">Contracts</a></li>
                                </ul>
                            </div>

                            <div class="mdl-mega-footer__drop-down-section">
                                <input class="mdl-mega-footer__heading-checkbox" type="checkbox" checked>
                                <h1 class="mdl-mega-footer__heading">FAQ</h1>
                                <ul class="mdl-mega-footer__link-list">
                                    <li><a href="#">Questions</a></li>
                                    <li><a href="#">Answers</a></li>
                                    <li><a href="#">Contact us</a></li>
                                </ul>
                            </div>

                        </div>

                        <div class="mdl-mega-footer__bottom-section">
                            <div class="mdl-logo">Title</div>
                            <ul class="mdl-mega-footer__link-list fl-left">
                                <li><a href="#">Help</a></li>
                                <li><a href="Terms.html">Privacy & Terms</a></li>
                            </ul>

                            <ul class="mdl-mega-footer__link-list fl-right">
                                <li><div class="mdl-logo">Follow us</div></li>
                                <li><i class="fa fa-facebook-square" aria-hidden="true"></i></li>
                                <li><i class="fa fa-google-plus" aria-hidden="true"></i></li>
                                <li><i class="fa fa-twitter" aria-hidden="true"></i></li>
                                <li><i class="fa fa-youtube-play" aria-hidden="true"></i></li>
                            </ul>
                        </div>

                    </footer>
                </div>
            </main>

        </div>





        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
        <script src="https://cdn.bootcss.com/jquery/1.9.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.17.1/moment.min.js"></script>
        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAMBupiuW1wy6k2rX_WbbKgpsAahf7HFIQ&sensor=true&language=en&libraries=places"></script>
        <script src="https://www.jqueryscript.net/demo/jQuery-Location-Autocomplete-with-Google-Maps-Places-Library-Placepicker/src/js/jquery.placepicker.js"></script>

        <script src="../../resources/Scripts/basic-utility.js"></script>
        <script src="../../resources/Scripts/data.js"></script>
        <script src="../../resources/Scripts/calendar.js"></script>

        <script>
                                            var now = new Date();
                                            var year = now.getFullYear();
                                            var month = now.getMonth() + 1;
                                            var date = now.getDate();
                                            var data = [{
                                                    date: year + '-' + month + '-' + (date - 1),
                                                    value: 'hello'
                                                }, {
                                                    date: year + '-' + month + '-' + date,
                                                    value: '上班'
                                                }, {
                                                    date: new Date(year, month - 1, date + 1),
                                                    value: '吃饭睡觉打豆豆'
                                                }, {
                                                    date: '2016-10-31',
                                                    value: '2016-10-31'
                                                }];
                                            // picker
                                            $('#two').calendar({
                                                trigger: '#dt',
                                                width: 340,
                                                height: 340,
                                                next: '<i class="material-icons">keyboard_arrow_right</i>',
                                                prev: '<i class="material-icons">keyboard_arrow_left</i>',
                                                offset: [0, 1],
                                                zIndex: 999,
                                                format: 'dd/mm/yyyy',
                                                weekArray: ['S', 'M', 'T', 'W', 'T', 'F', 'S'],
                                                data: data,
                                                onSelected: function (view, date, data) {
                                                    console.log('event: onSelected');
                                                    date = moment(date).format("DD MMM YYYY")
                                                    //alert('date:' + date);
                                                    $('.date').text(date);
                                                },
                                                onClose: function (view, date, data) {
                                                    console.log('event: onClose')
                                                    console.log('view:' + view)
                                                    console.log('date:' + date)
                                                    console.log('data:' + (data || '无'));
                                                }
                                            });
                                            $(document).ready(function () {

                                                $.ajax({
                                                    url: '${pageContext.request.contextPath}/Car.do',
                                                    type: "GET",
                                                    success: function (response) {
                                                        populateList(response);
                                                    },
                                                    error: function (response, error) {
                                                        alert(error);
                                                    }
                                                })


                                                $(".placepicker").each(function () {

                                                    // find map-element
                                                    var target = this;
                                                    var $collapse = $(this).parents('.form-group').next('.collapse');
                                                    var $map = $collapse.find('.placepicker-map');

                                                    // init placepicker
                                                    var placepicker = $(this).placepicker({
                                                        map: $map.get(0)
                                                    }).data('placepicker');

                                                    // reload map after collapse in
                                                    $collapse.on('show.bs.collapse', function () {

                                                        window.setTimeout(function () {
                                                            if (!$(target).prop('value')) {
                                                                placepicker.geoLocation();
                                                            }
                                                        }, 0);
                                                    });
                                                });
                                            });
                                            function populateList(cars) {
                                                var card_wrapper = document.querySelector(".card-component-wrapper");
                                                [].forEach.call(cars, function (_car) {


                                                    var _mdl_card = document.createElement('div');
                                                    _mdl_card.className = "demo-card-wide mdl-card mdl-shadow--2dp car-card";

                                                    var _mdl_card_text = document.createElement('div');
                                                    _mdl_card_text.className = "mdl-card__title";
                                                    var _img = document.createElement('img');
                                                    _img.src = _car.carImageURI;
                                                    _mdl_card_text.appendChild(_img);
                                                    _mdl_card.appendChild(_mdl_card_text);

                                                    var _mdl_card_inner = document.createElement('div');
                                                    _mdl_card_inner.className = "mdl-card__supporting-text";
                                                    var _heading = document.createElement('h6');
                                                    _heading.className = "stepper-subheading";
                                                    _heading.innerText = _car.carName;
                                                    _mdl_card_inner.innerText = _car.carModel;
                                                    _mdl_card_inner.prepend(_heading);
                                                    _mdl_card.appendChild(_mdl_card_inner);

                                                    var _mdl_card_action = document.createElement('div');
                                                    _mdl_card_action.className = "mdl-card__actions mdl-card--border";
                                                    var _a = document.createElement('a');
                                                    _a.className = "mdl-button  mdl-js-button mdl-js-ripple-effect";
                                                    _a.innerText = "Select";
                                                    _mdl_card_action.appendChild(_a);
                                                    _mdl_card.appendChild(_mdl_card_action);


                                                    card_wrapper.appendChild(_mdl_card);
                                                });
                                            }


        </script>
    </body>
</html>