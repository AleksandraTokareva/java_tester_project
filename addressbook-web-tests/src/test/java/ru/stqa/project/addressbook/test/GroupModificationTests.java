package ru.stqa.project.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.project.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupsHelper().selectGroup();
        app.getGroupsHelper().intGroupModification();
        app.getGroupsHelper().fillGroupForm(new GroupData("test10", "test20", "test30"));
        app.getGroupsHelper().submitGroupModification();
    }

}
