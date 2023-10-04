import java.util.LinkedList;

public class Client {


    public static void main(String[] args) {
        LinkedList<ToDo> ToDoList = new LinkedList<ToDo>();
        ToDo todo1 = new ToDo("Dog Walk", true);
        todo1.convertTime("11:00");
        ToDo todo2 = new ToDo("Groceries", true);
        todo2.convertTime("13:60");
        ToDo todo3 = new ToDo("Looking for serial killers", true);
        todo3.convertTime("24:25");
        ToDo todo4 = new ToDo("Morning Coffee", false);
        todo4.convertTime("06:15");
        ToDo todo5 = new ToDo();

        ToDoList.add(todo1);
        ToDoList.add(todo2);
        ToDoList.add(todo3);
        ToDoList.add(todo4);
        ToDoList.add(todo5);

        for (ToDo i : ToDoList) {
            i.printItem();
        }
    }
}
