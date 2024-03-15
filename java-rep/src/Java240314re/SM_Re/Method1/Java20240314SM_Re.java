package Java240314re.SM_Re.Method1;
class A{
    A(){
        System.out.println("A 생성자");
    }

}
class B extends A{
    B(){
        super(); // 생략했을 때 컴파일러가 자동 추가(부모 클래스의 생성자 호출)
        System.out.println("B 생성자");
    }
}
class C{
    C(int a){
        System.out.println("C 생성자");
    }
}
class D extends C{
    D(){
        super(3);
    }
}
public class Java20240314SM_Re {

}
