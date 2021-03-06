package amazon.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchElement extends BaseElement {

    public SearchElement(WebElement rootElement) {
        super(rootElement);
    }

    public WebElement searchFieldElement() {
        return this.rootElement.findElement(By.id("twotabsearchtextbox"));
    }

    public Select sectionsDropdown() {
        return new Select(this.rootElement.findElement(By.id("searchDropdownBox")));
    }

    public WebElement searchButton() {
        return this.rootElement.findElement(By.xpath("//div[@id = 'nav-search']//input[@type = 'submit' and @class = 'nav-input']"));
    }
}
