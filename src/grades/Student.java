//package grades;
//
//public class Student {




package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    // declaring
    private ArrayList<Integer> grades;

    // constructor that takes in a name argument and uses it to set the name
    public Student(String name) {
        this.name = name;

        // initializing
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfAllGrades = 0;
        double average;

        for(int grade : grades) {
            sumOfAllGrades += grade;
        }

        average = sumOfAllGrades / numberOfGrades;
        return average;
    }

    // Write just enough code in the main method to test the class's methods before using this class elsewhere...
    public static void main(String[] args) {
        System.out.println("Testing the Student class");
        Student student = new Student("Maggie");

        System.out.println("make sure we start with an empty arraylist of grades");
        System.out.println("The number of elements in the grades array is " + student.grades.size());

        System.out.println("Now we'll add 3 grades, a 90, a 95, and an 82");
        student.addGrade(90);
        student.addGrade(95);
        student.addGrade(82);

        double expectedGrade = (90 + 95 + 82) / 3;
        System.out.println("The expected average is " + expectedGrade);
        System.out.println("The average produced by .getAverageGrade is " + student.getGradeAverage());
        System.out.println("Yay! Now we know that .addGrade and .getAverageGrade work!");
        System.out.println("We can use this class in the rest of our application :)");
    }
}






















    //    private String studentName;
//    private String studentNo;
//    private String email;
//    private int year;
//
//    public Student() {
//        /**studentName = null;
//         *studentNo = null;
//         *email = null;
//         *year = -1;
//         */
//    }
//
//    public Student(String nName, String nNum, String nEmail, int nYr) {
//        this.studentName = nName;
//        this.studentNo = nNum;
//        this.email = nEmail;
//        this.year = nYr;
//    }
//
//    public void setStudentName(String newStudentName) {
//        studentName = newStudentName;
//    }
//
//    public void setStudentNo(String newStudentNo) {
//        studentNo = newStudentNo;
//    }
//
//    public void setEmail(String newEmail) {
//        email = newEmail;
//    }
//
//    public void setYear(int newYear) {
//        year = newYear;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public String getStudentNo() {
//        return studentNo;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//
//}



























//package grades;
//
//import java.util.ArrayList;
//
//public class Student{
//
//    private String name;
//    private ArrayList<Test> tests = new ArrayList<>();
//
//    public Student(String name) {
//        this.name = name;
//    }
//
//    public void addTestScore(Test test) {
//        tests.add(test);
//    }
//
//    public void printStudentTestAverage() {
//        float average = 0;
//        for (Test test: tests) {
//            average += test.getWeightedScore();
//        }
//        System.out.println("Test average for student: " + average);
//    }
//
//    public void printStudentTestSummary() {
//        System.out.println("Test scores for student: " + name);
//        for (Test test: tests) {
//            System.out.println(test.toString());
//        }
//    }
//    public static class Test {
//
//        private String name;
//        private int score;
//        private double weight;
//
//        public Test(String name, int score, double weight) {
//            this.name = name;
//            this.score = score < 0 ? 0 : score; // basic check for valid score
//            this.weight = weight < 0 ? 0 : weight; // basic check for valid weight
//        }
//
//        public double getWeightedScore() {
//            return score * weight;
//        }
//
//        public String toString() {
//            return "Test: " + name + ". Score: " + score + " (w " + weight * 100 + "%).";
//        }
//    }
//}
