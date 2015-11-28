public class LibraryUsers implements LibraryUsersImpl {
	private String name;
	private int libraryID;
	private Library library;
	
	public LibraryUsers(String name){
		this.name = name;
	}

	public String getName(){
		return name;

	}

	public int getLibraryID(){
		return libraryID;

	}

	public register(Library library){
		return libraryID;
	}


	public getLibrary(){
		return library;


	}

}