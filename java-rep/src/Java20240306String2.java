import java.util.Arrays;
import java.util.Scanner;

public class Java20240306String2 {
    public static void main(String[] args) {
        // 문자열 수정
        // @toLowerCase(), toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println();

        // @replace
        // Study를 못찾으면 변경하지 않고 원본 그대로 둠
        System.out.println(str1.replace("Study", "공부"));
        System.out.println();

        // @substring()
        // 두번째 파라미터로 사용된 인덱스는 포함되지 않음 (0 <= 범위 < 5);
        System.out.println(str1.substring(0,8));
        System.out.println();

        // @split
        // split 메소드의 리턴형은 String[] 문자열의 배열이다!!!
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));
        System.out.println();

        // @trim
        System.out.println("   abc   ".trim());
        String _str1 = "   abc def   ";
        _str1 = _str1.trim();
        System.out.println(_str1);
        System.out.println();

        // 모든 공백 지우기
        System.out.println(_str1.replaceAll(" ", ""));
        System.out.println();

        // 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        // @stack 메모리 비교(==) : 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str2 == str4);
        System.out.println();

        // @equals(), equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println();

        int[] intArray = new int[10];
        for(int i = 0; i < 10; i++){
            intArray[i] = i+1;
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println();

        int[] intList1 = new int[3];
        int[] intList2 = {100, 200 ,300};
        for(int i = 0; i < intList1.length; i++) {
            intList1[i] = intList2[i];
        }
        System.out.println(Arrays.toString(intList1));
        System.out.println();

        int[] intArray2 = new int[10];
         int x =1;
         for(int i = intArray2.length-1; i >= 0; i--) {
             intArray2[i] = x;
             x = x+1;
         }
        System.out.println(Arrays.toString(intArray2));
        System.out.println();

        // 2. 길이가 10인 배열에 10부터 1까지 값을 역순으로 입력
         int[] intList3 = new int[10];
         int len = intList3.length;
         for(int i = 0; i < intList3.length; i++){
             intList3[i] = len;
             len = len - 1;
         }
        System.out.println(Arrays.toString(intList3));
        System.out.println();

        // 3. 과일 배열에 "사과"가 몇번 들어있는지 확인
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;
        for(int i = 0; i < fruitList.length; i++){
//            if(fruitList[i].equals("사과")){
//                count = count + 1;
//            }
            if(fruitList[i] == "사과"){
                count = count + 1;
            }
        }
        System.out.println(count);
        System.out.println();
        
        // 자바에서 입력값을 받는 방법
        Scanner scan = new Scanner(System.in);
        System.out.println("0 ~ 6까지 숫자를 입력해주세요 : ");
        int inputNumber = scan.nextInt();
        if(inputNumber >= 0 && inputNumber <= 6){
            System.out.println(inputNumber);
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
            }
    }
