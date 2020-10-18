package steps;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import pages.CalculatorPage;

import java.net.MalformedURLException;
import java.net.URL;

public class SubtrairSteps {

    private AndroidDriver<MobileElement> driver;
    private CalculatorPage calc;

    @Dado("^que acesso a calculadora para realizar uma subtracao$")
    public void queAcessoACalculadoraParaRealizarUmaSubtracao() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("deviceName", "Pixel");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        calc = new CalculatorPage(driver);
    }

    @E("^insiro o minuendo \"([^\"]*)\"$")
    public void insiroOMinuendo(String num) {
        calc.inserirNumero(num);
    }

    @E("^clico em subtrair$")
    public void clicoEmSubtrair() {
        calc.clicarSubtrair();
    }

    @E("^insiro o subtraendo \"([^\"]*)\"$")
    public void insiroOSubtraendo(String num) {
        calc.inserirNumero(num);
    }

    @Quando("^eu clicar no igual$")
    public void euClicarNoIgual() {
        calc.clicarIgual();
    }

    @Entao("^exibe o resto \"([^\"]*)\"$")
    public void exibeOResto(String resultado) {
        Assert.assertEquals(calc.obterResultado(), resultado);
    }

}
