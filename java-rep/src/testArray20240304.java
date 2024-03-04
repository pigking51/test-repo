public class testArray20240304 {
    public static void main(String[] args){
        // 배열의 기본 선언법
        int[] intArray1 = {1, 2, 3, 4, 5};
        System.out.println(intArray1[2]);

        int[] intarray2 = new int[5]; // → 빈 공간 5개만 잡아놓은 것
      //intarray2 = {1, 2, 3, 4, 5}  // 오류(여기서 이렇게 쓰면 안 됨)
        intarray2[0] = 1;
        intarray2[1] = 2;
        intarray2[2] = 3;
        intarray2[3] = 4;
        intarray2[4] = 5;
        System.out.println(intarray2[2]);

        int[] intArray3 = new int[25];
        // int[] intArray3 = 가변의 길이를 가진 배열을 저장함
        for(int i = 0; i < intArray3.length; i++) {
            intArray3[i] = i + 1;
            System.out.print(intArray3[i]+" ");
        }
        System.out.println();

        int[] intArray4 = new int[]{1,2,3,4,5};
        System.out.println(intArray4[2]);

        // 배열의 복사 (= 참조복사)
        String[] str1 = {"black", "white", "gray"};
        String[] str2 = str1;
        System.out.println("1 "+ str2[2]);
        str2[2] = "yellow";
        System.out.println("2 "+ str2[2]);
        System.out.println("3 "+ str1[2]);
        System.out.println();
        System.out.println();

        // 기본자료형의 복사 (= 값 복사)
        int a = 5;
        int b = a;
        System.out.println("1 " + b);
        b = 10;
        System.out.println("2 " + b);
        System.out.println("3 " + a);
    }
}
