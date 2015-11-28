public class Books implements BooksImpl {
	private String title;
	private String author;


	public Books (String title){
		this.title = title;
	}

	public Books(String title, String author){
		this.title = title;
		this.author = author;

	}

	getAuthor(){
		return author;
	}

	getTitle(){
		return title; 

	}

	isTaken(){

	}

	setTaken(boolean loan) {


	}


