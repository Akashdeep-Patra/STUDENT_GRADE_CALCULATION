package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
    static Student[] students = new Student[4];

    static {
        students[0] = new Student("Sekar", new int[]{35, 35, 35});
        students[1] = new Student(null, new int[]{11, 22, 33});
        students[2] = null;
        students[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();
        for (Student student : students) {
            try {
                System.out.println("GRADE = "+studentReport.validate(student));
            } catch (NullNameException e) {
                System.out.println(e.toString());
            } catch (NullStudentException e) {
                System.out.println(e.toString());
            } catch (NullMarksArrayException e) {
                System.out.println(e.toString());
            }
        }
        System.out.println("Number of Objects with Marks array as null="+studentService.findNumberOfNullMarks(students));
        System.out.println("Number of Objects with Name as null="+studentService.findNumberOfNullNames(students));
        System.out.println("Number of Objects that are entirely null="+studentService.findNumberOfNullObjects(students));

    }


}
