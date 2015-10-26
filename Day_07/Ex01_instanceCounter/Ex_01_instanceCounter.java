class Ex_01_instanceCounter
{

	private static int spyCount = 0;
	private int spyID;

	public void Ex_01_instanceCounter(int n)
	{
		this.spyID = n;
		spyCount++;
		System.out.println("The number of spies is " + spyCount);
	}

	public void die()
	{
		System.out.println("Spy number " + this.spyID + " has been eliminated");
		spyCount--;
		System.out.println("The number of spies is " + spyCount);
	}

	public static void main(String[] args) {
		Ex_01_instanceCounter bond = new Ex_01_instanceCounter(70);
		Ex_01_instanceCounter katzenjammer = new Ex_01_instanceCounter(71);
		Ex_01_instanceCounter farmer = new Ex_01_instanceCounter(72);
		bond.die();
		Ex_01_instanceCounter mySpy = new Ex_01_instanceCounter(73);
	}

}