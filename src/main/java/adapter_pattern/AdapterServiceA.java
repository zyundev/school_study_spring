package adapter_pattern;

public class AdapterServiceA {

	ServiceA sa1 = new ServiceA();
	
	void runService() {
		sa1.runServiceA();
	}
}
