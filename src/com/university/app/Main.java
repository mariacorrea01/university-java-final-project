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
        Student student6 = new Student(23, "Andres Castro", 1023456782);
        UniversityClass class1 = new UniversityClass("Java Basics", "Room 101", teacher1);
        UniversityClass class2 = new UniversityClass("Databases", "Room 102", teacher2);
        UniversityClass class3 = new UniversityClass("Web Development", "Room 103", teacher3);
        UniversityClass class4 = new UniversityClass("Algorithms", "Room 104", teacher4);
        university.addStudents(student1);
        university.addStudents(student2);
        university.addStudents(student3);
        university.addStudents(student4);
        university.addStudents(student5);
        university.addStudents(student6);
        university.addTeacher(teacher1);
        university.addTeacher(teacher2);
        university.addTeacher(teacher3);
        university.addTeacher(teacher4);
        university.addClasses(class1);
        university.addClasses(class2);
        university.addClasses(class3);
        university.addClasses(class4);
        class1.addStudent(student1);
        class1.addStudent(student2);
        class2.addStudent(student2);
        class2.addStudent(student3);
        class3.addStudent(student4);
        class3.addStudent(student1);
        class4.addStudent(student5);
        class4.addStudent(student6);


        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
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
                    System.out.println("Profesores : ");
                    for (Teacher t : university.getTeachers()) {
                        System.out.println("Nombre Profesor :" + t.getName());
                        System.out.println("Tipo de Profesor :" + t.type());
                        System.out.println("Salario: " + t.calculateSalary() + "\n");
                    }
                    break;
                case 2:
                    System.out.println("Clases disponibles");
                    for (int i = 0; i < university.getClasses().size(); i++) {
                        System.out.println((i + 1) + ". " + university.getClasses().get(i).getName());
                    }
                    int opcionSubmenu = 0;
                    while (opcionSubmenu != 2) {
                        System.out.println("SUB-MENU");
                        System.out.println("1.Selecciona una clase para ver sus detalles.");
                        System.out.println("2.Volver al menu anterior.");
                        System.out.println("Elige una opcion: ");
                        opcionSubmenu = sc.nextInt();
                        if (opcionSubmenu == 1) {
                            System.out.println("Dime el numero de la clase :");
                            int numero = sc.nextInt() - 1;
                            if (numero >= 0 && numero < university.getClasses().size()) {
                                UniversityClass clase = university.getClasses().get(numero);

                                System.out.println("\n-Nombre: " + clase.getName());
                                System.out.println("Salon: " + clase.getClassroom());
                                System.out.println("Profesor: " + clase.getTeacher().getName() + " (" + clase.getTeacher().type() + ")");
                                System.out.println("Estudiantes: :");
                                for (Student student : clase.getStudents()) {
                                    System.out.println(student.getName());
                                }
                            } else {
                                System.out.println("No existe una clase asociada.");
                            }
                        } else if (opcionSubmenu == 2) {
                            break;
                        } else {
                            System.out.println("Opcion invalida");
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Crea un nuevo Estudiante: ");
                    System.out.println("Ingrea el nombre: ");
                    String name = sc.nextLine();
                    System.out.println("Ingrea la edad :");
                    int age = sc.nextInt();
                    System.out.println("Ingrese el id: ");
                    int id = sc.nextInt();
                    Student estudiante = new Student(age, name, id);
                    university.addStudents(estudiante);
                    System.out.println("Ahora debes agregarlo a una clase existente: ");
                    for (int i = 0; i < university.getClasses().size(); i++) {
                        System.out.println((i + 1) + ". " + university.getClasses().get(i).getName());
                    }
                    System.out.println("Selecciona a cual clase quieres agregarlo : ");
                    int numero = sc.nextInt()-1;

                    if (numero >= 0 && numero < university.getClasses().size()) {
                        university.getClasses().get(numero).addStudent(estudiante);
                        System.out.println("Estudiante agregado a la clase.");
                    } else { System.out.println("Numero de clase invalido.");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre de la nueva clase: ");
                    String nameC = sc.nextLine();
                    System.out.println("Ingrese el salon asignado: ");
                    String classroom = sc.nextLine();
                    System.out.println("Profesores disponibles:");
                    System.out.println("Asigna un profesor: ");
                    for (int i = 0; i < university.getTeachers().size(); i++) {
                        System.out.println((i+1) + ". " + university.getTeachers().get(i).getName());
                    }
                    int numeroProfesor = sc.nextInt()-1;
                    if (numeroProfesor < 0 || numeroProfesor >= university.getTeachers().size()) {
                        System.out.println("Numero de profesor invalido. Clase no creada.");
                        break;
                    }
                    Teacher profesorElegido = university.getTeachers().get(numeroProfesor);
                    UniversityClass newClass = new UniversityClass(nameC,classroom, profesorElegido);
                    System.out.println("Estudiantes disponibles:");
                    int totalEstudiantes = university.getStudents().size();
                    for (int i = 0; i < totalEstudiantes; i++) {
                        System.out.println((i+1) + ". " + university.getStudents().get(i).getName());
                    }
                    System.out.println((totalEstudiantes + 1) + ". Salir / terminar de agregar estudiantes");
                    int numEstudiante = 0;

                    while (numEstudiante != totalEstudiantes + 1) {
                        System.out.println("Selecciona el numero del estudiante a agregar (o " + (totalEstudiantes + 1) + " para salir): ");
                        numEstudiante = sc.nextInt();
                        if (numEstudiante == totalEstudiantes + 1) {
                            break;
                        } if (numEstudiante >= 1 && numEstudiante <= totalEstudiantes) {
                            newClass.addStudent(university.getStudents().get(numEstudiante - 1));
                            System.out.println("Estudiante agregado.");
                        } else { System.out.println("Numero invalido.");
                        }
                    }
                    university.addClasses(newClass);
                    break;

                case 5:
                    System.out.println("Ingresa el ID del estudiante: ");
                    int idBuscado = sc.nextInt();
                    System.out.println("Clases donde aparece el estudiante con ID " + idBuscado + ":");
                    boolean encontrado = false;
                    for (UniversityClass c : university.getClasses()) {
                        for (Student s : c.getStudents()) {
                            if (s.getId() == idBuscado) {
                                System.out.println(c.getName());
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Este estudiante no esta inscrito en ninguna clase, o el ID no existe.");
                    }
                    break;


            }

        }
    }

}