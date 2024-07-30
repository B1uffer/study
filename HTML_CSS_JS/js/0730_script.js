// JavaScript Document

// 헤더 주메뉴 마우스오버
$('#header #nav').mouseover(function(){
	$('#header #nav .sub_bg, #header #nav .sub').stop().slideDown();
});
$('#header #nav').mouseout(function(){
	$('#header #nav .sub_bg, #header #nav .sub').stop().slideUp();
});

// 슬라이드 애니메이션
var imgs = 2;
var now = 0;

setInterval(function(){
	$('#slide ul li').eq(now - 1).fadeOut();
	$('#slide ul li').eq(now).fadeIn();
	now = now == imgs ? 0 : now += 1;
}, 2000);

// 공지사항 첫번째 클릭 모달폼
$("#contents .notice ul li:first-of-type a").click(function(){
	$("#modal").css("display","block");
});

$("#modal .modal_up button").click(function(){
	$("#modal").css("display","none");
});