public class HospitalManager {
	private Patient patientListStart = null;

	public static void main (String[]args) {

		HospitalManager hm = new HospitalManager();
		hm.launch();
		//
	}

	// ...inside some method, maybe launch()
	public void launch() {
		Patient firstPatient = new Patient ("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		Patient yetAnotherPatient = new Patient ("Mary", 66, "Meningitis");
		patientListStart.addPatient(yetAnotherPatient);
		Patient andAnother = new Patient ("Stephen", 28, "Head Probs");
		patientListStart.addPatient(andAnother);
		}
	}
}

	