package ru.jandex.practicum;

import java.util.Objects;

public class Ghost {
    private String name;
    private double age;
    private boolean isSing;

    public Ghost(double age, boolean isSing, String name) {
        this.age = age;
        this.isSing = isSing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isSing() {
        return isSing;
    }

    public void setFly(boolean fly) {
        isSing = fly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ghost ghost = (Ghost) o;
        return Double.compare(ghost.age, age) == 0 &&
                isSing == ghost.isSing &&
                Objects.equals(name, ghost.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isSing);
    }

    public String say() {
        return "Boo!";
    }

}

class GhostShip extends Ghost {

    @Override
    public String say() {

        return "Booooooooooooo!";
    }

    public GhostShip(double age, boolean isSing, String name) {
        super(age, isSing, name);

    }
}
