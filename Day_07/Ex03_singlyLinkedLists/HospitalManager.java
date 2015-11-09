/* 
Create a linked list following the “hospital and patients” example of the notes:

1. Create the linked list and add several elements to it (around 10 is fine).

2. Go through the list printing out the content of each element.

3. Delete a couple of elements from the list.

4. Print the elements in the list again. Check that the deleted elements have been 
deleted. Check that you can delete the first element too.

Hint: Note that you cannot delete the first element from inside the list because 
you need to update the pointer patientListStart. To add or delete the first 
element of a list, you must do it from outside the list.
*/

import java.util.ArrayList;

public class HospitalManager {
	private Patient patientListStart = null;

	public static void main (String[]args) {
		ArrayList<Patient>patients = new ArrayList<>();

		HospitalManager hm = new HospitalManager();
		hm.launch();
	

		// Create a new hospital manager followed by the launch method.
		
	}

	// ...inside some method, maybe launch()
	public String launch (Patient patient) {
		
		Patient cWard01 = new Patient ("John", 33, "Tuberculosis");
		patientListStart = (cWard01);
		Patient cWard02 = new Patient ("Mary", 66, "Meningitis");
		patientListStart.addPatient(cWard02);
		Patient cWard03 = new Patient ("Stephen", 28, "Head Probs");
		patientListStart.addPatient(cWard03);
		Patient cWard04 = new Patient ("Fabian", 25, "Cancer");
		patientListStart = (cWard04);
		Patient cWard05 = new Patient ("Queenie", 66, "Fracture");
		patientListStart.addPatient(cWard05);
		Patient cWard06 = new Patient ("Jade", 28, "Eye Surgery");
		patientListStart.addPatient(cWard06);
		Patient cWard07 = new Patient ("Carol", 33, "Ankle Swelling");
		patientListStart = (cWard07);
		Patient cWard08 = new Patient ("Cindy", 66, "Therapy");
		patientListStart.addPatient(cWard08);
		Patient cWard09 = new Patient ("King", 28, "Leprosy");
		patientListStart.addPatient(cWard09);
		Patient cWard10 = new Patient ("Pumba", 28, "Polygon Head");
		patientListStart.addPatient(cWard10);

				// Print the patient's name with the method in Patient.
		for (Patient patient : patients) {
			System.out.println(patient.getName());
		}

		for (int i = 0; i < patients.size(); i++) {
			System.out.println(patients.get(i).getName());
		}
		
		}
	}


	