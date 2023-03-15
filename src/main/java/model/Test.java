package model;

import lombok.*;

import java.util.List;

@Data @AllArgsConstructor
public class Test {
    private Long ID;
    private Utilisateur User;
    private List<Question> Questions;
    private Double Score;
    @Override
    public String toString(){
        var testStr  = "=============================================================================\n";
            testStr += "=> Test n° : " + getID() +                                                  "\n";
            testStr += "=> User    : "   + getUser().getUsername() +                                "\n";
            testStr += "=> Score   : " + getScore() +                                               "\n";
            testStr += "=============================================================================\n";
        return testStr;
    }
}
