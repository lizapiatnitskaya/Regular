package words;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Collections;

public class Regular {
	public static void main(String[] args)
	{
		
		int i=0;
		ArrayList vocabulary = new ArrayList();
        String regex = "[^ .?!;:,-]+";
		String s = "ONCE upon a midnight dreary, while I pondered, weak and weary. Over many a quaint and curious volume of forgotten lore.";
		Pattern p2 = Pattern.compile(regex);
		Matcher m2 = p2.matcher(s);
		
		
			   while (m2.find())
				{
					vocabulary.add(m2.group());
					i++;
				}
	    Collections.sort(vocabulary);
			   
			   
			
	
		
		for( int j=0;j<i;j++)
		{
		System.out.println(vocabulary.get(j));
		}
	}

}
