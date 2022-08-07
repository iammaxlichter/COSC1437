package CHAPTER13;

import java.nio.file.Path;
import java.nio.file.Paths;


class CompareFolders{

    public static void main(String[] args) {
        Path file1 = Paths.get("/root/sandbox/TestData1.txt");
        Path file2 = Paths.get("/root/sandbox/TestData2.txt");
        Path file3 = Paths.get("/root/sandbox/TestData3.txt");
        if(file1.getParent().equals(file3.getParent()) && file2.getParent().equals(file3.getParent()) && file1.getParent().equals(file2.getParent())){
            System.out.println("All files are in the same folder");
        }
        else{
            System.out.println("Files are not in the same folder");
        }
    }
}