package multithreading.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Counter {

    int count;

    public void counter(String taskName) {
        count++;
        System.out.println(taskName + " count: " + count);
    }

}
