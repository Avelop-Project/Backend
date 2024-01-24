package AvelopProject.server.PostModule;

import AvelopProject.server.CommonEntity.AliveRes_mock;
import AvelopProject.server.CommonEntity.DefaultResponse;
import AvelopProject.server.PostModule.ResponseEntity_mock.PostInfoRes_mock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock_api/post")
public class PostController_mock {

    @GetMapping("/alive")
    public DefaultResponse isAlive() {
        AliveRes_mock data = new AliveRes_mock();
        return new DefaultResponse(true, data);
    }

    @GetMapping("/{post_id}")
    public DefaultResponse PostInfo(@PathVariable("post_id") String post_id) {
        PostInfoRes_mock data = new PostInfoRes_mock();
        return new DefaultResponse(true, data);
    }
}
