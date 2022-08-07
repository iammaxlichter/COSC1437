package CHAPTER13;

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class SeekPosition2{

    public static void main(String[] args) throws IOException{

        int index;
        String file_name;
        int noOfChars;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file name >> ");
        file_name = scanner.nextLine();
        System.out.println("Enter a position number >> ");
        index = scanner.nextInt();
        System.out.println("Enter number of characters to display >> ");
        noOfChars = scanner.nextInt();

        Path path = Paths.get(file_name);
        ByteBuffer buffer = null;

        try(FileChannel fc = FileChannel.open(path,READ)) {
            fc.position(index);
            buffer = ByteBuffer.allocate(noOfChars);
            fc.read(buffer);
            String output=new String(buffer.array());
            buffer.clear();
            System.out.println(output);
        }
        catch (IOException e) {
            System.err.println("I/O Error: " + e);
        }
        scanner.close();
    }

}
