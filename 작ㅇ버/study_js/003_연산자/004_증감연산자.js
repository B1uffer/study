    /** 1) 변수 스스로 1 증가 */
    let selfPlus = 1;
    console.log(selfPlus);

    selfPlus++;
    console.log(selfPlus);              // selfPlus가 1이니까 여기서 스스로 1 증가

    ++selfPlus;
    console.log(selfPlus);              // selfPlus가 2니까 여기서 스스로 1 증가

    /** 2) 변수 스스로 1 감소 */
    let selfMinus = 1;
    console.log(selfMinus);             // selfMinus가 1이니까 1

    selfMinus--;
    console.log(selfMinus);             // selfMinus에서 스스로 1 감소 0

    --selfMinus;
    console.log(selfMinus);             // selfMinus = 0에서 스스로 1 감소

    /** 3) 전위 증감 연산자 ++selfPlus, --selfMinus */
    let preValue = 1;

    // preValue를 먼저 1 증가시키고 전체 수식을 처리함.
    let preResult = 100 + ++preValue;
    console.log(preResult);             // preValue가 1이니까 먼저 처리하고 수식처리 102
    console.log(preValue);              // ++preValue이므로 전위증감 2

    /** 4) 후위 증감 연산자 */
    let nextValue = 1;

    // 100 + nextValue를 먼저 처리하고 나중에 nextValue가 1 증가하는 방식
    let nextResult = 100 + nextValue++;
    console.log(nextResult);                // 100 + nextValue를 먼저 처리하고 1증가 101
    console.log(nextValue);             // 2

