public class test {
	public static void main(String[] args) {
		PersonQueue s = new Supermarket();

		Person p = new Person();
		p.name = "A";
		p.age = 20;
		p.next = null;

		s.insert(p);
		s.printQueue();
		
	}
}