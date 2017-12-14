////package grades;
////import java.util.ArrayList;
////import java.util.List;
////import java.util.Scanner;
////
//package grades;
//
//import util.Input;
//import java.util.HashMap;
//
//public class GradesApplication {
//    public static void main(String[] args) {
//        Input input = new Input();
//        HashMap<String, Student> students = new HashMap<>();
//        String userInput;
//
//        System.out.println("Welcome to the grades application!");
//        students = addSimpsons();
//
//        for(String key : students.keySet()) {
//            System.out.print(key + "  |  ");
//        }
//
//        System.out.println();
//        System.out.println("-------");
//
//        do {
//
//            System.out.println("Which username do you want grades for?");
//            userInput = input.getString();
//
//            if(students.containsKey(userInput)) {
//                Student student = students.get(userInput);
//                System.out.println(student.getName() + " has a grade average of " + student.getGradeAverage());
//            } else {
//                System.out.println("No record for that student username exists...");
//            }
//
//        } while (input.yesNo("Do you want to continue? y/n"));
//
//    }
//
//    public static HashMap<String, Student> addSimpsons() {
//        HashMap<String, Student> students = new HashMap<>();
//
//        Student student1 = new Student("Maggie");
//        student1.addGrade(100);
//        student1.addGrade(95);
//        student1.addGrade(80);
//        student1.addGrade(99);
//        student1.addGrade(95);
//        student1.addGrade(80);
//        student1.addGrade(99);
//
//        Student student2 = new Student("Bart");
//        student2.addGrade(11);
//        student2.addGrade(40);
//        student2.addGrade(100);
//        student2.addGrade(12);
//
//        Student student3 = new Student("Lisa");
//        student3.addGrade(100);
//        student3.addGrade(100);
//        student3.addGrade(100);
//        student3.addGrade(99);
//
//        // puttin' key->value pairs onto a HashMap
//        students.put("maggierox", student1);
//        students.put("el-barto", student2);
//        students.put("blues-saxophone-coder", student3);
//
//        return students;
//    }
//}



























//package grades;
//
//import java.util.Scanner;
//
//public class GradesApplication {
//            public static void main(String[] args) {
//
//                int marks[] = new int[6];
//                int i;
//                float total=0, avg;
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.println("Welcome!\n");
//                System.out.println("Enter Your Grades for Each Class to Get Your Average Grade.");
//                for(i=0; i<6; i++) {
//                    System.out.print("Enter Grade for Subject"+(i+1)+": ");
//                    marks[i] = scanner.nextInt();
//                    total = total + marks[i];
//
//                }
//
//                scanner.close();
//                avg = total/6;
//                System.out.printf("Your Average Grade is: " + "%.2f" , avg);
//                System.out.println();
//                System.out.print("Which Means the Letter Grade You Received is: ");
//                if(avg>=95)
//                {
//                    System.out.print("A+");
//                }
//                else if(avg>=90 && avg<95)
//                {
//                    System.out.print("A");
//                }
//                else if(avg>=85 && avg<90)
//                {
//                    System.out.print("B+");
//                }
//                else if(avg>=80 && avg<85)
//                {
//                    System.out.print("B");
//                }
//                else if(avg>=75 && avg<80)
//                {
//                    System.out.print("C+");
//                }
//                else if(avg>=70 && avg<75)
//                {
//                    System.out.print("C");
//                }
//                else if(avg>=65 && avg<70)
//                {
//                    System.out.print("D+");
//                }
//                else if(avg>=60 && avg<65)
//                {
//                    System.out.print("D");
//                }
//                else
//                {
//                    System.out.print("F");
//                }
//                System.out.println("\nGoodbye, and Have a Wonderful Day!");
//            }
//
//}
















                //                Student student1 = new Student("Bob");
//                student1.addTestScore(new Student.Test("test1", 80, 0.25));
//                student1.addTestScore(new Student.Test("test2", 60, 0.25));
//                student1.addTestScore(new Student.Test("final", 90, 0.5));
//
//                student1.printStudentTestSummary();
//                student1.printStudentTestAverage();
//            }
//        }



