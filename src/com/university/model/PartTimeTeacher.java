package com.university.model;

public class PartTimeTeacher extends Teacher {
    private int activeHoursPerWeek;

    public PartTimeTeacher(String name, double basesalary, int activeHoursPerWeek){
        super(name,basesalary);
        this.activeHoursPerWeek=activeHoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return getBasesalary()*activeHoursPerWeek;
    }

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(int activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }
}
