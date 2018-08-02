package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarks
            (Student[] data) {
        int sum = 0;
        for (Student student : data) {
            if (student!=null&&student.getMarks() == null) {
                sum++;
            }
        }
        return sum;
    }

    public int findNumberOfNullNames
            (Student[] data) {
        int sum = 0;
        for (Student student : data) {
            if (student!=null&&student.getName() == null) {
                sum++;
            }
        }
        return sum;
    }

    public int findNumberOfNullObjects
            (Student[] data) {
        int sum = 0;
        for (Student student : data) {
            if (student == null) {
                sum++;
            }
        }
        return sum;
    }

}
