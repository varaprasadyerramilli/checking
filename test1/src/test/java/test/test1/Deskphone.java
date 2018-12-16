package test.test1;

public class Deskphone implements Itelephone {

	public Deskphone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	private int myNumber;
	private boolean isRinging;
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Deskphone is always on");
		
	}

	@Override
	public void dial(int phonenumber) {
		// TODO Auto-generated method stub
		System.out.println("Now ringing " + phonenumber+ " on the deskphone");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging)
		{
			System.out.println("Answering the deskphone");
			isRinging= false;
		}
		
	}

	@Override
	public boolean callPhone(int phonenumber) {
		// TODO Auto-generated method stub
		if(phonenumber==myNumber)
		{
			isRinging=true;
			System.out.println("Ring Ring");
		}
		else
		{
			isRinging=false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}

}
