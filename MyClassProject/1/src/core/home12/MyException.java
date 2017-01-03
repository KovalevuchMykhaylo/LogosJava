package core.home12;

public class MyException extends Exception{
	
	private static final long serialVersionUID = -6482749748091743517L;

	@Override
	public void printStackTrace() {
		System.err.println("Error");
	}
}