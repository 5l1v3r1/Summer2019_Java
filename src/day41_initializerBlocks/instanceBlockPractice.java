package day41_initializerBlocks;

public class instanceBlockPractice {
	
	public String name = "kaka";
	
	public instanceBlockPractice(){
		name = "gaga";
	}
	
	{
		name = "lolo";
	}
	
	public static void main(String[] args) {
		instanceBlockPractice obj = new instanceBlockPractice();
		obj.name = "momo";
		System.out.println(obj.name); 
		
	}

}
