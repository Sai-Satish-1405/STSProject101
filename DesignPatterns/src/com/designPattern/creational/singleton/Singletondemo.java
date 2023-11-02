package com.designPattern.creational.singleton;

class SingletonLazy {
	
//Lazy	
	private static SingletonLazy instance ;
	private SingletonLazy() {	
	}
	public static  SingletonLazy getInstance() {
	 	if(instance==null) {
	 		instance =new SingletonLazy();
	 	}	
	 		return instance;
}
}

//Early
 
class SingletonEager1{
	
	private static SingletonEager1 instance =new SingletonEager1();
	private SingletonEager1() {	
	}
	public static SingletonEager1 getInstance1() {	
		return instance;	
	}	
}

//Synchronized -MultiThrteaded
class SingletonSync{
	
	private static SingletonSync instance ;
	private SingletonSync() {	
	}
	public static synchronized SingletonSync getInstance2() {
		if(instance == null) {
			instance=new SingletonSync();
		}
		return instance;	
	}
	public static SingletonSync getInstance3() {
		// TODO Auto-generated method stub
		return null;
	}	
}


//Synchronized block

class SingletonSync2{
	
	private static SingletonSync2 instance ;
	private SingletonSync2() {	
	}
	public static synchronized SingletonSync2 getInstance3() {
		synchronized(SingletonSync2.class){
			
			if(instance == null) {
				instance=new SingletonSync2();
			}		
		}
		
		
		return instance;	
	}	
}



class SingletonTest{
	
	public static void main(String[] args) {
			
		SingletonLazy	lazy =SingletonLazy.getInstance();
		SingletonEager1 eager=SingletonEager1.getInstance1();
		SingletonSync sync1 =SingletonSync.getInstance2();
		SingletonSync2 sync2 =SingletonSync2.getInstance3();
		
		SingletonLazy	lazy1 =SingletonLazy.getInstance();
		SingletonEager1 eager1=SingletonEager1.getInstance1();
		SingletonSync sync11 =SingletonSync.getInstance2();
		SingletonSync2 sync21 =SingletonSync2.getInstance3();	
		
		System.out.println(lazy.hashCode() +"\n"+lazy1.hashCode() +"\n"+eager.hashCode()+"\n"+eager1.hashCode()+"\n"+sync1.hashCode()+"\n"+sync11.hashCode()+"\n"+sync2.hashCode()+"\n"+sync21.hashCode());
		
	}	
}
