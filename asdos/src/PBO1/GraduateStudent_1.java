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
public class GraduateStudent extends Student {

    public String getCourseGrade() {
        int total = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            total += test[i];
        }
        if (total / NUM_OF_TESTS >= 85) {
            courseGrade = "Pass";
        } else {
            courseGrade = "No Pass";
        }
        return courseGrade;
    }
}
