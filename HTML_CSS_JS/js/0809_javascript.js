$('#wrap #header>nav>ul>li').mouseover(function() {

    $(this).find('ul').stop().slideDown('200');

})

$('#wrap #header>nav>ul>li').mouseout(function() {

    $(this).find('ul').stop().slideUp();

})


    var start = 1;
    var end = 2;       // 0, 1, 2

setInterval(() => {
    
    $('#wrap #slide ul li').eq(start-1).fadeOut();
    $('#wrap #slide ul li').eq(start).fadeIn();
   
    start = start == end ? 0 : start += 1;
    // https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Conditional_operator

    // https://nagy.tistory.com/23
    
}, 1000);


