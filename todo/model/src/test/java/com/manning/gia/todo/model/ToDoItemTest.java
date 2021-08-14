package com.manning.gia.todo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToDoItemTest {

    @Test
    public void getId() {
        ToDoItem toDoItem = new ToDoItem();
        toDoItem.setId(2L);
        assertEquals(2L, toDoItem.getId().longValue());
    }

    @Test
    public void getName() {
        ToDoItem toDoItem = new ToDoItem();
        toDoItem.setName("study");
        assertEquals("study", toDoItem.getName());
    }

    @Test
    public void isCompleted() {
        ToDoItem toDoItem = new ToDoItem();
        toDoItem.setCompleted(true);
        assertTrue(toDoItem.isCompleted());
    }

    @Test
    public void testToString() {
        ToDoItem toDoItem = new ToDoItem();
        toDoItem.setId(2L);
        toDoItem.setName("study");
        toDoItem.setCompleted(true);
        System.out.println(toDoItem.toString());
    }
}