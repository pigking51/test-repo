package Java0325;

import Java240325.rere.Students;

public class Example {
    // 첫번째 미션
    // 아래 코드가 실행될 수 있도록 Students 클래스를 완성하시오.
    // 힌트 : 세터메서드를 만들어야함. toString()은 오버라이딩 필요
    public static void main(String[] args) {
        Students students0 = new Students();
        students0.setName("Steve");
        students0.setDepartment("Physics");
        students0.setStudentId(10001);
        System.out.println(students0.toString()); // Steve, Physics, 10001\

        createStudentsInfo();
    }
    // 두번째
    // 아래 메서드를 완성하시오
    // 주어진 배열을 이용하여 Students파일의 배열을 만들고 for문으로 출력해야함
    public static void createStudentsInfo() {
        String[] names = {"Steve", "tom", "Laura", "Susie"};
        String[] departments = {"Physics", "Computer", "English", "Law"};
        int[] studentsIds = {10001, 10002, 10003, 10004};

        
    }
}
