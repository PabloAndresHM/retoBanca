package co.com.choucair.certification.retoBanca.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage {
    private String  name, last_name, email, birth_day, birth_month, birth_year, language, city, postal, country, password;

    public static final Target INPUT_NAME=Target.the("Where we write the name").located(By.id("firstName"));
    public static final Target LAST_NAME=Target.the("Where we write the last name").located(By.id("lastName"));
    public static final Target EMAIL=Target.the("Where we write the Email").located(By.id("email"));
    public static final Target BIRTH_DAY=Target.the("Where we write the day of birth").located(By.id("birthDay"));
    public static final Target BIRTH_MONTH=Target.the("Where we write the month of birth").located(By.id("birthMonth"));
    public static final Target BIRTH_YEAR=Target.the("Where we write the year of birth").located(By.id("birthYear"));
    public static final Target LANGUAGE=Target.the("Where we write the language").located(By.className("ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty"));
    public static final Target BUTTON_NEXT_LOCATION= Target.the("Button to continue to the next step").located(By.className("btn btn-blue"));
    public static final Target CITY=Target.the("Where we write the city of resident").located(By.id("city"));
    public static final Target POSTAL=Target.the("Where we write the postal code").located(By.id("zip"));
    public static final Target COUNTRY=Target.the("Where we write the country").located(By.className("ui-select"));
    public static final Target BUTTON_NEXT_DEVICES= Target.the("Button to continue to the next step").located(By.className("btn btn-blue"));
    public static final Target BUTTON_NEXT_LAST_STEP= Target.the("Button to continue to the next step").located(By.className("btn btn-blue"));
    public static final Target PASSWORD=Target.the("Where we write the password").located(By.id("password"));
    public static final Target RE_PASSWORD=Target.the("Where we write the confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED=Target.the("check the information").located(By.className("input-check-box signup-consent signup-consent--highlight"));
    public static final Target CHECK_READ_TERMS=Target.the("check the read of terms and conditions").located(By.className("input-check-box signup-consent"));
    public static final Target CHECK_ACCEPT_POLITICS=Target.the("check that accept politics").located(By.className("row col-xs-12"));
    public static final Target MESSAGE_INIT = Target.the("choose a message to confirm the profile ").located(By.className("sub-title"));



}
