    "use strict"; // 엄격모드

    /** 1) 선언, 할당 */
    let myNumber1;
    // 할당
    myNumber1 = 100;
    console.log(myNumber1);

    /** 2) 선언, 할당 통합 */
    let myNumber2 = 200;
    console.log(myNumber2);

    /** 3) 중복선언 금지 */
    let myNumber3 = 1;
    console.log(myNumber3);

    // 앞에서 이미 선언된 변수이므로 에러가 발생
    let myNumber4 = 2;
    console.log(myNumber4);
