package com.qcm.dao.DaoVolatile;

import com.qcm.model.Utilisateur;
import com.qcm.dao.IDao;

import java.util.*;

public class UserDao implements IDao<Utilisateur, String> {
    @Override
    public Utilisateur getByID(String username) {
        return BD().stream()
                .filter(user -> user.getUsername().trim().equalsIgnoreCase(username.trim()))
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
