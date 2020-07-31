import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Path to your feature file
        features = {"src/main/resources/Feature"},

        // Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"StepDef", "Drivers"},

        // This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty"},

        // This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,

        // Specify tags to be executed
        tags = {"@sky, @Cal"},

        // readable console logs
        monochrome = true
)
public class TestRunner {
}
