package com.itimbalenco.homework.homework25052021;

import java.time.LocalDate;

public class TeamLeader extends ProductionWorker{

    private int monthBonusAmount;
    private int requiredTrainHours;
    private int performedTrainHours;

    public TeamLeader(String name, String number, LocalDate hireDate, int shift, double payRate, int monthBonusAmount, int requiredTrainHours) throws Exception {
        super(name, number, hireDate, shift, payRate);
        this.monthBonusAmount = monthBonusAmount;
        this.requiredTrainHours = requiredTrainHours;
    }

    public int getMonthBonusAmount() {
        return monthBonusAmount;
    }

    public void setMonthBonusAmount(int monthBonusAmount) {
        this.monthBonusAmount = monthBonusAmount;
    }

    public int getRequiredTrainHours() {
        return requiredTrainHours;
    }

    public void setRequiredTrainHours(int requiredTrainHours) {
        this.requiredTrainHours = requiredTrainHours;
    }

    public int getPerformedTrainHours() {
        return performedTrainHours;
    }

    public void setPerformedTrainHours(int performedTrainHours) {
        this.performedTrainHours = performedTrainHours;
    }
}
