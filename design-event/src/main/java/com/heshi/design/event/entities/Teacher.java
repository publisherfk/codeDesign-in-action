package com.heshi.design.event.entities;

import java.util.Observable;
import java.util.Observer;

/**
 * @author by fukun
 */
public class Teacher extends Person implements Observer {
    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(getName() + "老师的" + course.getCourseName() + "接收到一个" + question.getUserName() + "提出的 " + question.getQuestionContent());
    }
}
