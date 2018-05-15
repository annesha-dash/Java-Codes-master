class Book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy ;
	
	
	public Book()
	{
		
		this.bookName=null;
		this.bookAuthor=null;
		this.bookId=null;
		this.bookType=null;
		this.bookCopy=0;
		
	}
	
	public Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy)
	{
		
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		
	}
	
	
	public void showInfo()
	{
		System.out.println("The book name: "+this.bookName);
		System.out.println("The book author: "+this.bookAuthor);
		System.out.println("The book id: "+this.bookId);
		System.out.println("The book type: "+this.bookType);
		System.out.println("The book copy: "+this.bookCopy);
		
		
	}
	
	
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
		
	}
	public String getBookName( )
	{
		return this.bookName;
		
	}
	
	
	
	public void setBookAuthor(String bookAuthor)
	{
		this.bookAuthor=bookAuthor;
		
	}
	public String getbookAuthor( )
	{
		return this.bookAuthor;
		
	}
	
	
	
	
	public void setBookId(String bookId)
	{
		this.bookId=bookId;
		
	}
	public String getBookId( )
	{
		return this.bookId;
		
	}
	
	
	
	public void setBookType(String bookType)
	{
		this.bookType=bookType;
		
	}
	public String getBookType( )
	{
		return this.bookType;
		
	}
	
	
	public void setBookCopy(int bookCopy)
	{
		this.bookCopy=bookCopy;
		
	}
	public int getBookCopy()
	{
		return this.bookCopy;
		
	}
	
	
	
	
	
}