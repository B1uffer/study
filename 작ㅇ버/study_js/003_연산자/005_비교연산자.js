    /** 1) 이상, 이하, 미만, 초과 */
    let x = 100;
    let y = 50;

    let compare1 = x >= y;               // 100은 50 이상이다, 참(true)
    let compare2 = x > y;               // 100은 50 초과이다, 참(true)
    let compare3 = x <= y;              // 100은 50 이하이다, 거짓(false)
    let compare4 = x < y;               // 100은 50 미만이다, 거짓(false)

    console.group(" 1) 이상, 이하, 미만, 초과");
    console.log(compare1);              // true
    console.log(compare2);              // true
    console.log(compare3);              // false
    console.log(compare4);              // false
    console.groupEnd();

    /** 2) 같다 */
    let a1 = "1";               // string
    let a2 = 1;             // number
    let a3 = 1.0;               // number
    let a4 = true;              // booleom

    console.group("2) 같다");
    console.group("내용만 비교하는 경우");
    console.log(a1 == a2);              // 두 값이 같으므로 결과는 true
    console.log(a1 == a3);              // 두 값이 같으므로 결과는 true
    console.log(a1 == a4);              // true

    console.log(a2 == a3);              // true
    console.log(a2 == a4);              //true
    
    console.log(a3 == a4);              //true
    console.groupEnd();
    console.group("데이터 타입까지 비교하는 경우");
    console.log(a1 === a2);             // 두 값이 다르므로 false
    console.log(a1 === a3);             // string과 number이므로 false
    console.log(a1 === a4);             // string / booleom, false

    console.log(a2 === a3);             // number와 number, 1과 1.0이므로 true
    console.log(a2 === a4);             // number와 booleom이므로 false

    console.log(a3 === a4);             // number / booleom false
    console.groupEnd();
    console.groupEnd();

    /** 3) 다르다 */
    let b1 = "1";
    let b2 = 1;
    let b3 = 1.0;
    let b4 = true;

    console.group(" 3) 다르다");
    console.group("내용만 비교하는 경우");
    console.log(b1 != b2);              // "1"과 1로 내용이 같으므로 false (다르지 않다)
    console.log(b1 != b3);              // 같으므로 false (다르지 않고 같다)
    console.log(b1 != b4);              // 같으므로 false (같다)

    console.log(b2 != b3);              // 같으므로 false
    console.log(b2 != b4);              // 같으므로 false

    console.log(b3 != b4);              // 같으므로 false
    console.groupEnd();

    console.group("데이터 타입까지 비교하는 경우");
    console.log(b1 !== b2);             // string과 number이므로 다르다 true
    console.log(b1 !== b3);             // string과 number true
    console.log(b1 !== b4);             // string과 booleom true

    console.log(b2 !== b3);             // number와 number false
    console.log(b2 !== b4);             // number / booleom true

    console.log(b3 !== b4);             // number / booleom true
    console.groupEnd();
    console.groupEnd();
    