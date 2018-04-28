package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initContactCreation(){click(By.linkText("add new"));}

  public void initContactModification(){click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));}

  public void fillContactForm(ContactData contactData, boolean creation){

    type(By.name("firstname"),contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());

    if(creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }

  public void submitContactCreation(){click(By.xpath("//div[@id='content']/form/input[21]"));}
  public void submitContactModification(){click(By.xpath("//div[@id='content']/form[1]/input[22]"));}
  public void returnToHomePage(){click(By.linkText("home page"));}


}