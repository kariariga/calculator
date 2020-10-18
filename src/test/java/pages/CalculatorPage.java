package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public CalculatorPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.calculator2:id/digit_0")
    private MobileElement btn0;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    private MobileElement btn1;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_2")
    private MobileElement btn2;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_3")
    private MobileElement btn3;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_4")
    private MobileElement btn4;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_5")
    private MobileElement btn5;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_6")
    private MobileElement btn6;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_7")
    private MobileElement btn7;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_8")
    private MobileElement btn8;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_9")
    private MobileElement btn9;

    @AndroidFindBy(accessibility = "plus")
    private MobileElement btnSomar;

    @AndroidFindBy(accessibility = "minus")
    private MobileElement btnSubtrair;

    @AndroidFindBy(accessibility = "multiply")
    private MobileElement btnMultiplicar;

    @AndroidFindBy(accessibility = "divide")
    private MobileElement btnDividir;

    @AndroidFindBy(accessibility = "equals")
    private MobileElement btnIgual;

    @AndroidFindBy(id = "com.android.calculator2:id/result")
    private MobileElement resultado;


    public void inserirNumero(String numero) {
        char[] digitos = String.valueOf(numero).toCharArray();

        for (char digito : digitos) {
            String num = Character.toString(digito);

            switch (num) {
                case "0":
                    btn0.click();
                    break;
                case "1":
                    btn1.click();
                    break;
                case "2":
                    btn2.click();
                    break;
                case "3":
                    btn3.click();
                    break;
                case "4":
                    btn4.click();
                    break;
                case "5":
                    btn5.click();
                    break;
                case "6":
                    btn6.click();
                    break;
                case "7":
                    btn7.click();
                    break;
                case "8":
                    btn8.click();
                    break;
                case "9":
                    btn9.click();
                    break;
            }
        }
    }

    public void clicarSomar() {
        btnSomar.click();
    }

    public void clicarSubtrair() {
        btnSubtrair.click();
    }

    public void clicarMultiplicar() {
        btnMultiplicar.click();
    }

    public void clicarDividir() {
        btnDividir.click();
    }

    public void clicarIgual() {
        btnIgual.click();
    }

    public String obterResultado() {
        return resultado.getText();
    }
}
