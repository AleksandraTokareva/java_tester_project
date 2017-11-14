package ru.stqa.project.addressbook.test;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupsHelper().selectGroup();
        app.getGroupsHelper().deliteSelectedGroup();
        app.getGroupsHelper().returnToGroupPage();
    }

}
