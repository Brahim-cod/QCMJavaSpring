package com.qcm.metier;

import com.qcm.model.Test;

import java.util.List;

public class TestMetier implements ITestMetier{

    @Override
    public Test Calcul_Score(Test test, List<Integer> Answers) {

        int correctAnswersNumber = 0;

        for (int i = 0; i < test.getQuestions().size(); i++) {
            if (test.getQuestions().get(i).getCorrectAnswer().equals(Answers.get(i))) correctAnswersNumber++;
        }

        Double score = 20 * (correctAnswersNumber + 0.) / test.getQuestions().size();
        test.setScore(score);

        return test;
    }
}
