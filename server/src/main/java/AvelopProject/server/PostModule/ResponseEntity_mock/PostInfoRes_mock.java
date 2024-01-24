package AvelopProject.server.PostModule.ResponseEntity_mock;

public class PostInfoRes_mock {
    private int carousel_count;
    private String[] carousel;
    private Object uploader_info;
    private Object post_info;
    private Object restaurant_info;

    public PostInfoRes_mock() {
        this.carousel_count = 3;
        this.carousel = new String[3];
        this.uploader_info = new UploaderInfo();
        this.post_info = new PostInfo();
        this.restaurant_info = new RestaurantInfo();

        this.carousel[0] = "image_1";
        this.carousel[1] = "image_1";
        this.carousel[2] = "image_1";
    }

    public int getCarousel_count() {
        return carousel_count;
    }

    public String[] getCarousel() {
        return carousel;
    }

    public Object getUploader_info() {
        return uploader_info;
    }

    public Object getPost_info() {
        return post_info;
    }

    public Object getRestaurant_info() {
        return restaurant_info;
    }

    static class UploaderInfo {
        private String id;
        private String nickname;

        public UploaderInfo() {
            this.id = "uploader_id_1";
            this.nickname = "nickname_1";
        }

        public String getId() {
            return id;
        }

        public String getNickname() {
            return nickname;
        }
    }

    static class PostInfo {
        private String id;
        private String location;
        private String reviews;
        private String food;
        private int price;

        public PostInfo() {
            this.id = "post_id_1";
            this.id = "location_1";
            this.id = "reviews_1";
            this.food = "food_1";
            this.price = 10000;
        }

        public String getId() {
            return id;
        }

        public String getLocation() {
            return location;
        }

        public String getReviews() {
            return reviews;
        }

        public String getFood() {
            return food;
        }

        public int getPrice() {
            return price;
        }
    }

    static class RestaurantInfo {
        private String id;
        private String name;
        private String location;
        private String reviews;

        public RestaurantInfo() {
            this.id = "restaurant_id_1";
            this.name = "restaurant_name_1";
            this.location = "location_1";
            this.reviews = "reviews_1";
        }
    }
}
