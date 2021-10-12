package hu.webuni.blind.hr.dto;


import java.time.LocalDateTime;

public class HrDto {
    private long id;
    private String name;
    private String position;
    private int wage;
    private LocalDateTime entryDate;

    public HrDto(long id, String name, String position, int wage, LocalDateTime entryDate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.entryDate = entryDate;
    }

    public HrDto() {
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

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }
}
