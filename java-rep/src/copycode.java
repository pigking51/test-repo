import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class copycode {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\DW\\Desktop\\example");
        File[] fileList = dir.listFiles();
        String temp = "";
        String[] temp_;
        String head = "";
        int number;
        int count = 0;
        String[] excludeExtension = new String[0];
        Scanner scanner = new Scanner(System.in);

        if (fileList != null && fileList.length > 0) {
            System.out.println("------------------------------------------------------");
            System.out.println("| 파일들의 이름을 숫자로 정리해주는 프로그램입니다.        |");
            System.out.println("| 총 " + fileList.length + "개의 파일이 발견되었습니다.                        |");
            System.out.println("------------------------------------------------------");
            System.out.println("리스트를 확인하시겠습니까? (Y/N)");
            String judge = scanner.nextLine();
            if (judge.equals("Y") || judge.equals("y")) {
                for (File file : fileList) {
                    System.out.println(file.getName());
                }
            } else if (judge.equals("N") || judge.equals("n")) {
                ;
            } else {
                System.out.println("Y 또는 N 을 입력해주세요.");
            }
            System.out.println("\n\n");
            System.out.println("제외하고자 하는 파일 확장자가 있으십니까? (Y/N)");
            while (true) {
                judge = scanner.nextLine();
                if (judge.equals("Y") || judge.equals("y")) {
                    System.out.println("\n");
                    System.out.println("공백을 두고 대상에서 제외하고자 하는 확장자 명을 입력해주세요.");
                    temp = scanner.nextLine();
                    excludeExtension = temp.split(" ");
                    break;
                } else if (judge.equals("N") || judge.equals("n")) {
                    break;
                } else {
                    System.out.println("Y 또는 N 을 입력해주세요.");
                }
            }
            System.out.println("\n\n");
            System.out.println("숫자 앞에 붙을 접두사를 입력해주세요.");
            head = scanner.nextLine();
            System.out.println("\n\n");
            System.out.println("몇자리 번호를 부여하시겠습니까?");
            System.out.println("예) 3 입력 시 a001.jpg a002.jpg ...");
            number = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\n\n");
            System.out.println("최종 리스트를 확인하시겠습니까? (Y/N)");
            while (true) {
                judge = scanner.nextLine();
                if (judge.equals("Y") || judge.equals("y")) {
                    for (File file : fileList) {
                        temp_ = file.getName().split("\\.");
                        if (Arrays.asList(excludeExtension).contains(temp_[1])) {
                            ;
                        } else {
                            System.out.println(file.getName());
                            count++;
                        }
                    }
                    break;
                } else if (judge.equals("N") || judge.equals("n")) {
                    for (File file : fileList) {
                        temp_ = file.getName().split("\\.");
                        if (Arrays.asList(excludeExtension).contains(temp_[1])) {
                            ;
                        } else {
                            count++;
                        }
                    }
                    break;
                } else {
                    System.out.println("Y 또는 N 을 입력해주세요.");
                }
            }

            System.out.println("\n\n");
            System.out.println(fileList.length + "개의 파일 중 " + count + "개의 파일을 정리하시겠습니까? (Y/N)");
            count = 1;
            while (true) {
                judge = scanner.nextLine();
                if (judge.equals("Y") || judge.equals("y")) {
                    for (File file : fileList) {
                        temp_ = file.getName().split("\\.");
                        if (Arrays.asList(excludeExtension).contains(temp_[1])) {
                            ;
                        } else {
                            File rename = new File("data/" + String.format("%s%0" + number + "d.%s", head, count, temp_[1]));
                            file.renameTo(rename);
                            count++;
                        }
                    }
                    System.out.println();
                    break;
                } else if (judge.equals("N") || judge.equals("n")) {
                    System.out.println("정리하지 않고 프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("Y 또는 N 을 입력해주세요.");
                }
            }
        } else {
            System.out.println("해당 폴더에 파일이 없습니다.");
        }
    }
}