package com.university.app;


import com.university.model.*;
import com.university.service.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        FullTimeTeacher teacher1 = new FullTimeTeacher("Ana Torres", 2000000, 5);
        FullTimeTeacher teacher2 = new FullTimeTeacher("Carlos Mejia", 2200000, 8);
        PartTimeTeacher teacher3 = new PartTimeTeacher("Laura Diaz", 1000000, 12);
        PartTimeTeacher teacher4 = new PartTimeTeacher("Pedro Ruiz", 1900000, 10);
        Student student1 = new Student(20, "Maria Lopez", 1021665825);
        Student student2 = new Student(21, "Juan Perez", 79452093);
        Student student3 = new Student(19, "Sofia Gomez", 23779845);
        Student student4 = new Student(22, "Diego Ramirez", 1010041678);
        Student student5 = new Student(20, "Valentina Cruz", 1022387654);
        Student student6 = new Student(23, "Andres Castro",1023456782 );
        UniversityClass class1 = new UniversityClass("Java Basics", "Room 101", teacher1);
        UniversityClass class2 = new UniversityClass("Databases", "Room 102", teacher2);
        UniversityClass class3 = new UniversityClass("Web Development", "Room 103", teacher3);
        UniversityClass c4 = new UniversityClass("Algorithms", "Room 104", teacher4);

        Scanner sc = new Scanner(System.in);
        int opcion=0;

        while (opcion!=6) {
            System.out.println("Bienvenidos al sistema de gestion academica Universitaria");
            System.out.println("---------------------------------------------");
            System.out.println("Seleccione la opcion que desee: ");
            System.out.println("1.Imprimir todos los profesores con sus datos.");
            System.out.println("2. Imprimir todas las clases y ver detalle de una clase");
            System.out.println("3. Crear un nuevo estudiante y agregarlo a una clase existente");
            System.out.println("4.  Crear una nueva clase y agregar\n" +
                    "un profesor existente, estudiantes existentes y sus datos relevantes");
            System.out.println("5.Listar clases de un estudiante por ID");
            System.out.println("6.Salir");
            opcion = sc.nextInt();
            ;

            switch (opcion) {
                case 1:

                case 2:
                    int opcionSubmenu = 0;
                    while (opcionSubmenu != 3) {
                        System.out.println("Bienvenido al submenu");
                        System.out.println("1. Listar todas las clases");
                        System.out.println("2. Seleccionar una clase y ver sus datos");
                        System.out.println("3. Volver al menu principal");
                        System.out.println("Seleccione una opcion: ");
                        opcionSubmenu = sc.nextInt();
                        switch (opcionSubmenu) {
                            case 1:

                            case 2:

                            case 3:
                                System.out.println("Regresando al menú principal...");
                                break;

                            default:
                                System.out.println("Seleccionaste una opcion incorrecta.");
                        }

                    }


            }

        }
    }
    }
