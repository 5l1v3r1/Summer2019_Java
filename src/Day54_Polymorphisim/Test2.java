package Day54_Polymorphisim;

interface InterFace {
	abstract void get();
}

interface InterFace2 extends InterFace{
	abstract void frame();
}



public class Test2 implements InterFace, InterFace2 {

	public static void main(String[] args) {
		InterFace obj = new Test2(); 
		obj.get();
		
		InterFace2 obj2 = new Test2();
		obj2.frame(); // frame
		obj2.get();
		
	
		
	}

	@Override
	public void get() {      // InterFace's overridden method
		System.out.println("Chrome browser");
	}

	@Override
	public void frame() {    // InterFace2's overridden method
		System.out.println("frame");
	}
	
}
