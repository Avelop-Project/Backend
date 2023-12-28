package AvelopProject.server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserInfo_Test {

    @GetMapping("mock_api/userInfo/test")
    public String AliveTest(Model model) {
        model.addAttribute("data", "userInfo_test_controller");
        return "userInfo_test_controller";
    }
}
