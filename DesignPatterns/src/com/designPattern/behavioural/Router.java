package com.designPattern.behavioural;



public interface Router {
	void acceptData(String data);
	void sendData(String data);
	void visit(RouterVisitor v);
}

class Dlink implements Router{

	@Override
	public void acceptData(String data) {	
	}

	@Override
	public void sendData(String data) {
	}

	@Override
	public void visit(RouterVisitor v) {
			v.visit(this);
	}	
}
class Tplink implements Router{

	@Override
	public void acceptData(String data) {	
	}

	@Override
	public void sendData(String data) {
	}

	@Override
	public void visit(RouterVisitor v) {
		v.visit(this);	
	}	
}

class Huawei implements Router{

	@Override
	public void acceptData(String data) {
	}

	@Override
	public void sendData(String data) {
	}

	@Override
	public void visit(RouterVisitor v) {
		v.visit(this);
	}
}


interface RouterVisitor {
	
	void visit(Dlink dlink);
	void visit(Tplink tplink);
	void visit(Huawei huawei);
		
}


class Linuxconfig implements RouterVisitor{

	@Override
	public void visit(Dlink dlink) {
		System.out.println("Linux for Dlink" );
		
	}

	@Override
	public void visit(Tplink tplink) {
		System.out.println("Linux for Tplink" );
		
	}

	@Override
	public void visit(Huawei huawei) {
		System.out.println("Linux for Huawei" );
		
	}
	
}
class Mac implements RouterVisitor{

	@Override
	public void visit(Dlink dlink) {
		System.out.println("Mac for Dlink" );	
	}

	@Override
	public void visit(Tplink tplink) {
		System.out.println("Linux for Tplink" );
	}

	@Override
	public void visit(Huawei huawei) {
		System.out.println("Linux for Huawei" );		
	}
	
}



