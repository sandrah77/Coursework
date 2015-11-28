public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	

	public Patient (String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; 
		System.out.println("Patient: " + this.name + ", age: " + this.age);
	}
	/*
	public void nextPatient(int x) {
		if (this.nextPatient == null) {
			x++;
			} else {
			System.out.println (this.Patient.patientListStart);
			}
		}
	}*/

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
		// this means this is the last patient in the list
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public String getName(){
		return this.name;
	}

	public boolean deletePatient (Patient patient) {
		if (this.nextPatient == null) {
			// patient to remove was not found
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			this.nextPatient = this.nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
		

	}
}

