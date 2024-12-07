import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Eliminar Usuario");
            System.out.println("3. Agregar Proyecto");
            System.out.println("4. Eliminar Proyecto");
            System.out.println("5. Crear Tarea");
            System.out.println("6. Mostrar Tareas Pendientes");
            System.out.println("7. Completar Tarea");
            System.out.println("0. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (choice) {
                case 1: // Agregar Usuario.
                    System.out.print("Nombre de Usuario: ");
                    String username = scanner.nextLine();
                    taskManager.addUser(new User(username));
                    break;

                case 2: // Eliminar Usuario.
                    System.out.print("Nombre del Usuario a eliminar: ");
                    String userToRemove = scanner.nextLine();
                    User userFound = null;
                    for (User user : taskManager.getUsers()) {
                        if (user.getUsername().equalsIgnoreCase(userToRemove)) {
                            userFound = user;
                            break;
                        }
                    }
                    if (userFound != null) {
                        taskManager.removeUser(userFound);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 3: // Agregar Proyecto.
                    System.out.print("Nombre del Proyecto: ");
                    String projectName = scanner.nextLine();
                    taskManager.addProject(new Project(projectName));
                    break;

                case 4: // Eliminar Proyecto.
                    System.out.print("Nombre del Proyecto a eliminar: ");
                    String projectToRemove = scanner.nextLine();
                    Project projectFound = null;
                    for (Project project : taskManager.getProjects()) {
                        if (project.getName().equalsIgnoreCase(projectToRemove)) {
                            projectFound = project;
                            break;
                        }
                    }
                    if (projectFound != null) {
                        taskManager.removeProject(projectFound);
                    } else {
                        System.out.println("Proyecto no encontrado.");
                    }
                    break;

                case 5: // Crear Tarea.
                    System.out.print("Título de la Tarea: ");
                    String title = scanner.nextLine();

                    System.out.print("Descripción de la Tarea: ");
                    String description = scanner.nextLine();

                    // Mostrar usuarios disponibles para asignar la tarea.
                    System.out.println("Selecciona un usuario:");
                    for (int i = 0; i < taskManager.getUsers().size(); i++) {
                        User user = taskManager.getUsers().get(i);
                        System.out.println(i + ": " + user.getUsername());
                    }

                    int userIndexForTask = scanner.nextInt();
                    scanner.nextLine();

                    User selectedUserForTask = taskManager.getUsers().get(userIndexForTask);

                    // Mostrar proyectos disponibles para asignar la tarea.
                    System.out.println("Selecciona un proyecto:");
                    for (int i = 0; i < taskManager.getProjects().size(); i++) {
                        Project project = taskManager.getProjects().get(i);
                        System.out.println(i + ": " + project.getName());
                    }

                    int projectIndexForTask = scanner.nextInt();
                    scanner.nextLine();

                    Project selectedProjectForTask = taskManager.getProjects().get(projectIndexForTask);

                    // Crear la tarea y agregarla al TaskManager.
                    Task newTask = new Task(title, description, selectedUserForTask, selectedProjectForTask);
                    selectedProjectForTask.addTask(newTask);
                    taskManager.addTask(newTask);

                    System.out.println("Tarea creada exitosamente.");
                    break;

                case 6: // Mostrar Tareas Pendientes.
                    boolean hasPendingTasks = false;
                    for (Task task : taskManager.getTasks()) {
                        if (!task.isCompleted()) {
                            System.out.println("Título: " + task.getTitle() +
                                    " || Descripción: " + task.getDescription() +
                                    " || Asignado a: " + task.getAssignedUser().getUsername() +
                                    " || Proyecto: " + task.getAssignedProject().getName());
                            hasPendingTasks = true;
                        }
                    }

                    if (!hasPendingTasks) {
                        System.out.println("No hay tareas pendientes.");
                    }
                    break;

                case 7: // Completar Tarea.
                    System.out.println("Selecciona la tarea a completar:");
                    for (int i = 0; i < taskManager.getTasks().size(); i++) {
                        Task task = taskManager.getTasks().get(i);
                        if (!task.isCompleted()) {
                            System.out.println(i + ": " + task.getTitle());
                        }
                    }

                    int taskIndexToComplete = scanner.nextInt();
                    scanner.nextLine();

                    taskManager.completeTask(taskIndexToComplete);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}