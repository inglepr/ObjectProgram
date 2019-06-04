package addressbook;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import addressbook.Person;

public class FileSys implements IAddress {
	public static List<Person> personList = null;
	public static ObjectMapper objM = new ObjectMapper();

	public static void setList(List<Person> personList) {
		FileSys.personList = personList;
	}

	public static List<Person> getList() {
		return personList;
	}

	public static File createNewFile(String fileName, String fileExtension) {
		File file = IAddress.getPathOfFile(fileName, fileExtension);
		try {
			
			FileWriter newFileWritten = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return file;
	}
}