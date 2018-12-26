import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Server
{
	public static void main(String [] args)throws Exception
	{
		ServerSocket ss = new ServerSocket(5000);
		Socket s = ss.accept();
		
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		
		OutputStream o = s.getOutputStream();
		PrintWriter pwrite = new PrintWriter(o,true);
		
		InputStream i = s.getInputStream();
		BufferedReader recieved = new BufferedReader(new InputStreamReader(i));
		
		//System.out.println("Start ChitChat ! Type And Press Enter");

		String send,recv;
		while(true)
		{
			if((recv = recieved.readLine())!=null)
			{
				System.out.println(recv);
			}
			send = keyRead.readLine();
			pwrite.println(send);
			pwrite.flush();		

		}
	}
}