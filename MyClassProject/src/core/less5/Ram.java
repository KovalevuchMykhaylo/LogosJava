package core.less5;

public class Ram {
	
	private int frequency;
	
	private int capacyty;

	public Ram(int frequency, int capacyty) {
		super();
		this.frequency = frequency;
		this.capacyty = capacyty;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getCapacyty() {
		return capacyty;
	}

	public void setCapacyty(int capacyty) {
		this.capacyty = capacyty;
	}

	@Override
	public String toString() {
		return "Ram [frequency=" + frequency + ", capacyty=" + capacyty + "]";
	}

}
