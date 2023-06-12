/** 이중 반복문 구구단 */

for (let i = 2; i < 10; i++)    {               // 2단부터 9단까지 i의 범위는 2~9
                
    console.group("%d단", i);               //여기부터 자식이니까 반복된다 2단 ~ 9단, 행

        for (let j = 1; j < 10; j++)    {               // j는 1부터 9니까 곱하는 수, 열

                console.log("%d x %d = %d", i, j, i*j);

        }

    console.groupEnd();

}