package testRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    plugin = {"html: test-reports"},
    monochrome = true
)

public class ActivitiesRunner {}