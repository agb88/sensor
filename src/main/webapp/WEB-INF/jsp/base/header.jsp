<%--
  Created by AlexBal 18.07.2018
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<header class="header">
    <div class="navigation-trigger hidden-xl-up" data-sa-action="aside-open" data-sa-target=".sidebar">
        <i class="zmdi zmdi-menu"></i>
    </div>

    <div class="logo hidden-sm-down">
        <h1><a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html">Super Admin 2.0</a></h1>
    </div>

    <form class="search">
        <div class="search__inner">
            <input type="text" class="search__text" placeholder="Search for people, files, documents...">
            <i class="zmdi zmdi-search search__helper" data-sa-action="search-close"></i>
        </div>
    </form>

    <ul class="top-nav">
        <li class="hidden-xl-up"><a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                                    data-sa-action="search-open"><i class="zmdi zmdi-search"></i></a></li>

        <li class="dropdown">
            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" data-toggle="dropdown"
               class="top-nav__notify"><i class="zmdi zmdi-email"></i></a>
            <div class="dropdown-menu dropdown-menu-right dropdown-menu--block">
                <div class="dropdown-header">
                    Messages

                    <div class="actions">
                        <a href="http://byrushan.com/projects/super-admin/app/2.1.2/messages.html"
                           class="actions__item zmdi zmdi-plus"></a>
                    </div>
                </div>

                <div class="listview listview--hover">
                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <img src="./Super Admin 2.0_files/1.jpg" class="listview__img" alt="">

                        <div class="listview__content">
                            <div class="listview__heading">
                                David Belle
                                <small>12:01 PM</small>
                            </div>
                            <p>Cum sociis natoque penatibus et magnis dis parturient montes</p>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <img src="./Super Admin 2.0_files/2.jpg" class="listview__img" alt="">

                        <div class="listview__content">
                            <div class="listview__heading">
                                Jonathan Morris
                                <small>02:45 PM</small>
                            </div>
                            <p>Nunc quis diam diamurabitur at dolor elementum, dictum turpis vel</p>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <img src="./Super Admin 2.0_files/3.jpg" class="listview__img" alt="">

                        <div class="listview__content">
                            <div class="listview__heading">
                                Fredric Mitchell Jr.
                                <small>08:21 PM</small>
                            </div>
                            <p>Phasellus a ante et est ornare accumsan at vel magnauis blandit turpis at augue
                                ultricies</p>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <img src="./Super Admin 2.0_files/4.jpg" class="listview__img" alt="">

                        <div class="listview__content">
                            <div class="listview__heading">
                                Glenn Jecobs
                                <small>08:43 PM</small>
                            </div>
                            <p>Ut vitae lacus sem ellentesque maximus, nunc sit amet varius dignissim, dui est
                                consectetur neque</p>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <img src="./Super Admin 2.0_files/5.jpg" class="listview__img" alt="">

                        <div class="listview__content">
                            <div class="listview__heading">
                                Bill Phillips
                                <small>11:32 PM</small>
                            </div>
                            <p>Proin laoreet commodo eros id faucibus. Donec ligula quam, imperdiet vel ante
                                placerat</p>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="view-more">View
                        all messages</a>
                </div>
            </div>
        </li>

        <li class="dropdown top-nav__notifications">
            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" data-toggle="dropdown"
               class="top-nav__notify">
                <i class="zmdi zmdi-notifications"></i>
            </a>
            <div class="dropdown-menu dropdown-menu-right dropdown-menu--block">
                <div class="dropdown-header">
                    Notifications

                    <div class="actions">
                        <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                           class="actions__item zmdi zmdi-check-all" data-sa-action="notifications-clear"></a>
                    </div>
                </div>

                <div class="listview listview--hover">
                    <div class="scroll-wrapper listview__scroll scrollbar-inner" style="position: relative;">
                        <div class="listview__scroll scrollbar-inner scroll-content"
                             style="height: 350px; margin-bottom: 0px; margin-right: 0px; max-height: none;">
                            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                               class="listview__item">
                                <img src="./Super Admin 2.0_files/1.jpg" class="listview__img" alt="">

                                <div class="listview__content">
                                    <div class="listview__heading">David Belle</div>
                                    <p>Cum sociis natoque penatibus et magnis dis parturient montes</p>
                                </div>
                            </a>

                            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                               class="listview__item">
                                <img src="./Super Admin 2.0_files/2.jpg" class="listview__img" alt="">

                                <div class="listview__content">
                                    <div class="listview__heading">Jonathan Morris</div>
                                    <p>Nunc quis diam diamurabitur at dolor elementum, dictum turpis vel</p>
                                </div>
                            </a>

                            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                               class="listview__item">
                                <img src="./Super Admin 2.0_files/3.jpg" class="listview__img" alt="">

                                <div class="listview__content">
                                    <div class="listview__heading">Fredric Mitchell Jr.</div>
                                    <p>Phasellus a ante et est ornare accumsan at vel magnauis blandit turpis at
                                        augue ultricies</p>
                                </div>
                            </a>

                            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                               class="listview__item">
                                <img src="./Super Admin 2.0_files/4.jpg" class="listview__img" alt="">

                                <div class="listview__content">
                                    <div class="listview__heading">Glenn Jecobs</div>
                                    <p>Ut vitae lacus sem ellentesque maximus, nunc sit amet varius dignissim, dui
                                        est consectetur neque</p>
                                </div>
                            </a>

                            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                               class="listview__item">
                                <img src="./Super Admin 2.0_files/5.jpg" class="listview__img" alt="">

                                <div class="listview__content">
                                    <div class="listview__heading">Bill Phillips</div>
                                    <p>Proin laoreet commodo eros id faucibus. Donec ligula quam, imperdiet vel ante
                                        placerat</p>
                                </div>
                            </a>

                            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                               class="listview__item">
                                <img src="./Super Admin 2.0_files/1.jpg" class="listview__img" alt="">

                                <div class="listview__content">
                                    <div class="listview__heading">David Belle</div>
                                    <p>Cum sociis natoque penatibus et magnis dis parturient montes</p>
                                </div>
                            </a>

                            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                               class="listview__item">
                                <img src="./Super Admin 2.0_files/2.jpg" class="listview__img" alt="">

                                <div class="listview__content">
                                    <div class="listview__heading">Jonathan Morris</div>
                                    <p>Nunc quis diam diamurabitur at dolor elementum, dictum turpis vel</p>
                                </div>
                            </a>

                            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                               class="listview__item">
                                <img src="./Super Admin 2.0_files/3.jpg" class="listview__img" alt="">

                                <div class="listview__content">
                                    <div class="listview__heading">Fredric Mitchell Jr.</div>
                                    <p>Phasellus a ante et est ornare accumsan at vel magnauis blandit turpis at
                                        augue ultricies</p>
                                </div>
                            </a>
                        </div>
                        <div class="scroll-element scroll-x">
                            <div class="scroll-element_outer">
                                <div class="scroll-element_size"></div>
                                <div class="scroll-element_track"></div>
                                <div class="scroll-bar"></div>
                            </div>
                        </div>
                        <div class="scroll-element scroll-y">
                            <div class="scroll-element_outer">
                                <div class="scroll-element_size"></div>
                                <div class="scroll-element_track"></div>
                                <div class="scroll-bar"></div>
                            </div>
                        </div>
                    </div>

                    <div class="p-1"></div>
                </div>
            </div>
        </li>

        <li class="dropdown hidden-xs-down">
            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" data-toggle="dropdown"><i
                    class="zmdi zmdi-check-circle"></i></a>

            <div class="dropdown-menu dropdown-menu-right dropdown-menu--block" role="menu">
                <div class="dropdown-header">Tasks</div>

                <div class="listview listview--hover">
                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <div class="listview__content">
                            <div class="listview__heading">HTML5 Validation Report</div>

                            <div class="progress mt-1">
                                <div class="progress-bar bg-primary" role="progressbar" style="width: 25%"
                                     aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <div class="listview__content">
                            <div class="listview__heading">Google Chrome Extension</div>

                            <div class="progress mt-1">
                                <div class="progress-bar bg-warning" style="width: 43%" aria-valuenow="43"
                                     aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <div class="listview__content">
                            <div class="listview__heading">Social Intranet Projects</div>

                            <div class="progress mt-1">
                                <div class="progress-bar bg-success" style="width: 20%" aria-valuenow="20"
                                     aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <div class="listview__content">
                            <div class="listview__heading">Bootstrap Admin Template</div>

                            <div class="progress mt-1">
                                <div class="progress-bar bg-info" style="width: 60%" aria-valuenow="60"
                                     aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="listview__item">
                        <div class="listview__content">
                            <div class="listview__heading">Youtube Client App</div>

                            <div class="progress mt-1">
                                <div class="progress-bar bg-danger" style="width: 80%" aria-valuenow="80"
                                     aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                        </div>
                    </a>

                    <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="view-more">View
                        all Tasks</a>
                </div>
            </div>
        </li>

        <li class="dropdown hidden-xs-down">
            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" data-toggle="dropdown"><i
                    class="zmdi zmdi-apps"></i></a>

            <div class="dropdown-menu dropdown-menu-right dropdown-menu--block" role="menu">
                <div class="row app-shortcuts">
                    <a class="col-4 app-shortcuts__item"
                       href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html">
                        <i class="zmdi zmdi-calendar"></i>
                        <small class="">Calendar</small>
                    </a>
                    <a class="col-4 app-shortcuts__item"
                       href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html">
                        <i class="zmdi zmdi-file-text"></i>
                        <small class="">Files</small>
                    </a>
                    <a class="col-4 app-shortcuts__item"
                       href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html">
                        <i class="zmdi zmdi-email"></i>
                        <small class="">Email</small>
                    </a>
                    <a class="col-4 app-shortcuts__item"
                       href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html">
                        <i class="zmdi zmdi-trending-up"></i>
                        <small class="">Reports</small>
                    </a>
                    <a class="col-4 app-shortcuts__item"
                       href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html">
                        <i class="zmdi zmdi-view-headline"></i>
                        <small class="">News</small>
                    </a>
                    <a class="col-4 app-shortcuts__item"
                       href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html">
                        <i class="zmdi zmdi-image"></i>
                        <small class="">Gallery</small>
                    </a>
                </div>
            </div>
        </li>

        <li class="dropdown hidden-xs-down">
            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" data-toggle="dropdown"><i
                    class="zmdi zmdi-more-vert"></i></a>

            <div class="dropdown-menu dropdown-menu-right">
                <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="dropdown-item"
                   data-sa-action="fullscreen">Fullscreen</a>
                <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="dropdown-item">Clear
                    Local Storage</a>
                <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html"
                   class="dropdown-item">Settings</a>
            </div>
        </li>

        <li class="hidden-xs-down">
            <a href="http://byrushan.com/projects/super-admin/app/2.1.2/index.html" class="top-nav__themes"
               data-sa-action="aside-open" data-sa-target=".themes"><i class="zmdi zmdi-palette"></i></a>
        </li>
    </ul>

    <div class="clock hidden-md-down">
        <div class="time">
            <span class="time__hours">07</span>
            <span class="time__min">51</span>
            <span class="time__sec">24</span>
        </div>
    </div>
</header>