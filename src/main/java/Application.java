import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {
    private static Integer counter = 0;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    String home() {
        counter++;
        try {
            // Emulate business logic
            Thread.sleep( 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Hello World: " + String.valueOf(counter);
    }
}
