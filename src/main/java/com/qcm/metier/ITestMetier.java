package com.qcm.metier;

import com.qcm.model.Test;

import java.util.List;

public interface ITestMetier {

    Test Calcul_Score(Test test, List<Integer> Answers);

}
