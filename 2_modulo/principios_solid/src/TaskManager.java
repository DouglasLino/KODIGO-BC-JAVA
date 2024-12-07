/*
Clase que gestiona las tareas, usuarios y proyectos, implementa todas las interfaces
* Contiene las listas para almacenar tareas, usuarios y proyectos
 */

import java.util.ArrayList;
import java.util.List;

public class TaskManager implements ITaskRepository, IUserRepository, IProjectRepository {

    private List<Task> tasks;
    private List<User> users; // Lista de usuarios.
    private List<Project> projects; // Lista de proyectos.

    public TaskManager() {
        tasks = new ArrayList<>();
        users = new ArrayList<>();
        projects = new ArrayList<>();

        //  usuarios por defecto.
        users.add(new User("Juan"));
        users.add(new User("Maria"));

        //  proyectos por defecto.
        Project projectA = new Project("Proyecto A");
        Project projectB = new Project("Proyecto B");

        projects.add(projectA);
        projects.add(projectB);

        //  tareas por defecto a los proyectos.
        projectA.addTask(new Task("Tarea 1", "Descripción de Tarea 1", users.get(0), projectA));
        projectA.addTask(new Task("Tarea 2", "Descripción de Tarea 2", users.get(1), projectA));

        tasks.add(new Task("Tarea 1", "Descripción de Tarea 1", users.get(0), projectA));
        tasks.add(new Task("Tarea 2", "Descripción de Tarea 2", users.get(1), projectA));
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> getTasks() {
        return tasks; // Devolver la lista de tareas.
    }

    @Override
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete(); // Completa la tarea seleccionada.
            System.out.println("Tarea completada exitosamente.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user); // Agregar usuario a la lista.
        System.out.println("Usuario " + user.getUsername() + " agregado exitosamente.");
    }

    @Override
    public List<User> getUsers() {
        return users; // Devolver la lista de usuarios.
    }

    @Override
    public void removeUser(User user) {
        users.remove(user); // Eliminar usuario de la lista.
        System.out.println("Usuario eliminado exitosamente.");
    }

    @Override
    public void addProject(Project project) {
        projects.add(project); // Agregar proyecto a la lista.
        System.out.println("Proyecto " + project.getName() + " agregado exitosamente.");
    }

    @Override
    public List<Project> getProjects() {
        return projects; // Devolver la lista de proyectos.
    }

    @Override
    public void removeProject(Project project) {
        projects.remove(project); // Eliminar proyecto de la lista.
        System.out.println("Proyecto eliminado exitosamente.");
    }
}