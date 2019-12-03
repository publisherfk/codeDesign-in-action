package com.heshi.design.event;

import com.heshi.design.event.entities.Course;
import com.heshi.design.event.entities.Question;
import com.heshi.design.event.entities.Teacher;

/**
 * 观察者模式
 */
public class App {
    public static void main(String[] args) {
        Course course = new Course("Java程序设计");
        Teacher teacher = new Teacher("何时");
        course.addObserver(teacher);
        Question question = new Question();
        question.setQuestionContent("Oauth2注销问题");
        question.setUserName("Stack");
        course.produceQuestion(course, question);
    }
}
