package AvelopProject.server.CommonEntity;

import java.time.LocalDateTime;

public class AliveRes_mock {
    private boolean alive;
    private LocalDateTime cur_time;

    public AliveRes_mock() {
        this.alive = true;
        this.cur_time = LocalDateTime.now();
    }

    public boolean isAlive() {
        return alive;
    }

    public LocalDateTime getCur_time() {
        return cur_time;
    }
}
