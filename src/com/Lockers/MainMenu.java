package com.Lockers;

import java.util.Scanner;
public class MainMenu {
private int ch;
	
	
	public void displayMenu()
	{
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.print("\n\nEnter your Choice from the following menu");
		System.out.print("\n \n1.list of all Files"+"\n"+"2.User Interface"+"\n"+"3.Close");
		ch=Integer.parseInt(sc.nextLine());
		AllMethod allM=new AllMethod();

		switch(ch)
		{
			case 1: allM.getAllFiles();
			break;
			case 2:int ch1;
			do
				{		
					System.out.println("*******************************");
					System.out.println("Choose From following option "+"\n"+"1.Add File"+"\n"+"2.Delete File"+"\n"+"3.Search File"+"\n"+"4.Back");
					System.out.println("*******************************");
					//obj=new Scanner(System.in);
					ch1=Integer.parseInt(sc.nextLine());
					switch(ch1)
					{
					case 1:allM.addFiles();
					break;
					case 2:allM.deleteFiles();
					break;
					case 3:allM.searchFiles();
					break;
					case 4: displayMenu();
					break;
					default: System.out.println("Enter Correct Choice:");
					}
				}while(ch1>0);
			break;
			case 3:System.exit(0);
			break;
			default:System.out.println("Enter Correct Choice");
		}		
		}while(ch>=0);
		sc.close();


}
}