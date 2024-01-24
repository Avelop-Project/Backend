package AvelopProject.server.UserInfoModule.ResponseEntity_mock;

public class UserInfoRes_mock {
    private String user_id;
    private String user_nickname;
    private int user_posting;

    public UserInfoRes_mock() {
        this.user_id = "user_id_1";
        this.user_nickname = "user_nickname_1";
        this.user_posting = 3;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public int getUser_posting() {
        return user_posting;
    }
}
