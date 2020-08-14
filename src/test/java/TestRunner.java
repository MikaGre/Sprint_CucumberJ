import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Path to your feature file
        features = {"src/main/resources/features"},

        // Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"StepDefinition", "Drivers"},

        // This creates cucumber reports
        plugin = {"pretty", "html:Reports/Default/"},

        // This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,

        // Specify tags to be executed
        tags = {"@addCC"},

        // readable console logs
        monochrome = true
)
public class TestRunner {
}

