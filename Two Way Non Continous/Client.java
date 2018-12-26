import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.InputStream;

public class Client
{
	public static void main(String [] args) throws Exception
	{
		Socket s = new Socket("127.0.0.1",4000);
		
		System.out.println("Enter the file name");
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		String fname = keyRead.readLine();
	
		OutputStream o = s.getOutputStream();
		PrintWriter pwrite = new PrintWriter(o,true);
		pwrite.println(fname);

		InputStream i = s.getInputStream();
		BufferedReader socketRead = new BufferedReader(new InputStreamReader(i));
		
		String str;
		while((str=socketRead.readLine())!=null)
		{
			System.out.println(str);
		}
		pwrite.close();
		socketRead.close();
		keyRead.close();
	}
}