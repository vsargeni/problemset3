package pkgLibrary;

public class BookException extends Exception {
	private Book book;
	
	public BookException(){
		super();
	}
	public BookException(Book book){
		super("Bad Book");
		this.book=book;
	}
	

}
