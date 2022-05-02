package com.data.factory;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@SpringBootTest(classes = App.class)
class AppTest {

	@Test
    void appTest()
    {
        App.main(new String[]{
                "--spring.main.web-environment=false"
                // Override any other environment properties according to your needs
        });
        assertTrue("Logrado appTest",Boolean.TRUE);
    }

}
