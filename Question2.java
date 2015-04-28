<<<<<<< HEAD
﻿import java.io.File;
import.java.io.IOException;
=======
﻿import java.io.*;
import java.util.*;
>>>>>>> B_Branch

public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Source.txt");
		updateFile("Dest.txt");
	}
<<<<<<< HEAD
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
=======
	public static void editFile(String content){
		
	try{

		int  u;
		String line;
		String context;
		String context2="";
		String line2;
		FileReader fw=new FileReader(content);
		BufferedReader br=new BufferedReader(fw);
		while((context=br.readLine())!=null)
			context2+=context;
		context2=context2.replace("a", "");
		context2=context2.replace("e", "");
		context2=context2.replace("i", "");
		context2=context2.replace("o", "");
		context2=context2.replace("u", "");


			System.out.print(context2);

		
	}catch(Exception e){
		System.out.println(e.toString());
	}
	}

}

>>>>>>> B_Branch
