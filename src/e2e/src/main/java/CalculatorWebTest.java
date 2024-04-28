import java.util.regex.Pattern;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CalculatorWebTest {
    private Page page;

    @BeforeEach
    public void setUp() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        page = browser.newPage();
        page.navigate("localhost:8080");
    }

    @Test
    public void CalculatorUI_VerifyPageTitle_IsCalculator() {
        // preq-E2E-TEST-5

        assertThat(page).hasTitle(Pattern.compile("Calculator"));
    }

    @Test
    public void test2() { // RENAME!!!!!!!!!
        // preq-E2E-TEST-6

        page.locator("input[name=\"operand1\"]").fill("3");
        page.locator("input[name=\"operand2\"]").fill("5");
        page.locator("button[id=\"operationAdd\"]").click();

        assertThat(page.locator("p[id=\"result\"]")).hasText("8.0");
    }

    @Test
    public void test3() { // RENAME!!!!!!!!!
        // preq-E2E-TEST-7

        page.locator("input[name=\"operand1\"]").fill("3");
        page.locator("input[name=\"operand2\"]").fill("0");
        page.locator("button[id=\"operationDivide\"]").click();

        //assertThat(page.locator("p[id=\"result\"]")).hasText("Enter value(s) below and select an operation.");
    }

    @Test
    public void test4() { // RENAME!!!!!!!!!
        // preq-E2E-TEST-8

        page.locator("input[name=\"operand1\"]").fill("3");
        page.locator("input[name=\"operand2\"]").fill("fifteen");
        page.locator("button[id=\"operationAdd\"]").click();

        //assertThat();
    }

    @Test
    public void test5() { // RENAME!!!!!!!!!
        // preq-E2E-TEST-9

        page.locator("input[name=\"operand1\"]").fill("3");
        page.locator("input[name=\"operand2\"]").fill("5");
        page.locator("button[id=\"operationAdd\"]").click();
        page.locator("button[id=\"clearResults\"]").click();

        assertThat(page.locator("p[id=\"result\"]")).hasText("Enter value(s) below and select an operation.");
    }
}