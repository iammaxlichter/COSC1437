package CHAPTER13;

import java.nio.file.*;

import java.io.*;

public class DebugThirteen2 {

	public static void main(String[] args) {

        Path fileIn = Paths.get("/root/sandbox/DebugData2.txt");
        Path fileOut = Paths.get("/root/sandbox/DebugData2New.txt");

		String areaCode = "(312) ";
		String phone;
		InputStream input = null;
		OutputStream output = null;

		try {

			input = Files.newInputStream(fileIn);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			output = Files.newOutputStream(fileOut);
			phone = reader.readLine();

			while (phone != null) {
				phone = areaCode + phone + System.getProperty("line.separator");
				byte[] phoneBytes = phone.getBytes();
				output.write(phoneBytes);
				phone = reader.readLine();
			}

			input.close();
			output.close();
		}

		catch (IOException e) {
		    System.out.println(e);
		}

	}

}
