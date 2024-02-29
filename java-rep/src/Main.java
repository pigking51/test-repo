public class Main {
    public static void main(String[] args) {
        System.out.println("화면 출력");
        System.out.println("화면 "+"출력");
        System.out.println(3.8);
        System.out.println(3+5);
        System.out.println("화면"+3);
        System.out.println("화면"+3+5);
        System.out.println(3+5+"화면");

        // 변수에 넣어 출력하기
        int a = 3;
        String b = "화면";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(b+" 출력");
        System.out.println(a+b+" 출력");

        // 한줄로 출력하기
        System.out.print("화면 ");
        System.out.print("출력 ");
        System.out.print(3);
        System.out.println();
        System.out.println();

        // 변수선언과 값을 대입하는 방법
        int am = 3;
        int bmm;
        bmm = 4;
        System.out.println(am);
        System.out.println(bmm);
        System.out.println();
        System.out.println();

        String str = "Hello world";
        System.out.println(str);

        String r = new String("Hello world");
        System.out.println(r);
        System.out.println();
        System.out.println();

        // Java 기본 자료형 8가지
        // byte, short, int, long, float, double, boolean, char

        // 전위형, 후위형 증감 연산자가 동일한 결과를 출력할 때
        int aab = 3;
        ++aab;
        System.out.println(aab);
        aab++;
        System.out.println(aab);
        --aab;
        System.out.println(aab);
        aab--;
        System.out.println(aab);
        System.out.println();
        System.out.println();

        // 전위형, 후위형 증감 연산자가 서로 다른 결과를 출력할 때
        int abb = 3;
        int bba = ++abb;
        System.out.println(abb);
        System.out.println(bba);
        int abb1 = 3;
        int bba1 = abb1++;
        System.out.println(abb1);
        System.out.println(bba1);
    }
}