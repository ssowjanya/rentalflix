package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.List;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {
	
public MovieService(List<Movie> mList) {
		super();
		this.mList = mList;
	}



List<Movie> mList=new ArrayList<Movie>();

@Override
public List<Movie> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Movie> findByName(String name) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Movie create(Movie movie)throws IllegalArgumentException {
	// TODO Auto-generated method stub
	if(movie==null)
	{
		throw new IllegalArgumentException();
	}
	else if(MovieService.mlist.isEmpty())
	{
	   mlist.add (0, movie);
	}
	return null;
}

@Override
public Movie update(Movie movie) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Movie delete(int id) throws IllegalArgumentException {
	
	{
		
		for(int i=0;i<mlist.size();i++ )
		{
			Movie movie=mlist.get(i);
			if(movie.id==id)
				mlist.remove(mlist.get(i));
			
		}
		}// TODO Auto-generated method stub
	return null;
}

@Override
public boolean rentMovie(int movieId, String user) {
	// TODO Auto-generated method stub
	return false;
}
}
