package org.example.repository;

public interface Growable {

    void grow();
    double getHeight();

    static void printGrowthInfo() {
        System.out.println("Процесс роста активирован.");
    }
}
