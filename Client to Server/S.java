import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class S
{
	public static void main(String [] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("Server is Ready !");
		
		Socket s = ss.accept();

		InputStream istream = s.getInputStream();
		//DataInputStream ids = new DataInputStream(istream);
		
		BufferedReader d = new BufferedReader(new InputStreamReader(istream));
		
		String msg = d.readLine();
		System.out.println(msg);
		d.close();
		istream.close();
		s.close();
		ss.close();
	}
} 