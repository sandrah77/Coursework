/* Create a class OldPhone that implements the following interface.
 
	// A phone makes calls

public interface Phone { 
	// Just print on the screen: "Calling <number>...".
	void call(String number);
	}

Now create a class MobilePhone that extends OldPhone and adds methods for things like ringAlarm(String) 
and playGame(String). This class keeps a list of the last ten numbers that have been called, which can be 
rinted with the method printLastNumbers(). Then create a class SmartPhone that extends MobilePhone and 
adds methods for browseWeb(String) and findPosition(), the latter returning a (fictitious) GPS-found 
position. Create a small script called PhoneLauncher in which you create a SmartPhone and use all its methods, including those inherited from its ancestor classes.
*/

public class PhoneLauncher {
	public static void main (Stirng[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		
		System.out.println("Testing ...");
		OldPhone stephenPhone = new OldPhone(123);
		MobilePhone stephenPhone = new MobilePhone();
		OldPhone stephenPhone2 = new MobilePhone();
		Phone stephenPhone3 = new OldPhone();
		Phone stephenPhone4 = new MobilePhone();

		//stephenPhone.call("0013455453637");
		//stephenPhone.call("0013455453637");
		//stephenPhone.ringAlarm("10:30am");
		//stephenPhone3.ringAlarm("10:30am");
		stephenPhone3.call("0013455453637");
		stephenPhone4.call("0013455453637");
	}
}