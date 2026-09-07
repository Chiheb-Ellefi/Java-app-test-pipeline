package stage.project.javaapptestpipeline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class JavaAppTestPipelineApplicationTests {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    void contextLoads() {
        helloWorld.helloWorld();
    }

}
