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