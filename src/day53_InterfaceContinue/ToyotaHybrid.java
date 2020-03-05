package day53_InterfaceContinue;

public class ToyotaHybrid implements Cars, ElectricVehicles, GasVehicles{

	@Override
	public void PumpGas() {
		System.out.println("pumping gas");
	}

	@Override
	public void charge() {
		System.out.println("charging");
	}

	@Override
	public void SelfDrive() {
		System.out.println("self driving mode");
	}

	@Override
	public void start() {
		System.out.println("push start button");
	}

	@Override
	public void fly() {
		System.out.println("toyota is flying");
	}

}
