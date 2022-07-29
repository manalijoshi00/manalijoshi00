import java.io.FileInputStream;
import java.io.IOException;
public class TextFileReader
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream input = new FileInputStream("Files.txt");
                  int i = input.read();
			while(i != -1)
			{
				System.out.println((char) i);
                        i = input.read();
			}
                  input.close();
		}
		catch(IOException ex)
		{
			 ex.printStackTrace();
		}
	}
}