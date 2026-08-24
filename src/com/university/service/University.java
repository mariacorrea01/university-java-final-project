package com.university.service;

import com.university.model.Student;
import com.university.model.Teacher;
import com.university.model.UniversityClass;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<UniversityClass> classes;

    public University() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<UniversityClass> getClasses() {
        return classes;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addClasses(UniversityClass universityClass){
        classes.add(universityClass);
    }



    public void addStudents(Student student){
        students.add(student);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId()==id) {
                return student;
            }
        } return null;
    }
}
