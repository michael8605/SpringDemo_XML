package org.example;

public class Phone {

    private String mob;

    //Setter
    public void setMob(String mob) {
        this.mob = mob;
    }

    //Getter
    public String getMob() {
        return mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
