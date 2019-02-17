package Composition;

public class PC {

	public Case getTheCase() {
		return theCase;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public Motherboard getMotherboard() {
		return motherboard;
	}
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
}
