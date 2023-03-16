package com.qcm.presentation;

import lombok.Data;
import com.qcm.metier.IQuestionMetier;
import com.qcm.model.Question;

import java.util.List;

@Data
public class QuestionController implements IQuestionController{

    IQuestionMetier questionMetier;


    @Override
    public List<Question> QUESTIONS_DISPO() {

        return questionMetier.QUESTIONS_DISPO();
    }
}
