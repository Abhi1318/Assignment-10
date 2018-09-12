import java.io.*;
public class copytextfile1
{
    public static void main(String ars[])
    {
        File f=new File("C:/Users/Abhishek Mittal/Desktop/Java Assignments/Assignment 10/abc.txt");
		File f1=new File("C:/Users/Abhishek Mittal/Desktop/Java Assignments/Assignment 10/xyz.txt");
		
		try
		{
			FileInputStream fin=new FileInputStream(f);
			FileOutputStream fout=new FileOutputStream(f1);
			int i;
			i=fin.read();
			
			while(i!=-1)
			{
				fout.write((char)i);
				i=fin.read();
				
			}
			fin.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}


		try{
			FileInputStream fin=new FileInputStream(f1);
			int i;
			i=fin.read();
			
			while(i!=-1)
			{
				System.out.print((char)i);
				i=fin.read();
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		
       
    }
}