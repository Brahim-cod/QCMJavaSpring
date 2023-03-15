package model;

import lombok.*;

import java.util.List;

@Data @AllArgsConstructor
public class Question {

    private Long ID;
    private String Title;
    private List<String> Answers;
    private Integer CorrectAnswer;

    @Override
    public String toString() {

        var qutStr  = "=============================================================================\n";
            qutStr += "=> Question n° " + getID() + "                                               \n";
            qutStr += "=> "   + getTitle() +                    "\n";
            qutStr += "-----------------------------------------------------------------------------\n";
        for (int i = 0; i < getAnswers().size(); i++) {
            int charCode = i + 65;
            qutStr += "=> " + Character.toString((char) charCode) + " : "   + getAnswers().get(i) +    "\n" ;
        }
            qutStr += "-----------------------------------------------------------------------------\n";
            qutStr += "=============================================================================\n";

        return qutStr;
    }

}
