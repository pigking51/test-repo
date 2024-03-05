public class mass240305 {
    public static void main(String[] args) {
        // String 클래스

        // 특징 1.
        // 리터럴 형태로 값을 변경 시 새로운 메모리 위치에 만든다
        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str2);

        // 특징 2.
        // "리터럴" 형태로 생성 시 동일한 값을 공유한다(new로 만든 것은 새로운 메모리 위치에 만듦)
        // 자바는 컴파일 /  리터럴은 컴파일 타임, new는 런타임 타임이므로 new를 위에 적어도 리터럴보다 먼저 읽힐 일은 없음
        String str3 = "Start";
        String str4 = "Start";
        String str5 = new String("start");
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str4 == str5);
    }
}
