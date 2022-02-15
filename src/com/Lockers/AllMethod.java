
package com.Lockers;
   
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllMethod {
	private File file,file2;
	private String foldername,filename,newpath;
	private static String path="E:\\PhaseOne\\";

	Scanner sc=new Scanner(System.in);
	public void addFiles()
	{
	
		System.out.println("Enter your name");
		foldername=sc.nextLine();
		System.out.println("Enter file name which you want to create");
	    filename=sc.nextLine();
		newpath=path+foldername;
		File file=new File(newpath);
		boolean b=file.mkdir();
		File file2=new File(newpath+"\\"+filename);
		if(b)
		{
			try {
				file2.createNewFile();
				System.out.println("File created Successfully in  "+foldername+ " directory");
			} 
			catch (IOException e) {
				System.out.println("file not created");
			}
			
		}
		else {
			System.out.println("folder not created or it is allready exist");
			try {
				file2.createNewFile();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	public void deleteFiles()
	{
		System.out.println("Enter your name");
		 foldername=sc.nextLine();
	     newpath=path+foldername;
		 file=new File(newpath);
		if(file.isDirectory())
		{
			System.out.println("Enter File name");
			filename=sc.nextLine();
		     file2=new File(newpath+"\\"+filename);
			
			if(file2.delete())
			{
				System.out.println("File deleted Successfully");
			}
			else {
				System.out.println("File not Found");
			}
		}
		else {
				System.out.println("No such directory found");
			}
		
		

	}
	public void searchFiles()
	{
		System.out.println("Enter your name:");
		foldername=sc.nextLine();
		System.out.println("Enter file name which you want to search:");
		filename=sc.nextLine();
		file=new File(path+foldername+"\\"+filename);
		if(file.exists())
		{
			System.out.println("File is present in directory: "+foldername);
		}
		else {
			System.out.println("file is not found in "+foldername+" directory");
		}
		}
	public void getAllFiles()
	{
		List<String> srt=new ArrayList<>();
		file=new File(path);
		String[] fldr=file.list();
		for (var str : fldr) {
			newpath=path+str;
		file2=new File(newpath);
		String[] fldr2=file2.list();
		for (var str1 : fldr2) {
			srt.add(str1);
			//System.out.println(srt);
		}		
		}
		Collections.sort(srt);
		for (String sorted : srt) {
			System.out.println(sorted);

		}
				
	}
}
