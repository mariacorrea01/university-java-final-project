package com.university.model;

public class FullTimeTeacher extends Teacher {
    private int experienceYears;


    public FullTimeTeacher(String name, double Basesalary, int ExeperienceYears){
        super(name,Basesalary);
        this.experienceYears= ExeperienceYears;
    }

    @Override
    public double calculateSalary() {
        double experience = experienceYears*1.10;
        return getBasesalary()*experience;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
