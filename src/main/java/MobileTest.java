import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MobileTest {

    @Test
    public void checkMobilePayment(){
        // WebDriver - это описание ядра браузера с командами пользователя
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 1. Перешли на страницу
        driver.get("https://next.privat24.ua/mobile");

        // 2. Создали и инициировали переменную
        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        By cardNumber = By.xpath("//input[@data-qa-node='numberdebitSource']");
        By cardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        By cardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        By buttonSubmitToTheCart = By.xpath("//button[@data-qa-node='submit']");


        // 3. Действие над элементом
        driver.findElement(phoneNumber).sendKeys("630734074");
        driver.findElement(amount).sendKeys("500");
        driver.findElement(cardNumber).sendKeys("4506909324274797");
        driver.findElement(cardExpDate).sendKeys("06/22");
        driver.findElement(cardCvv).sendKeys("327");
        driver.findElement(firstName).sendKeys("Peter");
        driver.findElement(lastName).sendKeys("Scroggs");
        driver.findElement(buttonSubmitToTheCart).click();

    }

}


