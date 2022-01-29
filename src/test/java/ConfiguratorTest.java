import com.codeborne.selenide.Configuration;
import com.testbase.MainPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ConfiguratorTest {
    MainPage mainPage = open(MainPage.BURGERS_MAIN_PAGE_URL, MainPage.class);

    @Test
    @DisplayName("Проверка работы вкладок конструктора бургеров")
    public void checkBurgerConstructorTabsWork(){

        Configuration.startMaximized = true;
        mainPage.isBunsTabOpen();
        mainPage.isSaucesTabWorks();
        mainPage.isFillingsTabWorks();
        mainPage.isBunsTabWorks();
    }

    @After
    public void terminate(){
        getWebDriver().quit();
    }
}
