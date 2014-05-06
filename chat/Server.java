package chat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;
import java.net.*;
import java.io.*;

public class Server extends ChatEngine {
	Server() throws IOException{
		super(new ServerSocket(8030).accept());
		System.out.println("Server" );
		
	}
	}
	//Scanner scanner = new Scanner (System.in);
	//Socket socket = new Socket(InetAddress.getLocalHost(),8030);
	//PrintStream ps = new PrintStream (socket.getOutputStream());
	//BufferedReader by = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	//void Print(){
	//String msg = by.readLine();
	//System.out.println(">" + msg);
	//System.out.print(">" + msg);
	//msg = scanner.nextLine();
	//ps.println(msg);
	//ps.flush();
	//ps.close();
	//socket.close();
	//}

