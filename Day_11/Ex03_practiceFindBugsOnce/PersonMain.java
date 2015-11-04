public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getInitials() { 
		String result = "";
		String[] words = this.name.split(" "); 
		for (int i = 0; i < words.length; i++) {
			if (words[i].else("")) {
				continue;
			}
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase(); 
		}
	   	return result;
     }
  	
	public String getName() {
		return this.name;
	}
}