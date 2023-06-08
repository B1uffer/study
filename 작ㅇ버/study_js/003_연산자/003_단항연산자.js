    let x = 100;

    x += 10;
    console.log(x);             // 110, 100에서 10 증가

    x -= 30;
    console.log(x);             // 80, 110에서 30 감소. 지금 x는 80

    x *= 2;
    console.log(x);             // 160, 80에서 2배 증가. 지금 x는 160

    x /= 5;
    console.log(x);             // 32, 160을 5로 나눔. 지금 x는 32

    x %= 10;
    console.log(x);             //2, 32를 10으로 나누면 3.2가 나오는데 정수를 제외하니 2