package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupModyficationTest extends TestBase {

  @Test
  public void testGroupModyfication(){
    app.getNavigationHelper().goToGroupPage();
    if(! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().CreateGroup(new GroupData("FirstGroup", "Test 1", "Test 2"));
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("FirstGroup", "test1", "Test2"));
    app.getGroupHelper().submitModification();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());


  }
}
