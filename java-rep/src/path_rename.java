import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class path_rename {
    public static void main(String[] args) {
        Path source = Paths.get("C:\\Users\\DW\\Desktop\\example\text3.txt");
        try{
            Files.move(source, source.resolveSibling("C:\\Users\\DW\\Desktop\\example\text3_success.txt"));
            System.out.println("이름변경 성공!");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
