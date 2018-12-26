import java.net.Socket;
import java.io.OutputStream;
import java.io.DataOutputStream;

public class C
{
	public static void main(String [] args) throws Exception
	{
		Socket s = new Socket("127.0.0.1",5000);
		String msg = "Hi Server !";
		
		OutputStream ostream = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(ostream);
		dos.writeBytes(msg);
		dos.close();
		ostream.close();
		s.close();
	}
} 