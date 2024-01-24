package AvelopProject.server.CardModule.RequestEnttiy;

public class CardSetForBrowseReq {
    private String location;
    private String filter_price;
    private String filter_food;


    public CardSetForBrowseReq(String location, String filter_price, String filter_food) {
        this.location = location;
        this.filter_price = filter_price;
        this.filter_food = filter_food;
    }
}
