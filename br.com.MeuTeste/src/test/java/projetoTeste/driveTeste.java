package projetoTeste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


class projetoTeste {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Documentação\\Chromedriver.exe");

        WebDriver Teste = new ChromeDriver();
        Teste.get("https://www.americanas.com.br/");

        WebElement caixaDeBusca = Teste.findElement(By.id("h_search-input"));
        caixaDeBusca.sendKeys("Fone de Ouvido Sem Fio I12 Tws Bluetooth Com Touch");

        WebElement botaoDeBusca = Teste.findElement(By.id("h_search-btn"));
        botaoDeBusca.click();

        Teste.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement resultado = Teste.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[3]/div[2]/div[1]/div/div/a/span[1]"));
        String resultadopesquisa = resultado.getText();

        System.out.println(resultadopesquisa);
    }
}
