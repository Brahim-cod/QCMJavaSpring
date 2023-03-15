package presentation;

import lombok.Data;
import metier.IQuestionMetier;
import metier.QuestionMetier;
import model.Question;

import java.util.List;
import java.util.Set;

@Data
public class QuestionController implements IQuestionController{

    IQuestionMetier questionMetier;


    @Override
    public List<Question> QUESTIONS_DISPO() {

        return questionMetier.QUESTIONS_DISPO();
    }
}
