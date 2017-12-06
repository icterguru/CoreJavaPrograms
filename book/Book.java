package book;

public class Book 
{
	private int bookID;
	private String bookName;
	private String bookAuthor;
	
	public Book(String bookName, String bookAuthor, int bookID) {
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookID=bookID;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}	
}
