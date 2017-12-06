package book;

import java.util.ArrayList;

public class BookStore 
{
	private int bookIDIndex = 0;
	
	private ArrayList<Book> bookCopies = new ArrayList<Book>();
	
	public void addBooks(String bookName, String bookAuthor) 
	{
		//bookIDIndex is used as ID for new Books
		bookIDIndex++;
		Book bookCopy = new Book(bookName,bookAuthor,bookIDIndex);
		bookCopies.add(bookCopy);
	}
	
	public void removeBooks(int bookID) 
	{
		for (Book bookCopy : bookCopies) {
			if (bookCopy.getBookID()==bookID) {
				System.out.println("Removing Book:"+bookCopy.getBookName()+ " by "+bookCopy.getBookAuthor());
				bookCopies.remove(bookCopy);
			}
		}
	}

	public int getTotalBooks()
	{
		System.out.println("Total Books in Store:"+bookCopies.size());
		return bookCopies.size();
	}
	
	public void getBookListByAuthor(String bookAuthor)
	{
		System.out.println("Get Books for Author:"+bookAuthor);
		for (Book bookCopy : bookCopies) {
			if (bookCopy.getBookAuthor()==bookAuthor) {
				//Prints all books in Store by that Author
				System.out.println(bookCopy.getBookID()+":"+bookCopy.getBookName());
			}
		}		
	}
	
//	Setting payMode as Card by default but can be changed using setter.
	private PaymentMode payMode = new Payment();

	public void setPayMode(PaymentMode payMode) 
	{
		this.payMode = payMode;
	}

	public PaymentMode getPayMode() 
	{
		return payMode;
	}
	
	public void payForBook()
	{
		payMode.pay();
	}
}