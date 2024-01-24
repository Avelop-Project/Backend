package AvelopProject.server.CardModule.ResponseEntity_mock;

public class CardSetForMypageRes_mock {
    private int archive_count;
    private Archive[] archives;

    public CardSetForMypageRes_mock() {
        this.archive_count = 2;
        this.archives = new Archive[2];

        archives[0] = new Archive();
        archives[1] = new Archive();
    }

    public int getArchive_count() {
        return archive_count;
    }

    public Archive[] getArchives() {
        return archives;
    }

    static class Archive {
        private String date;
        private int card_count;
        private Card[] cards;

        public Archive() {
            this.date = "YY/MM/DD";
            this.card_count = 3;
            this.cards = new Card[3];

            cards[0] = new Card("big", "thumbnail_1", "post_id_1", "reviews_1", 1);
            cards[1] = new Card("small", "thumbnail_2", "post_id_2", "reviews_2", 2);
            cards[2] = new Card("big", "thumbnail_3", "post_id_3", "reviews_3", 3);
        }

        public String getDate() {
            return date;
        }

        public int getCard_count() {
            return card_count;
        }

        public Card[] getCards() {
            return cards;
        }
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
