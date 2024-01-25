package AvelopProject.server.UserInfoModule;

import AvelopProject.server.CommonEntity.AliveRes_mock;
import AvelopProject.server.CommonEntity.DefaultResponse;
import AvelopProject.server.UserInfoModule.ResponseEntity_mock.GenerateTokenRes_mock;
import AvelopProject.server.UserInfoModule.ResponseEntity_mock.UserInfoRes_mock;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mock_api/user")
public class UserInfoController_mock {

    @GetMapping("/alive")
    public DefaultResponse isAlive() {
        AliveRes_mock data = new AliveRes_mock();
        return new DefaultResponse(true, data);
    }

    @PostMapping("/token/{user_id}")
    public DefaultResponse generateToken(@PathVariable("user_id") String user_id) {
        GenerateTokenRes_mock data = new GenerateTokenRes_mock();
        return new DefaultResponse(true, data);
    }

    @GetMapping("/{user_id}")
    public DefaultResponse userInfo(@PathVariable("user_id") String user_id) {
        UserInfoRes_mock data = new UserInfoRes_mock();
        return new DefaultResponse(true, data);
    }
}
