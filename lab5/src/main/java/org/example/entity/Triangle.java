package org.example.entity;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {return sideA;}
    public void setSideA(double sideA) {this.sideA = sideA;}

    public double getSideB() {return sideB;}
    public void setSideB(double sideB) {this.sideB = sideB;}

    public double getSideC() {return sideC;}
    public void setSideC(double sideC) {this.sideC = sideC;}

    public boolean isValid() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return false;
        }

        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA);
    }

    public void perimeter() {
        if (isValid()) {
            double result = sideA + sideB + sideC;
            System.out.println("Периметр равен: " + result);
        }
        else {
            System.out.println("Ошибка, такого треугольника не существует");
        }
    }
}
