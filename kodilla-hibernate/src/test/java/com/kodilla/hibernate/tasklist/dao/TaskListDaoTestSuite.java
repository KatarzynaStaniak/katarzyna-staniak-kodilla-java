package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList1 = new TaskList("myToDo", "things to do");
        TaskList taskList2 = new TaskList("myDone", "done things");

        taskListDao.save(taskList1);
        taskListDao.save(taskList2);
        String listName = taskList2.getListName();

        //When
        List<TaskList> listFoundByName = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, listFoundByName.size());
        Assert.assertEquals("done things", listFoundByName.get(0).getDescription());

        //CleanUp
        int id2 = taskList2.getId();
        int id1 = taskList1.getId();
        taskListDao.deleteById(id2);
        taskListDao.deleteById(id1);
    }
}
