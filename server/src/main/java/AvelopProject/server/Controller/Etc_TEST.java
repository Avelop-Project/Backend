package AvelopProject.server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Etc_TEST {

    @GetMapping("mock_api/etc/test")
    public String AliveTest(Model model) {
        model.addAttribute("data", "etc_test_controller");
        return "etc_test_controller";
    }
}
