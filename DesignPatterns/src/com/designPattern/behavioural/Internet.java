package com.designPattern.behavioural;

import java.util.ArrayList;
import java.util.List;


public interface Internet {

		void connectTo(String serverhost) throws Exception;
}

//------------------------------------------------------------
 
class RealInternet implements Internet{

	@Override
	public void connectTo(String serverhost) throws Exception {
		System.out.println("Connecting :" +serverhost );
		
	}
	
}



class ProxyInternet implements Internet{
	
	Internet internet=new RealInternet();
	
	static List<String> banned ;
	
	static{
		banned=new ArrayList<>();
		banned.add("abcd.com");
		banned.add("Java.com");
		banned.add("server.com");
	}

	
	
	@Override
	public void connectTo(String serverhost) throws Exception {
		if(banned.contains(serverhost.toLowerCase())){
			throw new Exception("Access Denied");
			
		}
		internet.connectTo(serverhost);
		
		
	}
	
}


class Client{
	public static void main(String[] args) {
		Internet pinternet=new ProxyInternet();
		
		try {
			pinternet.connectTo("google.in");
			pinternet.connectTo("abcd.com");
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			
			System.out.println( e.getMessage());
		}
		
		
		
	}
}
