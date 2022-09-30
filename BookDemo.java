import java.util.Scanner;
class BookTest 
{
	public static void main(String[] args) 
	{
		//creating 'scan' for input purpose
		Scanner scan=new Scanner(System.in);
		//declaring variable b 
		Book b=new Book();
		System.out.println("Enter Book name, ISBN number, Author name,Publisher : ");
		//for minimizing the number of lines,we are going to assign information
		//here line by line by setData method
		b.setData(scan.next(),scan.nextLong(),scan.next(),scan.next());
		//the getData is now called for the final output that we are expecting
		b.getData();
		//closing the scan 
		scan.close();
	}
}
