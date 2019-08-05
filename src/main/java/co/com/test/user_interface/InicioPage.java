package co.com.test.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPage{

    public static final Target BTN_LUPA = Target.the("Botón de búsqueda Lupa").located(By.xpath("//android.widget.TextView[@content-desc='Search']"));
    public static final Target TXT_BUSCAR = Target.the("Campo de búsqueda App").located(By.xpath("//android.widget.EditText[@resource-id='com.wt.apkinfo:id/search_src_text']"));
    public static final Target BTN_APP = Target.the("App GMAIL").located(By.id("com.wt.apkinfo:id/icon1"));
}
