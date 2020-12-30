package co.com.choucair.certification.retoBanca.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class Hooks {

@Before
    public void setTheStage(){ OnStage.setTheStage(new OnlineCast()); }
}
