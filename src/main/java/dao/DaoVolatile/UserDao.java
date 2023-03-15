package dao.DaoVolatile;

import dao.IDao;
import model.Utilisateur;

import java.util.*;

public class UserDao implements IDao<Utilisateur, String> {
    @Override
    public Utilisateur getByID(String username) {
        return BD().stream()
                .filter(user -> user.getUsername().trim().toLowerCase().equals(username.trim().toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Utilisateur> BD() {
        return new ArrayList<>(
                Arrays.asList(
                        new Utilisateur("Brahim", "123456"),
                        new Utilisateur("Imad", "654321"),
                        new Utilisateur("Reda", "456789"),
                        new Utilisateur("Mohamed", "987654")
                )
        );
    }


}
