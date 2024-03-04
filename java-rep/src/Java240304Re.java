public class Java240304Re {
    public static void main(String[] args){
        // for 반복문의 기본형
        for(int i = 0; i < 15; i=i+1){
            System.out.print(i+ " ");
        }
        System.out.println();
        // 무한루프
        // 조건식이 false가 될 수 있는 지 여부를 반드시 확인!!
//         for(int i = 0; i >= 0; i--){
//             System.out.println(i);
//         }
        // for문 기본 문법 구조
        int a = 0;
        for(;a < 3;){
            System.out.print(a+" ");
            a++;
        }
        System.out.println();

        for(int i = 0; i < 3; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 0; i < 50; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 10; i > 0; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 0; i < 10; i = i+2){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 0, j = 0; i < 10; i++, j++){
            System.out.print(i+j+" ");
        }
        System.out.println();

        // for문의 특수한 형태(무한루프)
//        for(int i = 0; ; i++){
//            System.out.print(i+" ");
//        }
//        for(;;){
//            System.out.print("무한루프");
//        }
        System.out.println();
        
        // 무한루프 탈출
        for(int i = 0; ; i++){
            if(i > 30){
                break;
            }
            System.out.print(i+"번 반복 ");
        }
        System.out.println();
        System.out.println("무한루프 탈출");
        System.out.println();

        int b = 0;
        for(;;){
            if(b <= 10){
                System.out.print(b + " ");
                b++;
            }else{
                break;
            }
        }
        System.out.println();
        System.out.println();

        // 멀티 조건식
        for(int c = 0, d = 0; c < 10 || d < 10; c++, d++){
            System.out.print(c + " " + d + " ");
        }
        System.out.println();
        System.out.println();
        
        // while문
        int count = 0; // 초기식
        while (count < 10){ // 조건식
            System.out.print(count + " ");
            count++; // 증감식
        }
        System.out.println();
        System.out.println();
        
        // 의도적인 무한루프에서 while문은 자주 쓰임
//        while(true) {
//            //무한루프
//            // 유저가 버튼 클릭할때 까지 대기
//            // (클릭하면) break;
//        }
        System.out.println();
        System.out.println();
        
        // do ~ while문
        int cnt = 0; //초기식
        do{
            System.out.print(cnt + " "); 
            cnt++; // 증감식
        }while(cnt < 10); // 조건식
        // while문과 비교하면
        // 반복문의 조건이 처음부터 false인 경우,
        // do ~ while문은 실행코드가 1회 실행되는 반면, while문은 실행되지 않음!!!
        System.out.println();
        System.out.println();

        // 이중루프, 이중반복문
        for(int k = 0; k < 5 ; k++){
            for(int j = 0; j < 6; j++){
                System.out.println("[k = " + k + ", " + "j = " + j + "]");
            }
        }

    }
}
