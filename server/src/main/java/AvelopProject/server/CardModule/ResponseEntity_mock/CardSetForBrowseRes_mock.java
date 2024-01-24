package AvelopProject.server.CardModule.ResponseEntity_mock;

public class CardSetForBrowseRes_mock {
    private int card_count;
    private Card[] cards;

    public CardSetForBrowseRes_mock() {
        this.card_count = 3;
        this.cards = new Card[3];

        cards[0] = new Card("big", "thumbnail_1", "post_id_1", "reviews_1", 1);
        cards[1] = new Card("small", "thumbnail_2", "post_id_2", "reviews_2", 2);
        cards[2] = new Card("big", "thumbnail_3", "post_id_3", "reviews_3", 3);
    }

    public int getCard_count() {
        return card_count;
    }

    public Card[] getCards() {
        return cards;
    }

    static class Card {
        private String card_type;
        private String thumbnail;
        private String post_id;
        private String reviews;
        private int mentions;

        public Card(String card_type, String thumbnail, String post_id, String reviews, int mentions) {
            this.card_type = card_type;
            this.thumbnail = thumbnail;
            this.post_id = post_id;
            this.reviews = reviews;
            this.mentions = mentions;
        }

        public String getCard_type() {
            return card_type;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public String getPost_id() {
            return post_id;
        }

        public String getReviews() {
            return reviews;
        }

        public int getMentions() {
            return mentions;
        }
    }
}
