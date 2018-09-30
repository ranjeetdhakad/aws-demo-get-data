package now.aws.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({ "now.aws.demo" })
public class AwsDemoApplication { 
    
    public static final String DEMO_API_NAME = "GET";

    /**
     * Main entry point to application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(AwsDemoApplication.class, args); // NOSONAR:
                                                                  // Probably
                                                                  // sonar false
                                                                  // positive
                                                                  // (google).
    }
}
