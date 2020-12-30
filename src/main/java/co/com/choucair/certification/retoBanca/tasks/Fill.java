package co.com.choucair.certification.retoBanca.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.retoBanca.userinterface.FillPage.*;

public class Fill implements Task {
    private String  name, last_name, email, birth_day, birth_month, birth_year, language, city, postal, country, password;

    public Fill(String name, String last_name, String email, String birth_day, String birth_month, String birth_year,
                String language, String city, String postal, String country, String password) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.birth_day = birth_day;
        this.birth_month = birth_month;
        this.birth_year = birth_year;
        this.language = language;
        this.city = city;
        this.postal = postal;
        this.country = country;
        this.password = password;
    }

    public static Performable the(String name, String last_name, String email, String birth_day, String birth_month,
                                  String birth_year, String language, String city, String postal, String country,
                                  String password) {
        return Tasks.instrumented(Fill.class,name,last_name,email,birth_day,
                birth_month,birth_year,language,city,postal,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(INPUT_NAME),
                Enter.theValue(last_name).into(LAST_NAME),
                Enter.theValue(email).into(EMAIL),
                Click.on(BIRTH_MONTH),
                Enter.theValue(birth_month).into(BIRTH_MONTH),
                Click.on(BIRTH_DAY),
                Enter.theValue(birth_day).into(BIRTH_DAY),
                Click.on(BIRTH_YEAR),
                Enter.theValue(birth_year).into(BIRTH_YEAR),
                Enter.theValue(language).into(LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(LANGUAGE),
                Click.on(BUTTON_NEXT_LOCATION),

                Enter.theValue(city).into(CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(CITY),
                Hit.the(Keys.ENTER).keyIn(CITY),
                Enter.theValue(postal).into(POSTAL),
                Enter.theValue(country).into(country),
                Click.on(BUTTON_NEXT_DEVICES),
                Click.on(BUTTON_NEXT_LAST_STEP),
                Enter.theValue(password).into(PASSWORD),
                Enter.theValue(password).into(RE_PASSWORD),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_READ_TERMS),
                Click.on(CHECK_ACCEPT_POLITICS)

        );
    }
}
