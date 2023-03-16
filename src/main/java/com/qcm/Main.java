package com.qcm;



import com.qcm.presentation.IQuestionController;
import com.qcm.presentation.ITestController;
import com.qcm.presentation.IUserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import java.util.Scanner;

public class Main {
    static ITestController testController;
    static IUserController userController;
    static IQuestionController questionController;
    public static Scanner                  clavier = new Scanner(System.in);


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