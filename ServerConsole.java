import java.utils.Scanner;

import common.*;
import client.*;

public class ServerConsole implements ChatIF{
	
	final public static int DEFAULT_PORT = 5555;
	
	Scanner fromConsole;
	EchoServer server;
	
//Constructor

	public ServerConsole(){
		try{
			this.server = server;
			accept();
		}
		catch(Exception e){
			System.out.println("Unexpected error; could not accept messages from server.");
			System.exit(1);
		}
	}
	
	public void accpet(){
		
		try{
			
			String message;
			while (true){
				message = fromConsole.nextLine();
				
				server.handleMessageFromServer("SERVER MSG> "+ message);
		}
		
	}
	catch(Exception ex){
		
		System.out.println("Unexpected error while reading from console!");
		System.exit(0);
		break;
	}
	}
	
	public void display(String message){
		  
    System.out.println("> " + message);
	
	}
	
	public void listen(){
	
		try{
			server.listen();
		}
		catch(Exception ex){
			System.out.println("Unexpected error: listen for clients failed.")
		}
	}
}