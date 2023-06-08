    /** 1) and */
    // 전제가 참인 경우에만 결과가 참이다.

    console.group("1) and");
    console.log(true && true);              // true
    console.log(true && false);             // false
    console.log(false && true);             // false
    console.log(false && false);                //false
    console.groupEnd();
    
    /** 2) and 연산 여러개 사용 */
    console.group("2) and 연산 여러개 사용");
    console.log(true && true && true);              // true
    console.log(true && true && false);             // false
    console.log(false && false && true);                // false
    console.log(false && false && false);               // false
    console.log(false && false && false);               // false
    console.groupEnd();

    /** 3) or  */
    // 하나라도 참이 포함되어 있다면 결과는 참이다.

    console.group("3) or");
    
