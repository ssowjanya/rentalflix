package io.egen.rentalflix;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * JUnit test cases for MovieService
 */
public class MovieServiceTest {
private Movie mlist;
private String alle;
@Test
public static void main(String[] args)
//	public void testMovie()
	{
		List<Movie> mlist=new ArrayList<Movie>();
		mlist.add(new Movie(1,"Batman",2008,"English" ));
		mlist.add(new Movie(2,"minion",2010,"English" ));
		mlist.add(new Movie(5,"xyz",2012,"Hindi" ));
		mlist.add(new Movie(3,"wallE",2010,"English"));
		mlist.add(new Movie(4,"Spiderman",2005,"English"));
	for(Movie e:mlist)
	{
		System.out.println(e);
	}

	for(Movie m:mlist)
	{
		System.out.println(m.getId());
	}
	
	
	for(Movie t:mlist)
	{
		if(t.getId()==3)
		{
		mlist.remove(t);
	}


	}
	}
}
	
//@Test
/*public void testName()
{
//	 assertEquals("wallE", mlist.getTitle());
	//List<Movie> list = (List<Movie>) mlist;
	//Movie alle=((Movie) mlist).get(1);
	//alle.setTitle("Kungfu");

		System.out.println("movie list" +alle);		//return mlist;
	}

public void testremove()
{
	mlist.delete("2");
	}

}
*/
