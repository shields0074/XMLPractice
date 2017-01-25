import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonsh_000 on 1/24/2017.
 */

/**
public class DVD
{
    private List movies=new ArrayList();
    public DVD(){}
    public List getMovies() {
        return movies;
    }
    public void setMovies(List movies) {
        this.movies = movies;
    }
    public String toString(){
        String movies="";
        for(Object movie:getMovies())
        {
            movies += movie.getName()+", ";
        }
        return movies;
    }
}
*/