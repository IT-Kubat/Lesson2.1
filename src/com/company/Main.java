package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myNumber = 3;

                switch (myNumber) {
                    case 1:
                        System.out.println("Число равно одному");
                        break;
                    case 2:
                        System.out.println("Число равно двум");
                        break;
                    case 3:
                        System.out.println("Число равно трем");
                        break;
                    default:
                        System.out.println("Оба");
                        System.out.println("Неизвестное число");


                }
        String name = "Ulan";
        switch (name) {
            case "Talant":
                System.out.println("Привет Талант");
                break;
            case "Ulan":
                System.out.println("Привет Улан");
                break;
            default:
                System.out.println("Оба");
                System.out.println("Привет незнакомец");
        }
    }
}
