/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert9;

/**
 *
 * @author Tak Bertuan
 */
public class Student {

    protected final static int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student() {
        this ("No Name");
    }

    public Student(String studentName) {
        name = studentName;
        test = new int[NUM_OF_TESTS];
        courseGrade = "****";
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName() {
        return name;
    }

    public int getTestScore(int testNumber) {
        return test[testNumber - 1];
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setTestScore(int testNumber, int testScore) {
        test[testNumber - 1] = testScore;
    }
}
