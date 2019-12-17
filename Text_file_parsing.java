import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


public class Text_file_parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String fileName = "source.txt",str="";
			File file = new File(fileName);
			try 
			{
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String revStr="",line;
				while((line = br.readLine()) != null)
				{
					str=str+line;
				}
				for(int i=str.length()-1;i>=0;i--)
				{
					revStr=revStr+str.charAt(i);
				}
				 try (FileWriter file1 = new FileWriter("dest.txt")) 
				{
					file1.write(revStr);
					System.out.println("Successfully wrote to a file");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
					 
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		    //process the line
		}
		
		

}
