package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enums.SectionsNaming;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {
    final SelenideElement title = $x("//h1[text()='Projects']");
    final ElementsCollection projects_title = $$x("//tr//a");

    public ProjectsPage waitPageLoaded() {
        title.should(Condition.exist).shouldBe(Condition.visible);
        return this;
    }

    public ProjectsPage checkPageTitle() {
        title.shouldHave(text(SectionsNaming.PROJECTS.getDisplayName()));
        return this;
    }

    public ProjectsPage checkProjectExist() {
        projects_title.findBy(Condition.text("TO DO list")).should(Condition.exist);
        return this;
    }
}
