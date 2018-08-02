package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    public String findGrade(Student student) {
        int sum = 0;
        for (Integer integer : student.getMarks()) {
            if (integer < 35) {
                return "F";
            } else sum += 0;
        }
        if (sum <= 150) {
            return "D";
        } else if (sum > 150 && sum <= 200) {
            return "C";
        } else if (sum > 200 && sum <= 250) {
            return "B";
        } else if (sum > 250 && sum <= 300) {
            return "A";
        }
        return "-1";
    }

    public String validate(Student student) throws NullStudentException,
            NullNameException,
            NullMarksArrayException {
        if (student == null) {
            throw new NullStudentException();
        } else {
            if (student.getName() == null) {
                throw new NullNameException();
            }
            if (student.getMarks() == null) {
                throw new NullMarksArrayException();
            }
        }
        return findGrade(student);
    }
}
