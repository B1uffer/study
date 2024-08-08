// $('') : jQuery 선택자
$('#header nav>ul>li').mouseover(function(){    // 주메뉴에 마우스를 올리면,

   $(this).find('ul').stop().slideDown();
   // $(this) : 선택자가 2개 이상일 때 사용함
   // 사용자가 선택한 주메뉴(#header nav>ul>li에서 li)가 this임
   // 사용자가 주메뉴 3번째에 마우스를 올렸다면, this는 li태그 3번째가 됨

    // find : 자식 선택자
    // slideDown : jQuery 명령어
})

$('#header nav>ul>li').mouseout(function(){     // 주메뉴에 마우스가 벗어나면,

    $(this).find('ul').stop().slideUp();

    // 연사방지 : stop()

})

$('#contents .notice ul li:first-of-type a').click(function() {       // li태그 1번째를 클릭하면 뭔가 함

    $('#modal').css('display','block');     // 모달폼 display:none 해제하기

    return false;       // a태그 링크 제거
})

$('#modal .box button').click(function() { //#modal .box button에 대해 클릭하면,

    $('#modal').css('display','none');  // #modal이 css의 display none 작업을 함

})      // 즉 버튼을 클릭하면 사라지게 해주는 메서드


var now = 1;
var imgs = 2;

setInterval(() => {     // setInterval

    
    $('#slide ul li').eq(now - 1).fadeOut();    // 이미지를 선택해서 서서히 숨김
    $('#slide ul li').eq(now).fadeIn();     // 이미지를 선택해서 서서히 보임
    now = now == imgs ? 0 : now += 1;       // 삼항연산자, js에서도 ==는 boolean형

}, 3000);   // 3000은 3초마다, 1000은 1초마다 이 메서드가 반복된다는걸 의미

    /*
        $('#slide ul li').eq(now-1).css('left','-200%');
        $('#slide ul li').eq(now).css('left',0);

    */