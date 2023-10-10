package GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.FILE_PATH);
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj.getProperty(key);
	}

}
