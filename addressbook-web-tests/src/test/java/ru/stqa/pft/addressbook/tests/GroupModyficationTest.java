package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModyficationTest extends TestBase {

  @Test
  public void testGroupModyfication(){
    app.getNavigationHelper().goToGroupPage();
    if(! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().CreateGroup(new GroupData("FirstGroup", "Test 1", "Test 2"));
    }
    app.getGroupHelper().SelectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("FirstGroup", "test1", "Test2"));
    app.getGroupHelper().submitModification();
    app.getGroupHelper().returnToGroupPage();

  }
}
