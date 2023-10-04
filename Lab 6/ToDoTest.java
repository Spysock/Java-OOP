import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoTest {

    private ToDo test_todo;
    private static int counter;

    public ToDoTest(){

    }

    @Test
    public void test_defaultConstructor(){
        ToDo todo = new ToDo();
        test_todo = todo;
        assertEquals("No Item", test_todo.getTitle());
        assertFalse(test_todo.isCompleted());
        assertEquals(0, test_todo.getHours());
        assertEquals(0, test_todo.getMinutes());
        counter += 1;
    }

    @Test
    public void test_overloadedConstructor(){
        test_todo = new ToDo("Task 1", true);
        assertEquals("Task 1", test_todo.getTitle());
        assertTrue(test_todo.isCompleted());
        assertEquals(test_todo.getHours(), 0);
        assertEquals(0, test_todo.getMinutes());
        counter++;
    }

    @Test
    public void test_convertTime(){
        test_todo = new ToDo("Task 2", true);

        // Test valid time
        test_todo.convertTime("11:00");
        assertEquals(11, test_todo.getHours());
        assertEquals(0, test_todo.getMinutes());
        assertTrue(test_todo.isCompleted());

        // Test invalid time: hour out of range
        test_todo.convertTime("24:25");
        assertEquals(-1, test_todo.getHours());
        assertEquals(25, test_todo.getMinutes());
        assertFalse(test_todo.isCompleted());

        // Test invalid time: minute out of range
        test_todo.convertTime("13:60");
        assertEquals(-1, test_todo.getHours());
        assertEquals(-1, test_todo.getMinutes());
        assertFalse(test_todo.isCompleted());

        // Test more than 5 characters
        test_todo.convertTime("13:600");
        assertEquals(-1, test_todo.getHours());
        assertEquals(-1, test_todo.getMinutes());
        assertFalse(test_todo.isCompleted());

        counter += 1;
    }
}
