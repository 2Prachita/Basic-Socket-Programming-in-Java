import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class S
{
	public static void main(String [] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("Server is Ready !");
		
		Socket s = ss.accept();
		
		OutputStream o = s.getOutputStream();
		BufferedWriter b = new BufferedWriter(new OutputStreamWriter(o));

		String msg = "Thanks Client for Calling !";	
		b.write(msg);
		
		b.close();
		o.close();
		s.close();
		ss.close();
	}
} 