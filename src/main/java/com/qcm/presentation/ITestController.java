package com.qcm.presentation;

import com.qcm.model.Utilisateur;
import com.qcm.model.Question;

import java.util.List;

public interface ITestController {
    void DisplayScore(Utilisateur user, List<Question> questions);
}
