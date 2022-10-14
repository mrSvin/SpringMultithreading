package multithreading.component;

import lombok.SneakyThrows;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Async
public class MonitorTask implements CommandLineRunner {

    private final Counter counter;

    public MonitorTask(Counter counter) {
        this.counter = counter;
    }

    @SneakyThrows
    public void run(String... args) {
        while (true) {
            System.out.println("task1: " + new Date());
            Thread.sleep(1000);
            counter.counter("task1");
        }

    }


}
