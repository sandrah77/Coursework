public class Patient {
		private String name;
		private int age;
		private String illness;
		private Patient next;
		private Patient prev;

		public Patient(String name, int age, String illness) {
			this.name = name;
			this.age = age;
			this.illness = illness;
			this.next = null;
			this.prev = null;
		}

		public String getName() {
				return this.name;
		}

		public int getAge() {
				return this.age;
		}

		public String getIllness() {
			return this.illness;
		}

		public Patient getNext() {
			return this.next;
		}

		public void setNext(Patient next) {
			if (next == null) {
					// do some kind of error-checking
			}
			this.next = next;
		}

		public Patient getPrev() {
			return this.prev;
		}

		public void setPrev(Patient p) {
				this.prev = p;
		}
}