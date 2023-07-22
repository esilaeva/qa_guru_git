import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    void googleTest() {
        open("https://google.com");
    }
}
