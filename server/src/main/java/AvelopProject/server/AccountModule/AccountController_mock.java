package AvelopProject.server.AccountModule;

import AvelopProject.server.CommonEntity.AliveRes_mock;
import AvelopProject.server.CommonEntity.DefaultResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock_api/account")
public class AccountController_mock {

    @GetMapping("/alive")
    public DefaultResponse isAlive() {
        AliveRes_mock data = new AliveRes_mock();
        return new DefaultResponse(true, data);
    }
}
