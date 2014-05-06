package chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.*;

public class ChatEngine {
	Scanner networkInput;
	PrintStream networkOutput;
	
public ChatEngine(Socket socket) throws IOException {
	
	networkInput= new Scanner (socket.getInputStream());
	networkOutput= new PrintStream (socket.getOutputStream());
	
	}
public void run(){
	String msg;
	Scanner consoleIn = new Scanner(System.in);
	 PrintStream consoleOut = System.out;
	while(true){
		//if(consoleIn.hasNextLine()){
			msg = consoleIn.nextLine();
			networkOutput.println(msg);
			networkOutput.flush();
		//}
		//if(networkInput.hasNextLine()){
			msg = networkInput.nextLine();
			consoleOut.println("<" + msg);
			consoleOut.flush(); 
		//}
		 try {
			   Thread.sleep(100);
			  } catch (InterruptedException e) {

			  }
		
		
	}
}
		
	}


