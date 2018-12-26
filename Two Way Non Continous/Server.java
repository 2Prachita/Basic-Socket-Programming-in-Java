import java.net.*;    
import java.io.*;
public class Server   
{
  	public static void main(String args[]) throws Exception
  	{     
  	   	ServerSocket ss = new ServerSocket(4000);
     		System.out.println("Server Ready !");

     		Socket s = ss.accept();            
     		System.out.println("Connected And Waiting !");
                                                                                                 
                               
     		InputStream i = s.getInputStream( );
     		BufferedReader fileRead =new BufferedReader(new InputStreamReader(i));
     		String fname = fileRead.readLine( );
                             
     		BufferedReader contentRead = new BufferedReader(new FileReader(fname) );
			           
                           
     		OutputStream o = s.getOutputStream( );
     		PrintWriter pwrite = new PrintWriter(o, true);
    
     		String str;
     		while((str = contentRead.readLine()) !=  null) 
     		{
			pwrite.println(str);        
     		}
 
     		s.close();  
		ss.close();       
     		pwrite.close();  
		fileRead.close(); 
		contentRead.close();
  	}
}