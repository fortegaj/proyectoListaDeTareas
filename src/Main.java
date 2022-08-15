
import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // first task using just the getter methods
        /*Task task1 = new Task ("comer 12 uvas", LocalDate.of(2022, 12, 31));
        System.out.println("descripción de la tarea");
        System.out.println(task1.getDescription());
        System.out.println("fecha de la tarea: ");
        System.out.println(task1.getDueDate());
        System.out.println("esta lista?");
        System.out.println(task1.getDone());

        //modifying the task properties using the methods setter
        task1.setDescription("comer 12 uvas y correr por toda la cuadra");
        System.out.println("nueva descripción de la tarea: ");
        System.out.println(task1.getDescription());*/

        Task task1 = new Task("comer 12 uvas", LocalDate.of(2022, 12, 31));
        Task task2 = new Task("recorrer la cuadra", LocalDate.of(2022, 12, 31));
        Task task3 = new Task("abrazar a mi mama", LocalDate.of(2022, 12, 31));

        TaskList tasks = new TaskList("agueros del 31");

        tasks.addTask(task1);
        tasks.addTask(task2);
        tasks.addTask(task3);

        System.out.println("Tareas iniciales");
        tasks.printTasks();

        tasks.removeTask("recorrer la cuadra");
        System.out.println("Tareas finales");
        tasks.printTasks();

    }
}