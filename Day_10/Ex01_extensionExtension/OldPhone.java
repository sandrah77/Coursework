public class OldPhone implements Phone {

	private int serialNumber;

	OldPhone(int sn) {
		this.serialNumber = sn;
	}

	OldPhone() {
		this.serialNumber = 0;
	}


	public void call(String number)
	{
		System.out.println("Calling: " + number + " now.");

	}


}