package chat;

public class ChatApplication {
	public static void main(String[] args){
		ChatEngine engine;
		try{
			
		if(args.length!=0){
			engine = new Client(args[0]);
			
					}
		else{
			 engine = new Server();
			 
		}
		engine.run();
		}
		catch(Exception e){
			System.out.println("Could not create socket "+args[0]+":8030");
		
		}
		
		
		
	}

}
