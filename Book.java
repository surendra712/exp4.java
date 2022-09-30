class Book
{
	//declaring required variables
	private String bookname,authorname,publisher;
	private long ISBN;
	//creating a constructor called Book
	//when Book is called in other class,the control is transferred to here
	Book()
	{	
		//it doesn't have any statements
	}
	//Now the 'Book' will take inputs according to the type and address 
	public Book(String bookname,long ISBN,String authorname,String publisher) 
	{
		//the input location are stored in their respective variables 
		this.bookname=bookname;
		this.ISBN=ISBN;
		this.authorname=authorname;
		this.publisher=publisher;
	}
	public void setData(String bookname,long ISBN,String authorname,String publisher)
	{
		//Here, we are going to set the data to variables
		this.bookname=bookname;
		this.ISBN=ISBN;
		this.authorname=authorname;
		this.publisher=publisher;
	}
	public void getData() 
	{
		//Finally the data is displayed at their positions
		System.out.println("Book Name = "+bookname);
		System.out.println("ISBN No. = "+ISBN);
		System.out.println("Author Name = "+authorname);
		System.out.println("Publisher = "+publisher);
	}
}

