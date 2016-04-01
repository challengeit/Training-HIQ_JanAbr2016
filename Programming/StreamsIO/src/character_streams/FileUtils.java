package character_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileUtils {

	private static final String FILE_NAME = "text.txt";
	private static final String FILE_NAME_DEST = "copy_" + FILE_NAME;

	public static void main(String[] args) {

		try(Reader reader = new BufferedReader(new FileReader(FILE_NAME));
			Writer writer = new BufferedWriter(new FileWriter(FILE_NAME_DEST))) {

//			copy(reader, writer);
			copyByteWithBuffer(reader, writer);
		} 
		catch (IOException e) { e.printStackTrace(); }
	}

	private static void copy(Reader reader, Writer writer) throws IOException {
		for(int c = reader.read(); c != -1; c = reader.read())
			writer.write(c);
	}
	
	private static void copyByteWithBuffer(Reader reader, Writer writer) throws IOException {
		// TODO read with buffer
		char[] buffer = new char[1024];
		int numberOfBytes;
		while((numberOfBytes = reader.read(buffer)) != -1) {
			
			if(reader.markSupported())
				reader.mark(10);
			
			
			if(reader.markSupported())
				reader.reset();
			
			writer.write(buffer, 0, numberOfBytes);		
		}
	}
	
	private static void copyByteWithBuffer(BufferedReader reader, BufferedWriter writer) throws IOException {
		// TODO read with buffer
		String str = null;
		while((str = reader.readLine()) != null) {
			writer.write(str);
			writer.newLine();
		}
	}
}
