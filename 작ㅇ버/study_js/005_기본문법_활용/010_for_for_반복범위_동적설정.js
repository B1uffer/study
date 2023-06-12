/** 반복범위 동적 설정 */

for (let i=0; i<5; i++) {               // i는 0부터 4까지
    
    console.group("i에 대한 반복 수행 시작 >> i = " + i);

    for (let j=0; j < i + 1; j++)   {               // j는 0부터 시작이며 i + 1보단 작다 j의 최댓값은 4

        console.log("i=%d, j=%d", i, j);

    }
    
    console.groupEnd();

}