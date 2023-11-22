//import static com.codeborne.selenide.Condition.disappear;
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selenide.*;
//import org.openqa.selenium.By;
import io.qameta.allure.Issue;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

@Slf4j
public class seletest {
    @Test
    @Issue(value="IOP-289345")
    public void userCanLoginByUsername() {
        step("AAAAAB");
        log.error("self log");
        System.out.println("sdvgsdg");
//        open("/login");
//        $(By.name("user.name")).setValue("johny");
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Waits until element disappears
//        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
    }
}
