$('#header>nav>ul>li>a').mouseover(function() {

    $('#header>nav>ul>li>ul').stop().slideDown(500);
    $('#header #background').stop().slideDown(500);

})

$('#header>nav>ul>li>a').mouseout(function() {

    $('#header>nav>ul>li>ul').stop().slideUp(500);
    $('#header #background').stop().slideUp(500);

})

var start = 1;
var end = 2;

setInterval(() => {

    $('#slide ul li').eq(start-1).fadeOut();
    $('#slide ul li').eq(start).fadeIn();

    start = start == end ? 0 : start += 1;

}, 1000);