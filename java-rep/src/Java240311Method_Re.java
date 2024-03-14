public class Java240311Method_Re {
    static int a = 1;
    static int b = 2;

    public static void main(String[] args) {
        // 메인 클래스에서 인스턴스화 하지 않고 그 아래있는 main에 static?
        System.out.println(plusNums());
        System.out.println(plusNums(5, 7));
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(plusNums(intArray, intArray.length));
        // → intArray 안에 배열을 넣어도 되지만 Java만 오류뜸()
        // → 두번째 변수값은 굳이 넣지 않아도 됨(힙에 들어가는 것은 적지 않았을때 초기화되어 0이되기 때문)
        System.out.println(plusNums(1,2,3,4,5,6));
    }
    // 메소드의 오버로딩
    // 오버로딩과 오버라이딩의 차이점 → 면접 시 많이 물어봄
    // 오버로딩 : 같은 이름 이지만 Method signature(매개변수 선언부)가 다른 것을 말함
    // 하나의 메소드 이름으로 여러개의 작업을 해해는 것(사용자 입장에서 매우 편리)
    // 오버라이딩 : 상속 관계에 있는 부모 클래스에서 이미 정의된 메소드를
    // 자식 클래스에서 같은 시그니쳐를 갖는 메소드로 다시 정의하는 것

    public static int plusNums(){ return  a + b; }
    public static int plusNums(int x, int y){ return  x + y; }

    public static int plusNums(int[] intArray, int length){
        int sum = 0;
        for(int i = 0; i < intArray.length; i++){
            sum = sum + intArray[i];
        }
        return sum;
    }

    public static int plusNums(int... values){
        int[] intArray = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < intArray.length; i++){
            sum = sum + intArray[i];
        }
        return sum;
    }
}
