package com.qcm.model;

import lombok.*;

import java.util.List;

@Data @AllArgsConstructor
public class Question {

    private Long ID;
    private String Title;
    private List<String> Answers;
    private Integer CorrectAnswer;

    @Override
    public String toString() {

        StringBuilder qutStr  = new StringBuilder("=============================================================================\n");
            qutStr.append("=> Question n° ").append(getID()).append("                                               \n");
            qutStr.append("=> ").append(getTitle()).append("\n");
            qutStr.append("-----------------------------------------------------------------------------\n");
        for (int i = 0; i < getAnswers().size(); i++) {
            int charCode = i + 65;
            qutStr.append("=> ").append((char) charCode).append(" : ").append(getAnswers().get(i)).append("\n");
        }
            qutStr.append("-----------------------------------------------------------------------------\n");
            qutStr.append("=============================================================================\n");

        return qutStr.toString();
    }

}
