package CHAPTER13;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ValidateCheckDigits {
    private static boolean isValidAccNum(String accNum) {
        if (accNum == null || accNum.length() != 6) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (!Character.isDigit(accNum.charAt(i))) {
                return false;
            }
            sum += accNum.charAt(i) - '0';
        }
        if (!Character.isDigit(accNum.charAt(5))) {
            return false;
        }
        int lastDigit = accNum.charAt(5) - '0';
        return (sum % 10 == lastDigit);
    }

    public static void main(String[] args) {
        Path fileIn = Paths.get("/root/sandbox/AcctNumsIn.txt");
        Path fileOut = Paths.get("/root/sandbox/AcctNumsOut.txt");

        try {
            List<String> lines = Files.readAllLines(fileIn);
            BufferedWriter writer = Files.newBufferedWriter(fileOut);

            for (String line : lines) {
                if (isValidAccNum(line)) {
                    writer.write(line + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}