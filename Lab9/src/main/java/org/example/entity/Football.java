package org.example.entity;

public class Football extends SportGame {

    private int goals;

    public Football(String name, int players, int duration, int goals) {
        super(name, players, duration);
        this.goals = goals;
    }

    @Override
    public String getRules() {
        return "2 тайма по 45 минут";
    }

    @Override
    public String getScore() {
        return "Гол = 1 очко";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Правила футбола: " + getRules() + " | Способ подсчета: " + getScore() + " | Забито голов: " + goals);

    }
}
