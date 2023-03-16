package com.qcm.metier;

import com.qcm.dao.IDao;
import lombok.Data;
import com.qcm.model.Question;

import java.util.List;

@Data
public class QuestionMetier implements IQuestionMetier{

    IDao<Question, Long> questionDao;
    @Override
    public List<Question> QUESTIONS_DISPO() {

        return questionDao.BD();
    }
}
