<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                        
                       	 <!-- 공지사항 고정 -->
                        	<a class="nav-link" href="">
                                <div class="sb-nav-link-icon"><i class="fas fa-exclamation-circle"></i></div>
                               	공지사항
                            </a>
                        	
                            <!-- 근태  -->

                            <a class="nav-link" href="/cnav/attend/attend.cnav">
                                <div class="sb-nav-link-icon"><i class="fas fa-user"></i></div>
                                근태
                            </a>
                           </c:if> 
                            
                            <!-- 결재 -->

                            <a class="nav-link collapsed" href="/cnav/approval/sendAppList.cnav" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                결재
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="/cnav/approval/sendAppList.cnav">보낸 결재함</a>
                                    <a class="nav-link" href="/cnav/approval/takeAppList.cnav">받은 결재함</a>
                                </nav>
                            </div>
                         	</c:if>

                            <a class="nav-link collapsed" href="/cnav/approval/sendAppList.cnav" data-bs-toggle="collapse" data-bs-target="#mailLayouts" aria-expanded="false" aria-controls="mailLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-envelope"></i></div>
                                메일
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="mailLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="/cnav/approval/sendAppList.cnav">메일 쓰기</a>
                                    <a class="nav-link" href="/cnav/approval/sendAppList.cnav">보낸 메일함</a>
                                    <a class="nav-link" href="layout-sidenav-light.html">받은 메일함</a>
                                </nav>
                            </div>
                           </c:if>

                            <a class="nav-link collapsed" href="/cnav/approval/sendAppList.cnav" data-bs-toggle="collapse" data-bs-target="#reserveLayouts" aria-expanded="false" aria-controls="reserveLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                예약
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="reserveLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="">전체 예약</a>
                                    <a class="nav-link" href="">내 예약</a>
                                </nav>
                            </div>
                           </c:if>

                            <a class="nav-link collapsed" href="/cnav/approval/sendAppList.cnav" data-bs-toggle="collapse" data-bs-target="#dayLayouts" aria-expanded="false" aria-controls="dayLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-calendar-alt"></i></div>
                                일정
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="dayLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="">전체 일정</a>
                                    <a class="nav-link" href="/cnav/approval/takeAppList.cnav">내 일정</a>
                                </nav>
                            </div>
                            </c:if>

                                <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                                프로젝트
                            </a>
                            </c:if>

                            <a class="nav-link" href="tables.html">
                                <div class="sb-nav-link-icon"><i class="fas fa-comments"></i></div>
                                자유 게시판
                            </a>
                           </c:if>

                                <div class="sb-nav-link-icon"><i class="fas fa-check-circle"></i></div>
                                투표
                            </a>
                           </c:if> 
                            
                         
                            
                            
                            
                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">Contact :</div>
                        02-123-4567
                    </div>
                </nav>
            </div>
