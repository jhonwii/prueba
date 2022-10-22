package userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
@DefaultUrl("https://utest.com/")
public class PaginaBienvenida extends PageObject {
    public static final Target UNETE_HOY = Target.the("boton unete hoy").located(By.className("unauthenticated-nav-bar__sign-up"));
}
