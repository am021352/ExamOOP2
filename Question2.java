import java.io.File;
import.java.io.IOException;

public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");
	}
}

public static void txtCopy(String content,String temp)
{
	try
	{
		FileReader fr=new FileReader(content);
		FileWriter fw=new FileWriter(temp);
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
		 	fw.write(line+"\r\n");
		}
			fw.close();
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
}