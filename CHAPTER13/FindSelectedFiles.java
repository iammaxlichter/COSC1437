package CHAPTER13;

import java.nio.file.*;

public class FindSelectedFiles {
    public static void main(String[] args) {
        Path f1 = Paths.get("/root/sandbox/autoexec.bat");
        Path f2 = Paths.get("/root/sandbox/CompareFolders.java");
        Path f3 = Paths.get("/root/sandbox/FileStatistics.class");
        Path f4 = Paths.get("/root/sandbox/Hello.doc");
        int c=0;
        int d=0;

        if (Files.exists(f1)){
        c++;
        }

        if(Files.exists(f2)){
        c++;
        }

        if(Files.exists(f3)){
        c++;
        }

        if(Files.exists(f4)){
        c++;
        }

        System.out.println(c + " of files exist");


        if(f1.getParent().equals(f3.getParent()) && f2.getParent().equals(f3.getParent()) && f1.getParent().equals(f2.getParent()) && f1.getParent().equals(f4.getParent())&& f4.getParent().equals(f2.getParent())&& f3.getParent().equals(f4.getParent())){
            System.out.println(d + " of files exist");
        }
    }
}