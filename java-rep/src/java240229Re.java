public class java240229Re {
    public static void main(String[] args) {
        // if 단일 값 구문의 예
    if(5<3){
        System.out.println("출력1");
    }
    if(5>3){
        System.out.println("출력2");
    }
    int a = 3;
    if (a == 3){
        System.out.println("출력3");
    }
    boolean b = false;
    if (b){
        System.out.println("출력4");
    }
    boolean c = true;
        if (c){
            System.out.println("출력5");
        }

    if (5>3){
            System.out.println("실행1");
        }else{
            System.out.println("실행안함");
        }
    if (5%2 != 1){
        System.out.println("실행안함2");
    } else if (5%2 == 1){
        System.out.println("실행2");
    }
        System.out.println();
        System.out.println();
    // if else if else 구문을 이용해 학점구하기
        int x = 88;
        if(x >= 91){
            System.out.println("A학점");                    
        } else if (x >= 81 && x <= 90) {
            System.out.println("B학점");
        } else if (x >= 70 && x <= 80){
            System.out.println("C학점");
        } else{
            System.out.println("F학점");
        }
        System.out.println();
        System.out.println();

    // switch 구문 예시
     int wa = 2;
        switch(wa){
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");

            case 3:
                System.out.println("C");
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
        }
    }
}
