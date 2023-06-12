/** 마지막 회차를 생략하는 조건식 */

// 1) 반복문의 조건식이 "변수 < 최대값" 인 경우의  조건 : 변수 + 1 < 최대값
// 1) 반복문의 조건식이 "변수 <= 최대값" 인 경우의 조건 : 변수 < 최대값

console.group("변수 < 최대값");

for (let i = 1; i < 10; i++) {              // i의 범위는 1~9
        if (i + 1 < 10) {               // i가 1일때, i = 2이고 i가 9일때, i = 10
            console.log(i);
        }
}

console.groupEnd();

console.group("변수 <= 최대값");

for (let i = 1; i <= 9; i++) {              // i의 범위는 마찬가지로 1~9
        if (i < 9) {                // i가 1일때 i = 1, i가 9일때 i = 9
            console.log(i);
        }
}

console.groupEnd();


// 1 ~ 9 까지의 숫자 사이사이에 콤마를 넣어서 한 문장으로 결합
console.group("글자 사이사이에 콤마 넣기");

let str = " ";              // " "는 문장을 의미한다

for (let i = 1; i < 10; i++) {
    str += i;               // str에 i값을 넣어라
        if (i + 1 < 10) {              // 이 조건은 마지막 9에 콤마를 넣지 않게끔 하는 조건
            str += ", ";                // str에 콤마도 넣어라
                        }               
}

console.log(str);
console.groupEnd();
