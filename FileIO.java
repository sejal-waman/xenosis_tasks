//file in java


import java.util.Scanner;
import java.io.*;
import java.io.FileWriter; 
import java.io.FileReader; 

class FileIO
{
	public static void main(String args[])
	{
		try
		{
			//for creating file
			File f=new File("file.txt");
			f.createNewFile();
			
			//for writing the content in the file
			String writing="Saurabh Wakchaure";
			FileWriter fw=new FileWriter("file.txt");
			for(int i=0;i<writing.length();i++)
			{
				fw.write(writing.charAt(i));
			} 
			fw.close(); 
			
			FileReader fr=new FileReader("file.txt");
			int ch;
			System.out.print("file content is:");
			while((ch=fr.read())!=-1)
			{
				System.out.print((char)ch);
			}
			System.out.println();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
