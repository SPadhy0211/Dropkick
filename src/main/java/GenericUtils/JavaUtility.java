package GenericUtils;

import java.util.Random;

public class JavaUtility {
	
	public int getRandomNum()
	{
		Random rn = new Random();
	    int ran = rn.nextInt(1000);
	    return ran;
	}

}
