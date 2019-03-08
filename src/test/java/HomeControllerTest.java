import com.webwithnew.web.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * created on 2019/3/8 15:11
 *
 * @author zhangalong
 */
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception{
        final HomeController controller = new HomeController();
        assertEquals("home",controller.home());
    }
}
