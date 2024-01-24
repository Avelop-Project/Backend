package AvelopProject.server.CardModule;

import AvelopProject.server.CommonEntity.AliveRes_mock;
import AvelopProject.server.CommonEntity.DefaultResponse;
import AvelopProject.server.CardModule.ResponseEntity_mock.CardSetForBrowseRes_mock;
import AvelopProject.server.CardModule.ResponseEntity_mock.CardSetForMypageRes_mock;
import AvelopProject.server.CardModule.ResponseEntity_mock.CardSetForRestaurantRes_mock;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mock_api/card")
public class CardController_mock {

    @GetMapping("/alive")
    public DefaultResponse isAlive() {
        AliveRes_mock data = new AliveRes_mock();
        return new DefaultResponse(true, data);
    }

    @GetMapping("/browse")
    public DefaultResponse cardSetForBrowse() {
        CardSetForBrowseRes_mock data = new CardSetForBrowseRes_mock();
        return new DefaultResponse(true, data);
    }

    @GetMapping("/restaurant")
    public DefaultResponse cardSetForRestaurant() {
        CardSetForRestaurantRes_mock data = new CardSetForRestaurantRes_mock();

        return new DefaultResponse(true, data);
    }

    @GetMapping("/mypage")
    public DefaultResponse cardSetForMyPage() {
        CardSetForMypageRes_mock data = new CardSetForMypageRes_mock();

        return new DefaultResponse(true, data);
    }
}
