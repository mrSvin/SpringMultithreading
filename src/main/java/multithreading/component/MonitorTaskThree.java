package multithreading.component;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Async
public class MonitorTaskThree {

    @Scheduled(fixedDelay = 1000)
    @SneakyThrows
    public void scheduleFixedDelayTask() {
        System.out.println("task3: " + new Date());
        Thread.sleep(3000);
    }

}
