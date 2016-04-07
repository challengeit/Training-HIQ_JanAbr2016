import java.util.*;

public class Labels_it_IT extends ListResourceBundle 
{
    private final Object[][] contents = {
	    { "s1", "Computer" },
	    { "s2", "Disco"    },
	    { "s3", "Monitore" },
	    { "s4", "Tastiera" },
	    { "title", "Benvenuto al Menu!" }
    };

    @Override
    public Object[][] getContents() 
    {
    	return contents;
    }
}