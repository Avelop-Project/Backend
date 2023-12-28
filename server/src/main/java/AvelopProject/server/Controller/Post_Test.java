package AvelopProject.server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Post_Test {

    @GetMapping("mock_api/post/test")
    public String AliveTest(Model model) {
        model.addAttribute("data", "post_test_controller");
        return "post_test_controller";
    }
}
