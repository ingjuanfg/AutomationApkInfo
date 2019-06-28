package co.com.test.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AppPage {

    public static final Target IMG_APP= Target.the("Icono App").located(By.xpath("//android.widget.ImageButton[@content-desc='com.facebook.katana']"));

}
