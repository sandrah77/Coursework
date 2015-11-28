public class HospitalManager {
		private Patient patientListStart;
		private Patient patientListEnd;

		public static void main(String[] args) {
			HospitalManager myManager = new HospitalManager();
			myManager.launch();
		}

		private void launch() {
			String name;
			do {
				System.out.println("Please input data about patient: ");
				name = System.console().readLine();
				if (!name.equals("")) {
				int age = Integer.parseInteger(System.console().readLine());
				String illness = System.console().readLine();
				Patient nextPatient = new Patient(name, age, illness);
				addPatient(nextPatient);
			}
		} 	while (!name.equals(""));
		printPatientList();
		}
		private void addPatient(Patient nextPatient) {
			if (patientListStart == null) {
				patientListStart = nextPatient;
			} else {
				Patient currentElement = patientListStart;
				while (currentElement.getNext != null) {
						currentElement = currentElement.getNext;
				}
				currentElement.setNext = (nextPatient);
				nextPatient.setPrev(currentElement);
				patientListEnd = nextPatient;
				// nextPatient.prev = currentElement;
			}
		} 
		private void printPatientList() {
				if (patientListStart == null) {
					System.out.println ("There are no patients!");
				} else {
					Patient current = patientListStart;
					do {
						System.out.println("Name: " + current.getName());
						System.out.println("Age: " + current.getAge());
						System.out.println("Illness: " + current.getIllness());
						System.out.println();
						current = current.getNext();
				} while (current != null);
				current = patientListEnd;
				do {
						System.out.println("Name: " + current.getName());
						System.out.println("Age: " + current.getAge());
						System.out.println("Illness: " + current.getIllness());
						System.out.println();
				} while (current != null);
		}
}

private int removePatient(String name) {
	if (patientListStart != null) {
			Patient current = patientListStart;
			while ((!current.getName().equals(target)) && (current.getNext() != null)) {
					current = current.getNext();
			}
			if (current.getName().equals(target)) {
					current.getPrev().setNext(current.getNext());
					current.getNext().setPrev(current.getPrev());
			}
		}
	}
}
