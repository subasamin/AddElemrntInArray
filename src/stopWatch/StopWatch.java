package stopWatch;

import java.time.LocalDateTime;
public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public StopWatch() {
        this.startTime = LocalDateTime.now();
        this.endTime = LocalDateTime.now();
    }



    public LocalDateTime start(){
        return this.startTime;
    }
    public LocalDateTime end(){
        return this.endTime;
    }
    int getElapsedTime(){
        return start().getNano() - end().getNano();
    }
}
