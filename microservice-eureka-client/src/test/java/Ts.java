import com.controller.MovieController;
import org.junit.Test;

public class Ts {
    @Test
    public void T(){
        new MovieController().findById(1L);
    }
}
