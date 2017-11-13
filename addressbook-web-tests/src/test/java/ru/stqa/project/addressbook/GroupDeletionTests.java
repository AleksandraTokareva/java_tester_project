package ru.stqa.project.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {
        goToGroupPage();
        selectGroup();
        deliteSelectedGroup();
        returnToGroupPage();
    }

}
