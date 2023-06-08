// a가 0부터 100보다 작은 동안 10씩 증가
let x = 0;

for (let a=0; a <=100; a+=10) {
    x += a;
    console.log("a = %d", a);
    console.log("x = %d, a = %d", x, a);

}

    console.log("10부터 100까지 더한 a의 총합 = " + x);