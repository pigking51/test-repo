public class JAVA20240305re {
    public static void main(String[] args) {
        // break = 제어문의 중괄호를 탈출시키는 키워드 (자기를 감싸고 있는 괄호)
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            if(i > 6){
                break;
            }
//            System.out.println(i);
        }
        System.out.println();
        // 이중 for문에서의 break 사용법
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 10; j++){
//                System.out.println(i + ", " + j); // 여기에서 출력하면 j가 8까지 찍혀나옴
                if(j == 8){
                    i = 999999999; // 여기에 매우 큰 수(제일 바깥의 조건식 한계 혹은 그 이상)를 세팅해서 바깥 for문 탈출

                    break;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
        // 바깥 for문까지 탈출하는 다른 방법
        outside: // 여기에 쓰는 단어는 아무 단어나 써도 상관없음(변수처럼 이름짓는 것 → 다른언어로 대체가능)
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(j == 7){
                    break outside; // 여기에 쓰는 단어는 아무 단어나 써도 상관없음(변수처럼 이름짓는 것 → 다른언어로 대체가능)
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
        // continue 사용법
        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){ // 0 포함 짝수인 경우 아래 출력문을 실행하지 않음
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        // 이중 for문에서의 continue
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                if(j == 3){
                    continue;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
        // String 클래스의 첫번째 특징
        // 객체의 값을 변경하면 새로운 객체를 생성(주소값이 새로운 주소로 변경)
        // String 객체 변수는 값이 수정되지 않고 항상 새로운 값을 만듦!!
        String str1 = new String("Start");
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "end";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();

        // String 클래스의 두번째 특징
        // 리터럴로 입력하는 경우 해당 문자열을 재사용( =공유)함
        // 리터럴로 입력되는 값은 런타임 이전에 이미 메모리에 만들어짐
        String str5 = new String("Start");
        String str3 = "Start";
        String str4 = "Start";
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str4.equals(str5)); // 문자열 자체를 비교하는 것이므로 true의 결과값이 나옴
        System.out.println();

        // 문자열의 '+' 연산
        String a1 = "Welcome";
        String a2 = "Academy";
        System.out.println(a1 + " " + a2);

        // 문자열과 숫자의 '+' 연산
        System.out.println(76 + "solider"); // 76solider
        System.out.println(76 + 1 + "solider"); // 77solider
        System.out.println("solider" + 76 + 1); // solider761
        
        // * deprecated : '더이상 쓰지 마세요' 라는 뜻
    }
}
