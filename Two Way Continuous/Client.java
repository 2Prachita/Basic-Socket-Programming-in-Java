import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public Class Client
{
	public static void main(String [] args)throws Exception
	{
		Socket s = new Socket("127.0.0.1",5000);
		
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		
		OutputStream o = s.getOutputStream();
		PrintWriter pwrite = new PrintWriter(o,true);
		
		InputStream i = s.getInputStream();
		BufferedReader recieved = new BufferedReader(new InputStreamReader(i));
		
		System.out.println("Start ChitChat ! Type And Press Enter");

		String send,recv;
		while(true)
		{
			send = keyRead.readLine();
			pwrite.println(send);
			pwrite.flush();
			if((recv = recieved.readLine())!=null)
			{
				System.out.println(recv);
			}
		}
	}
}