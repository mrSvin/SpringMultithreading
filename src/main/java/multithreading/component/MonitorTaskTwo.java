package multithreading.component;

import lombok.SneakyThrows;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Async
public class MonitorTaskTwo implements CommandLineRunner {

    private final Counter counter;

    public MonitorTaskTwo(Counter counter) {
        this.counter = counter;
    }

    @SneakyThrows
    public void run(String... args) {
        while (true) {
            System.out.println("task2: " + new Date());
            Thread.sleep(2000);
            counter.counter("task2");
        }

    }

}
