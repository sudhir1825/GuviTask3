package Task3;
import java.util.Scanner;

public class Book {
	long BookId;
	String title;
	String author;
	boolean isAvailable = false;
	
	public Book() {}
	public Book(long bookId,String title,String author) {//constructor of class book 
		this.BookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	public long getBookid(Book book) {// to get Book id to search and remove books
		return book.BookId;
	}
}

class Library extends Book{//subclass of Book 

	Book[] book = new Book[5]; //object array to store book objects
	int index = 0;//to have a track of number of books added
	
	public Library() {}
	public Library(long bookId, String title, String author) {
		super(bookId, title, author);//super used to call parent class constructor
	}
	
	public void addBook() {//method to add a book
		if(index>=5) {
			System.out.print("Maximum limit Reached");//only 5 book can be stored ,
		}
		else {
			Scanner sc = new Scanner(System.in);//used to get user input
		
			System.out.print("Enter the Book Id: "); //get user input 
			long bid = sc.nextLong();
			sc.nextLine();
			System.out.print("Enter the Book author: ");
			String author = sc.nextLine();
			System.out.print("Enter the Book title: ");
			String title = sc.nextLine();
			Library set = new Library(bid,title,author);
			this.book[index] = set; //assign object to the object array
			index++;
			
			System.out.print("\nBook successfully added...");//once book is added a confirmation message i shown
		}
 	}
	
	public void search() { // method to search a book using book id
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Book Id to Search: ");
		long id = sc.nextLong();//get book id from user
		int j=0;
		for(j =0;j < index;j++) {
			if(id == book[j].getBookid(book[j])) {//check for book id if it is present
				if(book[j].isAvailable==true)// check if it is available
					System.out.println("\nBook author - "+this.book[j].author+" Title - "+this.book[j].title);
				else
					System.out.println("\nBook is not available");//if not available 
				break;
			}
		}
		if(j >=5) {//if book id is entered wrong 
			System.out.println("Enter the correct Book Id.");
		}
	}
	
	public void display() { //method to display all the book stored 
		System.out.println("\n\nBook_Id Book_author Book_Title Book_Available");
		for(int j =0;j < index;j++) { 
			System.out.println(this.book[j].BookId+"     "+this.book[j].author+"     "+this.book[j].title
					+"     "+this.book[j].isAvailable);
				
		}
	}
	
	public void remove() { // method to remove a book
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the Book Id to Remove: ");
		long id = sc.nextLong();
		int j=0;
		for(j =0;j < index;j++) {
			if(id == book[j].getBookid(book[j])) {
				this.book[j].isAvailable = false; // set isAvailable to false so that the book is not available
			}
		}
	}
	
	
	public static void main(String[] args) { // main method
		Library obj = new Library() ;
		System.out.println("WELCOME TO LIBRARY");
		Scanner sc = new Scanner(System.in);
		
		while(true) {//loop to run until user wants to terminate
			System.out.print("\n\nEnter the Number: \n 1.Add a Book \n 2.Search a Book \n 3.Display all Books"
					+ "\n 4.Remove a Book\n 5.Exit\nEnter[1/2/3/4/5]:");
			
			int choice = sc.nextInt();//gets the user choice
			
			if(choice == 1) {
				obj.addBook();//method call to add a book
			}
			else if(choice == 2) {
				obj.search();//method call to search a book
			}
			else if(choice == 3) {
				obj.display();//method call to display all books
			}
			else if(choice == 4) {
				obj.remove();//method call to remove a book
			}
			else if(choice == 5) {
				break;//to terminate
			}
			else {
				System.out.println("Enter number Between 1 - 5");
			}
		}
		
		System.out.println("\nThank you Visit again....");
		
	}
	
}
