import com.webwithnew.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * created on 2019/3/8 15:18
 *
 * @author zhangalong
 */
public class HomeControllerTestWithMock {
    @Test
    public void testHomePage() throws Exception{
        final HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/")).andExpect(view().name("home"));


    }
}
