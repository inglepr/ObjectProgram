package addressbook;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import addressbook.Person;

public interface IAddress 

{
	ObjectMapper objectmapper =new ObjectMapper();
	public static File getPathOfFile(String fileName, String fileExtension)
	{
		fileName = "/home/admin1/eclipse-workspace/ObjectOrintedProgram/src/addressbook/"
				+ fileName + fileExtension;
		
		File file = new File(fileName);
		
		return file;
	}
	public static void saveFile(File file)
	{
		List<Person> updatedList =FileSys.getList();
		try { 
			//convert java object to json PrettyPrint
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(file, updatedList);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void readFile(File file)
	{
		try 
		{
       FileSys.setList(objectmapper.readValue(file, new TypeReference<List<Person>>() {}));
		} 
		catch (IOException e) 
		{
			System.out.println("\nFile Not Found!\n");
		}
	}
	
}
