package com.qcm.metier;

import com.qcm.model.Utilisateur;
import com.qcm.dao.IDao;
import lombok.*;


@Data
public class UserMetier implements IUserMetier{

    IDao<Utilisateur,String> userdao;
    @Override
    public Boolean Connect(Utilisateur utilisateur) {

        var user = userdao.getByID(utilisateur.getUsername());
        if (user == null) {
            System.out.println("null"); return false; }
        return user.getPassword().equals(utilisateur.getPassword());
    }
}
