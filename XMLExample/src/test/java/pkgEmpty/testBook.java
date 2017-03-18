package pkgEmpty;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class testBook {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//create a book via setters
		Book book= new Book();
		book.setAuthor("John");
		book.setCost(10);
		book.setPrice(10);
		book.setDescription("This book is like, nuts man");
		book.setGenre("Horror");
		book.setId("bk000");
		Date d= new Date();
		book.setPublish_date(d);
		book.setTitle("Wild Thang");
		
		//create a book with the constructor
		Book book2 = new Book("bk000", "John", "Wild Thang", "Horror", 10, d,"This book is like, nuts man");
		
	}
	
	
	

	

}
