package presentation;

import model.Question;
import model.Test;
import model.Utilisateur;

import java.util.List;

public interface ITestController {
    void DisplayScore(Utilisateur user, List<Question> questions);
}
