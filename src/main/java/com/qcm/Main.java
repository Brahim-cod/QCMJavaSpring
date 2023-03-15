package com.qcm;


import metier.ITestMetier;
import model.Test;
import model.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ITestController          testController;
    static IUserController          userController;
    static IQuestionController      questionController;
    public static Scanner                  clavier = new Scanner(System.in);

    static void Test(){



    }

    static void SpringTest(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        userController      = (IUserController) context.getBean("userController");
        testController      = (ITestController) context.getBean("testController");
        questionController  = (IQuestionController) context.getBean("qtsController");


        try {

            testController.DisplayScore(userController.Connexion(),questionController.QUESTIONS_DISPO());


        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Fin Spring");
    }

    public static void main(String[] args) {

        SpringTest();

    }
}