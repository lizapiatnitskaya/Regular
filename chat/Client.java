package chat;
import java.net.*;
import java.io.*;


public class Client extends ChatEngine {
	Client(String ip) throws IOException{
		super(new Socket(InetAddress.getByName(ip),8030));
		System.out.println("Client" );
	}
	
	/*public static void main(String[] args) throws IOException{
		Socket socket = null;
		try{
		ServerSocket server=new ServerSocket (8030);
		socket = server.accept();
		PrintStream ps = new PrintStream (socket.getOutputStream());
		BufferedReader by = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		Scanner in = new Scanner(System.in);
		String msg = in.nextLine();
		System.out.println("<" + msg);
		ps.println(msg);
		ps.flush();
		msg = by.readLine();
		System.out.println(">" + msg);
		ps.close();

		}
		catch(IOException e){
		System.err.println("Err" + e);
		}
		finally {
		if(socket!=null)
		socket.close();
	
	}
	}*/

}
