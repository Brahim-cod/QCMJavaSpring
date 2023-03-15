package metier;

import dao.DaoVolatile.QuestionDao;
import dao.IDao;
import lombok.Data;
import model.Question;

import java.util.List;
import java.util.Locale;
import java.util.Set;

@Data
public class QuestionMetier implements IQuestionMetier{

    IDao<Question, Long> questionDao;
    @Override
    public List<Question> QUESTIONS_DISPO() {

        return questionDao.BD();
    }
}
