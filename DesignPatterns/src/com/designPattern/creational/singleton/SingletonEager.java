package com.designPattern.creational.singleton;


class SingletonEager {

	private static SingletonEager instance = new SingletonEager();  // private static --- data member eager initialization
																	
	private SingletonEager() {    									// private constructor
	}											 
	public static SingletonEager getInstance() { 					// public static get method
		
		return instance;
	
	}
	
}
//--------------------------------------------------------------------------------
class Singleton {

	private static Singleton instance; 								// private static --data member lazy initialization

	private Singleton() {											// private constructor			
	} 

	public static Singleton getInstance() { 						// public static get method
		if (instance == null) {
			instance = new Singleton();

		}
		return instance;
	}
}
//-----------------------------------------------------------------------------------	
																					//thread safe
class SingletonSyncMethod{

		private  static SingletonSyncMethod instance ;                            // private static --- data member eager initialization
																		
		private SingletonSyncMethod() {}  										 // private constructor
													 
		public static  synchronized SingletonSyncMethod getInstance() { 		// public static get method
			if(instance == null) {
				instance = new SingletonSyncMethod();	
				
				System.out.println(instance);	
			}
			return instance;
		}
	}

//--------------------------------------------------------------------------------------

class SingletonSyncBlock{

	private  static SingletonSyncBlock instance ;                            // private static --- data member eager initialization
																	
	private SingletonSyncBlock() {}  										// private constructor
												 
	public static   SingletonSyncBlock getInstance() { 					   // public static get method
		if(instance == null) {	
			synchronized(SingletonSyncBlock.class) {
				instance = new SingletonSyncBlock();
			}
			System.out.println(instance);	
		}
		return instance;
	}
}

//---------------------------------------------------------------------------------------



 class SingletonExample {
	 
	 public static  void main(String [] args) {
		 
		 SingletonEager Eager = SingletonEager.getInstance();
		 System.out.println(Eager);
		  
		 Singleton Lazy =Singleton.getInstance();
		 System.out.println(Lazy);
		 
		 SingletonSyncMethod syncMethod= SingletonSyncMethod.getInstance(); 
		 System.out.println(syncMethod);
		 SingletonSyncBlock  syncMethodblock = SingletonSyncBlock.getInstance();
		 System.out.println(syncMethodblock);
	 }

}












//Rules Singleton :

//static member of class, private constructor and static factory method.

//1. Data members -Private Static
//2. Constructor -Private
//3. Getter -Public
//4. Eager_Initialisation ,Lazy_Initialisation,Synchronized Block,Synchronized Method .

//There are two forms of singleton design pattern
//
//Early Instantiation: creation of instance at load time.
//Lazy Instantiation: creation of instance when required.

//Advantage::
//Saves memory because object is not created at each request. Only single instance is reused again and again.

//Usage::
//Multi threaded and database applications . Used in logging, caching, thread pools, configuration settings.

//Static member: It gets memory only once because of static, it contains the instance of the Singleton class.
//Private constructor: It will prevent to instantiate the Singleton class from outside the class.
//Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.
