import java.util.ArrayList;
import java.util.Collection;

public class Parser {
	
	public static String parseToString(Collection<String> list) {
		StringBuilder builder = new StringBuilder();
		for (String string : list) {
			builder.append(string);
		}
		
		return builder.toString();
	}
}
