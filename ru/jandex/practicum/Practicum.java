package ru.jandex.practicum;

public class Practicum {

    public static void main(String[] args) {
        GhostShip gS = new GhostShip(0, true, "Kasper");
        System.out.println(gS.say());
        GhostShip anotherGhostShip = new GhostShip(100, false, "Will");
        anotherGhostShip.setName("Willyyyyyyyyyyy");
        System.out.println(anotherGhostShip.say());
//        equals(anotherGhostShip);

    }
}
