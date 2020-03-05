package day53_InterfaceContinue;

public class Tesla_Model3 implements Cars, ElectricVehicles {

	@Override
	public void start() {
		System.out.println("Voice Control \" Tesla Startv \" ");
		
	}
	
	@Override
	public void charge() {
		System.out.println("Charging");
	}
	
	@Override
	public void SelfDrive() {
		System.out.println("Self Driving Mode");
	}

	@Override
	public void fly() {
		System.out.println("tesla is flying");
	}
	
	
}
