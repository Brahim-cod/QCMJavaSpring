package com.qcm.dao.DaoVolatile;

import com.qcm.model.Question;
import com.qcm.dao.IDao;

import java.util.*;

public class QuestionDao implements IDao<Question, Long> {
    @Override
    public Question getByID(Long qstID) {
        return BD().stream()
                .filter(q -> q.getID().equals(qstID))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Question> BD() {
        return new ArrayList<>(
                Arrays.asList(
                        new Question(1L,"Java est un langage",new ArrayList<>(Arrays.asList(
                                "Compilé",
                                "Interprété",
                                "Compilé et Interprété",
                                "Ni Compilé ni Interprété")
                        ),2),
                        new Question(2L,"Java est un langage développé par",new ArrayList<>(Arrays.asList(
                                "Hewlett-Packard",
                                "Sun Microsystems",
                                "Microsoft",
                                "Oracle")
                        ),1),
                        new Question(3L,"Choisissez la bonne réponse",new ArrayList<>(Arrays.asList(
                                "Une classe peut implémenter plusieurs interfaces mais doit étendre une seule classe",
                                "Une classe peut implémenter plusieurs classes mais doit étendre une seule interface",
                                "Une classe peut implémenter plusieurs classes et peut étendre plusieurs interfaces",
                                "Une classe doit implémenter une seule interface et étendre une seule classe")
                        ),0),
                        new Question(4L,"La liaison tardive est essentielle pour assurer",new ArrayList<>(Arrays.asList(
                                "L’encapsulation",
                                "Le polymorphisme",
                                "L’héritage",
                                "La marginalisation")
                        ),1)
                )
        );
    }
}
