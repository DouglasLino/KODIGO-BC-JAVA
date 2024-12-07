/*
Clase que representa una tarea, el cual contiene
* Titulo
* descripcion
*estado de la tera
* usuario asignado
*proyecto asignado
 */

public class Task {
    private String title;
    private String description;
    private boolean completed;
    private User assignedUser; // Usuario asignado a la tarea.
    private Project assignedProject; // Proyecto asignado a la tarea.

    public Task(String title, String description, User assignedUser, Project assignedProject) {
        this.title = title;
        this.description = description;
        this.completed = false;
        this.assignedUser = assignedUser;
        this.assignedProject = assignedProject;
    }

    public void complete() {
        this.completed = true; // Cambia el estado a completada.
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public Project getAssignedProject() {
        return assignedProject;
    }
}