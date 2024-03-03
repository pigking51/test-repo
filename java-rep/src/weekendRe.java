public class weekendRe {
    public static void main(String[] args) {
        System.out.println("자 이제 시작이야");
        System.out.println();
        System.out.println();

        int x = 60;

        if(x < 50) {
            System.out.println("과락");
        } else if(x >= 50 && x < 60){
            System.out.println("D");
        } else if(x >= 60 && x < 70) {
            System.out.println("C");
        } else if(x >= 70 && x < 80) {
            System.out.println("B");
        } else if(x >= 80 && x <= 85) {
            System.out.println("B+");
        } else {
            System.out.println("A");
        }

        System.out.println();
        System.out.println();

        int y = 4;
        switch(y){
            case 1:
            System.out.println("첫");
            case 2:
                System.out.println("두");
            case 3:
                System.out.println("삼");
            case 4:
                System.out.println("사");
            case 5:
                System.out.println("오");
            case 6:
                System.out.println("육");
                break;
            case 7:
                System.out.println("칠");
        }
        System.out.println();

        int i;
        for(i=1; i <= 10; i++){
            System.out.println("반복문 "+i+"번"+" 연습");
        }
        System.out.println();
        int o;
        for(o=0; o < 100; o++){
            System.out.println(o+"번 반복");
        }

    }
}
