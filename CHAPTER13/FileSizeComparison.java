package CHAPTER13;

import java.nio.file.*;

public class FileSizeComparison {

    public static void main(String[] args) {
            Path textFile = Paths.get("lyric1.txt");
            Path wordFile = Paths.get("lyric2.txt");

            long size1 = textFile.toFile().length();
            long size2 = wordFile.toFile().length();
            
            System.out.println(size1 + " " + size2 + " " + (size1 * 100.0/size2));
            
    }       

}
