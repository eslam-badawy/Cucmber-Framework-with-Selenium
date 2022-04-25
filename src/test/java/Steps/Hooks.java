package Steps;

import com.crm.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks extends Base {
    public Hooks() throws IOException {
    }

    @Before
    public void runsBeforeAnyScenario(){
        launchBrowser();

    }

    @After
    public void runsAfterAnyScenario(){
     driver.quit();
    }

}
