package com.capgemini.day7;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Random;
	import java.util.TreeSet;
	public class RandomNumber {
	
		public static Object randomGen() {
			// TODO Auto-generated method stub
			Random rand = new Random();
			File file=new File("C:\\Users\\lpilaka\\Desktop\\Sameera\\boy.txt");
			
			
			try(FileWriter filewriter=new FileWriter(file);
					PrintWriter writer=new PrintWriter(filewriter);) {
				for(int i=0;i<100;i++)
				{
					int  n = rand.nextInt(50) + 1;
					String str="";
					str=str+Integer.toString(n);
					writer.print(str);
					writer.println();
				}
			} 
			
			
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



	

			try(FileReader filereader = new FileReader("C:\\Users\\lpilaka\\Desktop\\Sameera\\boy.txt");
					BufferedReader reader= new BufferedReader(filereader);) {
				TreeSet<Integer> boyNumer=new TreeSet<>();
				String s;
				while((s=reader.readLine())!=null)
				{
					int temp;
					temp=Integer.parseInt(s);
					boyNumer.add(temp);
				}
				
				System.out.println(boyNumer);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			
			
			

			return null;
		}



}
