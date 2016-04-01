package byte_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
	
	private static final String FILE_NAME = "image.jpg";
	private static final String FILE_NAME_DEST = "copy_" + FILE_NAME;
	
	public static void main(String[] args) {
		
		try(InputStream inpS  = new FileInputStream(FILE_NAME);
			OutputStream outS = new FileOutputStream(FILE_NAME_DEST)) {
			
//			copy(inpS, outS);
			copyWithBuffer(inpS, outS);
		} 
		catch (IOException e) { e.printStackTrace(); }
	}
	
	private static void copy(InputStream inpS, OutputStream outS) throws IOException {
		for(int b = inpS.read(); b != -1; b = inpS.read())
			outS.write(b);
	}
	
	private static void copyWithBuffer(InputStream inpS, OutputStream outS) throws IOException {
		byte[] buffer = new byte[1024];
		while(inpS.read(buffer) != -1)
			outS.write(buffer);
	}
}