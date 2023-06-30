/** 1) 다른 배열을 원소로 갖는 배열 */
const a = [1, 2];
const b = [4, 5, 6, 7];
const myArr1 = [a, b];
console.log(myArr1);

/** 2) 축약표현 */
// 2행 3열 만들기
var myArr2 = [  [1, 2, 3],  [4, 5, 6]];
console.log(myArr2);

/** 3) 2차 배열의 원소 접근 */
// 행 - > 열 순으로 인덱스를 열거함
console.log(myArr2[0] [0]);             // 1행 1열 -> 1
console.log(myArr2[0] [1]);             // 1행 2열 -> 2
console.log(myArr2[0] [2]);             // 1행 3열 -> 3
console.log(myArr2[1] [0]);             // 2행 1열 -> 4
console.log(myArr2[1] [1]);             // 2행 2열 - > 5
console.log(myArr2[1] [2]);             // 2행 3열 -> 6

/** Array 클래스를 통한 2차 배열 */
const c = new Array(10, 20, 30);
const d = new Array(50, 60, 70);
const myArr3 = new Array(c, d);
console.log(myArr3);

const myArr4 = new Array(new Array(10, 20, 30), new Array(50, 60, 70));
console.log(myArr4);
