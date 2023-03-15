package presentation;

import com.qcm.Main;
import lombok.Data;
import metier.IUserMetier;
import model.Utilisateur;

@Data
public class UserController implements IUserController{

    IUserMetier userMetier;
    @Override
    public Utilisateur Connexion() throws Exception {

        String usr,pwd;
        System.out.print("=> Username : ");
        usr = Main.clavier.nextLine();

        System.out.print("=> Password : ");
        pwd = Main.clavier.nextLine();

        Utilisateur user = new Utilisateur(usr,pwd);


        var u = userMetier.Connect(user);
        if (!u) {
            throw new Exception("Username/Password invalid");
        }
        else {
            System.out.println("Connect");
            return user;
        }

    }
}
