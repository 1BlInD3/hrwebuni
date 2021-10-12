package hu.webuni.blind.hr.dto;

import java.time.LocalDate;

public class EmployeeDto {
    private long id;
    private String name;
    private String position;
    private int wage;
    private LocalDate entryDate;

    public EmployeeDto(long id, String name, String position, int wage, LocalDate entryDate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.entryDate = entryDate;
    }

    public EmployeeDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
}
