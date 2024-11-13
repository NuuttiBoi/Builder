package org.example;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gamingBuilder);
        Computer gamingComputer = director.constructComputer();
        System.out.println("Gaming Computer Configuration:\n" + gamingComputer);

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director = new ComputerDirector(officeBuilder);
        Computer officeComputer = director.constructComputer();
        System.out.println("\nOffice Computer Configuration:\n" + officeComputer);
    }
}