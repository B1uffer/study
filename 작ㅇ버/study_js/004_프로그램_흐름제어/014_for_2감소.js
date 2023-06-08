// b가 10부터 0보다 큰 동안 2씩 감소

let x = 10

for (let b = 10; b > 0; b -= 2) {
    x -= b
    console.log("b=%d", b);
    console.log("x = %d, b = %d", x, b);
}

    console.log("x의 최종값은 %d 입니다.", x);
    console.log("x의 최종 합계 = " +x);