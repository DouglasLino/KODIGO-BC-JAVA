/*
Clase que representa una usuario, el cual contiene
* Titulo
* descripcion
*nombre del usuario
 */

import java.util.List;

public class User implements IUserRepository {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void addUser(User user) {
        // Este método no se utiliza aquí.
        // La gestión de usuarios se realiza en TaskManager.
    }

    @Override
    public List<User> getUsers() {
        return null; // No se implementa aquí, se gestiona en TaskManager.
    }

    @Override
    public void removeUser(User user) {
        System.out.println("Usuario " + user.getUsername() + " eliminado.");
    }

    public String getUsername() {
        return username;
    }
}