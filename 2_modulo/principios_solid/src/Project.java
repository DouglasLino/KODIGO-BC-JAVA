/*
Clase que representa un proyecto, el cual contiene
* Titulo
* nombre del proyecto
* lista de tareas asociadas
 */

import java.util.ArrayList;
import java.util.List;

public class Project implements IProjectRepository {
    private String name;
    private List<Task> tasks;

//    constructor
    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

//
    @Override
    public void addProject(Project project) {
        // Este método no se utiliza aquí.
        // La gestión de proyectos se realiza en TaskManager.
    }

    @Override
    public List<Project> getProjects() {
        return null; // No se implementa aquí, se gestiona en TaskManager.
    }

//    muestro mensaje que se a eliminado
    @Override
    public void removeProject(Project project) {
        System.out.println("Proyecto " + project.getName() + " eliminado.");
    }

//     agrego tareas al proyecto
    public void addTask(Task task) {
        tasks.add(task);
    }

//    listo
    public List<Task> getTasks() {
        return tasks;
    }
// devuelvo nombre del proyecto
    public String getName() {
        return name;
    }
}