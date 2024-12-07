/*
Interfaz que define los metodos para gestionar la los proyectos
* agregar proyectos
* listar proyectos
* eliminar proyectos
 */
import java.util.List;

public interface IProjectRepository {
    void addProject(Project project);
    List<Project> getProjects();
    void removeProject(Project project);
}