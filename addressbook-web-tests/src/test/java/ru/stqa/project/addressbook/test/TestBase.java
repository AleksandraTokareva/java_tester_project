package ru.stqa.project.addressbook.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.project.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Tools\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
