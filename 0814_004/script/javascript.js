$('#header>nav').mouseover(function() {

    $('#header>nav>ul>li>ul').stop().slideDown();
    $('#header>nav>.sub_bg').stop().slideDown();

}).mouseout(function() {

    $('#header>nav>ul>li>ul').stop().slideUp();
    $('#header>nav>.sub_bg').stop().slideUp();

})

var start = 0;
var end = 2;

setInterval(() => {
    
    $('#slide ul li').eq(start - 1).css('left','-200%');
    $('#slide ul li').eq(start).css('left',0);

    start = start == end ? 0 : start += 1;

}, 3000);


$('#contents .notice ul li').click(function() {

    $('#modal').css('display','block');

})

$('#modal .m_body button').click(function() {

    $('#modal').css('display','none');

})