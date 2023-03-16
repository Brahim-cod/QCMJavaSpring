package com.qcm.presentation;

import com.qcm.Main;
import com.qcm.model.Utilisateur;
import lombok.Data;
import com.qcm.metier.ITestMetier;
import com.qcm.model.Question;
import com.qcm.model.Test;

import java.util.ArrayList;
import java.util.List;
@Data
public class TestController implements ITestController{

    ITestMetier testMetier;
    @Override
    public void DisplayScore(Utilisateur user, List<Question> questions) {
        Test test = new Test(1L, user,questions,0.);
        List<Integer> ans = new ArrayList<>();

        int x = 0;

        do {
            char c;
            System.out.println(test.getQuestions().get(x));
            System.out.print("=> Answer : ");
            c = Main.clavier.nextLine().charAt(0);
            ans.add( ((int) c) - 65 );
            x++;
        }while (x != test.getQuestions().size());


        var testScore = testMetier.Calcul_Score(test,ans);
        System.out.println(testScore);
    }
}
