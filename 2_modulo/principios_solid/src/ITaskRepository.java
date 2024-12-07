/*
 Interfaz de Gestion de las tareas:
* Agregar tareas
*Listar tareas
* completar una tarea
*/

import java.util.List;

public interface ITaskRepository {
    void addTask(Task task);
    List<Task> getTasks();
    void completeTask(int index);
}