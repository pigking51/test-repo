package Homeworks.HW02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changeCase(String str) {
        // 여기 코드 작성 !!
        String[] arr = new String[11];
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.toUpperCase().charAt(i)){
               arr[i] = String.valueOf(str.charAt(i)).toLowerCase();
            } else if (i == 6) {
                arr[i] = String.valueOf(str.charAt(i));
            }else{
                arr[i] = String.valueOf(str.charAt(i)).toUpperCase();
            }

        }
        String str2 = "";
        for(int i = 0; i < arr.length; i++){
            str2 = str2 + arr[i];
        }
        return str2;
    }
}
