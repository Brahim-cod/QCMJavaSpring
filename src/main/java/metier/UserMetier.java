package metier;

import dao.DaoVolatile.UserDao;
import dao.IDao;
import lombok.*;
import model.Utilisateur;


@Data
public class UserMetier implements IUserMetier{

    IDao<Utilisateur,String> userdao;
    @Override
    public Boolean Connect(Utilisateur utilisateur) {

        var user = userdao.getByID(utilisateur.getUsername());
        if (user == null) {
            System.out.println("null"); return false; }
        if (user.getPassword().equals(utilisateur.getPassword())) { return true; }
        return false;
    }
}
