package FileRename;

import java.io.File;
import java.util.Objects;

public class first {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\DW\\Desktop\\example\\text3.txt");
        File file = new File("C:\\Users\\DW\\Desktop\\example");

//        File newFile = new File("C:\\Users\\DW\\Desktop\\example\\text3_success.txt");
        File[] files = file.listFiles();

//        boolean result = file.renameTo(newFile);
//        System.out.println(result);
        assert files != null;
        for(File file2 : files){
            File newFile = new File("C:\\Users\\DW\\Desktop\\example"+"40-2024-032330"+file.getName());
            file2.renameTo(newFile);
        }


//        for(int i = 0; i < Objects.requireNonNull(files).length; i++)
//        {
//            File newFile = new File("C:\\Users\\DW\\Desktop\\example" +"40-2024-04223"+i);
//            file.renameTo(newFile);
//        }
    }
}
