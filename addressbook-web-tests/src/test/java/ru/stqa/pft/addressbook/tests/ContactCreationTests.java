package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().contactCreation(new ContactData("Dima", "Klyuk", "FirstGroup"), true);
  }

}
