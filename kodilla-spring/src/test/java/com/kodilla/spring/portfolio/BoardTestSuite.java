package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //Board board =(Board) context.getBean("getBoard");
        Board board = context.getBean(Board.class);
        TaskList myToDoList = board.getToDoList();
        TaskList myInProgressList = board.getInProgressList();
        TaskList myDoneList = board.getDoneList();
        //When
        myToDoList.addTask("Buy a new car.");
        myInProgressList.addTask("Planning my Birthday Party.");
        myDoneList.addTask("Graduate.");
        //Then
        board.getToDoList().getTasks().stream()
                .forEach(System.out::println);
        board.getInProgressList().getTasks().stream()
                .forEach(System.out::println);
        board.getDoneList().getTasks().stream()
                .forEach(System.out::println);
        //String test1 = board.getToDoList().getTasks().get(0);
        //Assert.assertEquals("Buy a new car.", test1);
    }
}
