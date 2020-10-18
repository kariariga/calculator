package steps;

import cucumber.api.PendingException;
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

public class DividirSteps {

    private AndroidDriver<MobileElement> driver;
    private CalculatorPage calc;

    @Dado("^que acesso a calculadora para realizar uma divisao$")
    public void queAcessoACalculadoraParaRealizarUmaDivisao() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("deviceName", "Pixel");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
        calc = new CalculatorPage(driver);
    }

    @E("^insiro o dividendo \"([^\"]*)\"$")
    public void insiroODividendo(String num) {
        calc.inserirNumero(num);
    }

    @E("^clico em dividir$")
    public void clicoEmDividir() {
        calc.clicarDividir();
    }

    @E("^insiro o divisor \"([^\"]*)\"$")
    public void insiroODivisor(String num) {
        calc.inserirNumero(num);
    }

    @Quando("^eu clicar em igual$")
    public void euClicarEmIgual() {
        calc.clicarIgual();
    }

    @Entao("^exibe o quociente \"([^\"]*)\"$")
    public void exibeOQuociente(String resultado) {
        Assert.assertEquals(calc.obterResultado(), resultado);
    }

}
