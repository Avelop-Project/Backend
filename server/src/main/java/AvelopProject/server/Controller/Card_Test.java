package AvelopProject.server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Card_Test {

    @GetMapping("mock_api/card/test")
    public String AliveTest(Model model) {
        model.addAttribute("data", "card_test_controller");
        return "card_test_controller";
    }
}
