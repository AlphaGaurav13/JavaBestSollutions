package OOPS;


class Student {
    enum Program {
        Bachelors,
        Masters,
        PhD
    }
    
    private String name;
    private int age;
    private Program program;

    Student(String name, int age, Program program) {
        this.name = name;
        this.age = age;
        this.program = program;
    }

    public void displayStudent() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Program : " + program);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Program getProgram() {
        return program;
    }
}

public class pt2 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Gaurav", 20, Program.Bachelors),
            new Student("Ritika", 22, Program.Masters),
            new Student("Tushar", 25, Program.PhD),
            new Student("Rohan", 21, Program.Bachelors),
            new Student("Mayank", 24, Program.Masters)
        };

        StringBuilder sb = new StringBuilder();
        sb.append("Student Report:\n");
        
        for (Student student : students) {
            sb.append("Name : ").append(student.getName()).append("\n");
            sb.append("Age : ").append(student.getAge()).append("\n");
            sb.append("Program : ").append(student.getProgram()).append("\n\n");
        }

        System.out.println(sb.toString());

        for (Student student : students) {
            student.displayStudent();
            System.out.println();
        }
    }
}