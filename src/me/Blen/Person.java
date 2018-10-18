package me.Blen;

public class Person {
    private String name;
    private int dateCount = 0;
    private Male male;
    private Female female;


    public int getDateCount() {
        return dateCount;
    }

    public void setDateCount(int dateCount) {
        this.dateCount = dateCount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
