package com.titanic.modelo;

import com.titanic.interfaz.Identificable;

public class Pasajero implements Identificable {

    private int passengerId;
    private int survived;
    private int pclass;
    private String surname;
    private String name;
    private String sex;
    private Double age;
    private int sibSp;
    private int parch;
    private String ticket;
    private double fare;
    private String cabin;
    private String embarked;

    public Pasajero(int passengerId, int survived, int pclass, String name,String surname, String sex,
                    Double age, int sibSp, int parch, String ticket,
                    double fare, String cabin, String embarked) {
        this.passengerId = passengerId;
        this.survived = survived;
        this.pclass = pclass;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.sibSp = sibSp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
    }

    @Override
    public String getId() {
        return String.valueOf(passengerId);
    }

    public int getPassengerId() {
        return passengerId;
    }

    public int getSurvived() {
        return survived;
    }

    public int getPclass() {
        return pclass;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Double getAge() {
        return age;
    }

    public int getSibSp() {
        return sibSp;
    }

    public int getParch() {
        return parch;
    }

    public String getTicket() {
        return ticket;
    }

    public double getFare() {
        return fare;
    }

    public String getCabin() {
        return cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public boolean sobrevivio() {
        return survived == 1;
    }
    

    public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean esMujer() {
        return "female".equalsIgnoreCase(sex);
    }

    public boolean esHombre() {
        return "male".equalsIgnoreCase(sex);
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "passengerId=" + passengerId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", survived=" + survived +
                '}';
    }
}