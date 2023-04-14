package FilesChapt15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class DirectoryStream {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\ADMIN\\Desktop\\regnos");
        try(java.nio.file.DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            Iterator<Path> iterator = directoryStream.iterator();
            if (iterator.hasNext()){
                Path path1 = iterator.next();
                System.out.println(path1.getFileSystem());
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
