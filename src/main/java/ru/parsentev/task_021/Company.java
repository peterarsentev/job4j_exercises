package ru.parsentev.task_021;

/**
 * Created by parsentev on 03.09.2016.
 */
public class Company {
    public final Company parent;
    public final long employeeCount;

    Company(Company parent, long employeeCount) {
        this.parent = parent;
        this.employeeCount = employeeCount;
    }
}
