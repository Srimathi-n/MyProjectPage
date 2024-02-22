import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class MyProjectsPage {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\MoviesAppTest\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");
        WebElement firstimgEl = driver.findElement(By.cssSelector("div.my-projects-home-page>div:first-of-type>:first-child"));
        firstimgEl.click();

        WebElement headingFirst = driver.findElement(By.cssSelector("div.advanced-technologies-card>:first-child"));
        System.out.println(headingFirst.getText());
        WebElement descFirst = driver.findElement(By.cssSelector("div.advanced-technologies-card>:nth-child(2)"));
        System.out.println(descFirst.getText());
        WebElement buttonFirst = driver.findElement(By.cssSelector("div.advanced-technologies-card>:last-child"));
        buttonFirst.click();

        WebElement secndimgEl = driver.findElement(By.cssSelector("div.my-projects-home-page>div:first-of-type>:last-child"));
        secndimgEl.click();

        WebElement headingScnd = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:first-of-type>:first-child>:nth-child(2)"));
        WebElement descScnd = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:first-of-type>:first-child>:last-child"));
        System.out.println("The price of "+headingScnd.getText()+" is: Rs "+descScnd.getText()+".");

        WebElement headingScnditem = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:first-of-type>:nth-child(2)>:nth-child(2)"));
        WebElement descScnditem = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:first-of-type>:nth-child(2)>:last-child"));
        System.out.println("The price of "+headingScnditem.getText()+" is: Rs "+descScnditem.getText()+".");

        WebElement headingThirditem = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:nth-of-type(2)>:first-child>:nth-child(2)"));
        WebElement descThirditem = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:nth-of-type(2)>:first-child>:last-child"));
        System.out.println("The price of "+headingThirditem.getText()+" is: Rs "+descThirditem.getText()+".");

        WebElement headingFourthitem = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:nth-of-type(2)>:nth-child(2)>:nth-child(2)"));
        WebElement descFourthitem = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:nth-of-type(2)>:nth-child(2)>:last-child"));
        System.out.println("The price of "+headingFourthitem.getText()+" is: Rs "+descFourthitem.getText()+".");

        WebElement buttonSecnd = driver.findElement(By.cssSelector("div.diwali-bottom-section>div:last-child>button"));
        buttonSecnd.click();

        WebElement thirdimgEl = driver.findElement(By.cssSelector("div.my-projects-home-page>div:last-of-type>:first-child"));
        thirdimgEl.click();
        WebElement headingThirdEl = driver.findElement(By.cssSelector("div.order-card>:first-child"));
        System.out.println(headingThirdEl.getText());
        WebElement descThirdEl = driver.findElement(By.cssSelector("div.order-card>:nth-child(2)"));
        System.out.println(descThirdEl.getText());
        WebElement buttonThird = driver.findElement(By.cssSelector("div.order-card>button:last-of-type"));
        buttonThird.click();

        WebElement fourthimgEl = driver.findElement(By.cssSelector("div.my-projects-home-page>div:last-of-type>:last-child"));
        fourthimgEl.click();

        WebElement categoryEl = driver.findElement(By.cssSelector("div.news-card>:first-child"));
        System.out.println(categoryEl.getText());
        WebElement headingFourthEl = driver.findElement(By.cssSelector("div.news-card>:nth-child(2)"));
        System.out.println(headingFourthEl.getText());
        WebElement descFourthEl = driver.findElement(By.cssSelector("div.news-card>:nth-child(3)"));
        System.out.println(descFourthEl.getText());
        WebElement buttonfourth = driver.findElement(By.cssSelector("div.news-card>button:last-of-type"));
        buttonfourth.click();

        driver.quit();
    }



}
