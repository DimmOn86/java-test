package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModyficationTest extends TestBase {

  @Test
  public void testGroupModyfication(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().SelectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("FirstGroup", "test1", "Test2"));
    app.getGroupHelper().submitModification();
    app.getGroupHelper().returnToGroupPage();

  }
}
