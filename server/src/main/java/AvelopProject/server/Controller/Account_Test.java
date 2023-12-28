package AvelopProject.server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Account_Test {

    @GetMapping("mock_api/account/test")
    public String AliveTest(Model model) {
        model.addAttribute("data", "account_test_controller");
        return "account_test_controller";
    }
}
