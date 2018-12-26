import java.net.Socket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class C
{
	public static void main(String [] args) throws Exception
	{
		Socket s = new Socket("127.0.0.1",5000);
		
		InputStream i = s.getInputStream();
		BufferedReader r = new BufferedReader(new InputStreamReader(i)); 
		
		String recieved = r.readLine();
		System.out.println(recieved);

		r.close();
		i.close();
		s.close();
	}
} 