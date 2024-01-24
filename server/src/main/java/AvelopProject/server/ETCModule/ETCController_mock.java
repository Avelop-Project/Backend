package AvelopProject.server.ETCModule;

import AvelopProject.server.CommonEntity.AliveRes_mock;
import AvelopProject.server.CommonEntity.DefaultResponse;
import AvelopProject.server.ETCModule.ResponseEntity_mock.AutoCompleteRes_mock;
import AvelopProject.server.ETCModule.ResponseEntity_mock.GetMarkersRes_mock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock_api/etc")
public class ETCController_mock {

    @GetMapping("/alive")
    public DefaultResponse isAlive() {
        AliveRes_mock data = new AliveRes_mock();
        return new DefaultResponse(true, data);
    }
    @GetMapping("/auto-complete")
    public DefaultResponse autoComplete() {
        AutoCompleteRes_mock data = new AutoCompleteRes_mock();
        return new DefaultResponse(true, data);
    }

    @GetMapping("/markers")
    public DefaultResponse getMarkers() {
        GetMarkersRes_mock data = new GetMarkersRes_mock();
        return new DefaultResponse(true, data);
    }
}
