// JavaScript Document

var swiper = new Swiper('#mainBody .swiper-container', {
	
			autoplay: {
						
            delay: 3500,	// 자동으로 화면 전환 3.5초
            disableOnInteraction: false	// 손님이 넘길 때는 오토플레이 정지
						
            },
						
						
            slidesPerView: 1,	// 화면에 보여주는 이미지 개수			
            loop: true,	// 무한 루프 적용			
			allowTouchMove: true,	// 터치유무 (기본값 true)
			
			pagination: {	// 하단에 점 표시 적용
                el: '.swiper-pagination',
                clickable: true,
            },
            navigation: {	// 좌우 화살표 적용
                nextEl: '.next',
                prevEl: '.prev',
            },
			
					
			effect: 'slide', // slide, fade, cube, coverflow, flip
			speed: 1000
						
        });
						
	