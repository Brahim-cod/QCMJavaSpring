package model;

import lombok.*;

@Data @AllArgsConstructor
public class Utilisateur {
    private String Username;
    private String Password;

    @Override
    public String toString(){
        var testStr  = "=============================================================================\n";
            testStr += "=> Username    : "   + getUsername() +                                      "\n";
            testStr += "=> Password    : " + getPassword() +                                        "\n";
            testStr  = "=============================================================================\n";
        return testStr;
    }
}

