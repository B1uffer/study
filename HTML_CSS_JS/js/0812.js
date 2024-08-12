$('#header>nav>ul>li>a').mouseover(function() {

    $('#header>nav>ul>li>ul').stop().slideDown(500);
    $('#header #background').stop().slideDown(500);

})

$('#header>nav>ul>li>a').mouseout(function() {

    $('#header>nav>ul>li>ul').stop().slideUp(500);
    $('#header #background').stop().slideUp(500);

})

setInterval(() => {
    
}, 3000);