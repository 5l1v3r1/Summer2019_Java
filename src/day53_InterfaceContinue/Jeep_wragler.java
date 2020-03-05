package day53_InterfaceContinue;

public class Jeep_wragler implements Cars, GasVehicles{

	@Override
	public void start() {
		System.out.println("call mechanic");
		System.out.println("oil change");
		System.out.println("jump start");
	}

	@Override
	public void PumpGas() {
		System.out.println("pumping gas");
	}
	
	

}
