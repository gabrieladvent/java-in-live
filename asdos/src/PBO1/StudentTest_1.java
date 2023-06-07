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
public class StudentTest {

    public static void main(String[] args) {
        Student[] roster = new Student[40];
        roster[0] = new GraduateStudent();
        roster[0].setTestScore(1, 70);
        roster[0].setTestScore(2, 70);
        roster[0].setTestScore(3, 70);

        roster[1] = new UndergraduateStudent();
        roster[1].setTestScore(1, 70);
        roster[1].setTestScore(2, 70);
        roster[1].setTestScore(3, 70);

        roster[2] = new UndergraduateStudent();
        roster[2].setTestScore(1, 82);
        roster[2].setTestScore(2, 82);
        roster[2].setTestScore(3, 82);
        int undergradCount = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(roster[i].getCourseGrade());
        }
    }
}
