/*
Interfaz que define los metodos para gestionar la los usuarios
* agregar usuario
* listar usuario
* eliminar usuario
 */

import java.util.List;

public interface IUserRepository {
    void addUser(User user);
    List<User> getUsers();
    void removeUser(User user);
}