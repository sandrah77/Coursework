public class Person {
	String name;
	int age;
	Person next;

	public void add (Person p)
	{
		if(next == null)
			this.next = p;
		else
			this.next = 
	}
	
	public Person remove()
	{
		return this;
	}
}