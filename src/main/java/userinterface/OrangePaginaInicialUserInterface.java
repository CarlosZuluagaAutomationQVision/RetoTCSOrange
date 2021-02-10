package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangePaginaInicialUserInterface {

    public static final Target LBL_ORANGE = Target.the("Label Orange").located(By.id("ohrm-small-logo"));
    public static final Target LBL_ADMIN = Target.the("Label Admin").located(By.xpath("//span[@class='left-menu-title' and contains(text(), 'Admin')]"));
    public static final Target LBL_USERS_MANAGMENT = Target.the("Label User Managment").located(By.xpath("//span[@class='left-menu-title' and contains(text(), 'User Management')]"));
    public static final Target LBL_USERS = Target.the("Label User").located(By.xpath("//span[@class='left-menu-title' and contains(text(), 'Users')]"));
    public static final Target LBL_ADD = Target.the("Label Add").located(By.xpath("//i[@class='material-icons' and contains(text(), 'add')]"));
    public static final Target TXT_USER_NAME = Target.the("tEXTO uSER nAME").located(By.id("user_name"));
    public static final Target TXT_EMPLOYEE_VALUE = Target.the("Label Add").located(By.id("selectedEmployee_value"));
    public static final Target TXT_PASSWORD = Target.the("Label Add").located(By.id("password"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Label Add").located(By.id("confirmpassword"));
    public static final Target BTN_SAVE = Target.the("").located(By.id("systemUserSaveBtn"));
    public static final Target LBL_PRIMER_USUARIO = Target.the("").located(By.xpath("//*[@id=\"systemUserDiv\"]/crud-panel/div/div/list/table/tbody/tr[1]/td[2]//span"));
}
