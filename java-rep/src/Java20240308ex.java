import java.util.Arrays;
import java.util.Scanner;

public class Java20240308ex {
    public static void main(String[] args) {
        // 1. 양의정수 10개를 입력
        // 2. 배열에 담는다.
        // 3. 3의 배수만 출력

        int[] numArray = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("양의정수 10개를 입력해주세요 : ");
        for(int i = 0; i < 10; i++){
        int num = scan.nextInt();
            numArray[i] = num;
        };
        System.out.println(Arrays.toString(numArray));
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i]%3 == 0){
                System.out.println(numArray[i]);
            }
        }
        System.out.println();
        // 240308쪽지시험 10번 코드복기
        int[] numList = new int[]{25, 10, 20, 45, 50, 89, 42};
        int max = 0;
        for(int i = 1; i < numList.length; i++){
            for(int j = 0; j < i && i < numList.length-1 ; j++){
                if(numList[i]>numList[j] && numList[i+1] < numList[j+1]){
                    max = numList[i];
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
