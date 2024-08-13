$('#header>nav>ul>li').mouseover(function() {

    $(this).find('li').stop().slideDown();

}).mouseout(function() {

    $(this).find('li').stop().slideUp();

})


var start = 0;
var end = 2;

setInterval(() => {
    
    $('#slide ul li').eq(start-1).css('top','-200%');
    $('#slide ul li').eq(start).css('top','0');

    start = start == end ? 0 : start += 1;

}, 3000);


$('#modal .m_box button').click(function() {

    $('#modal').css('display', 'none');

})

$('#contents #shortcut').click(function() {
    
    $('#contents #shortcut').css('display','none');

})


$('#contents #notice ul li').click(function() {

    $('#modal').css('display', 'block');

})