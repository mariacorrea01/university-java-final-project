package com.university.model;

public abstract class Teacher {
    private String name;
    private double basesalary;
    private  int totalTeachers;

    public Teacher(String name, double Basesalary){
        this.name=name;
        this.basesalary=Basesalary;
        totalTeachers++;
    }

    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        basesalary = basesalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalTeachers() {
        return totalTeachers;
    }

    public void setTotalTeachers(int totalTeachers) {
        totalTeachers = totalTeachers;
    }

    public abstract double calculateSalary();
    public abstract String type();
}
