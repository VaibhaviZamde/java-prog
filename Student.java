import java.util.Scanner;

// Parent class representing a student
class Student 
{
	String name;
    	int rollNumber;

    // Constructor to initialize student details
	    public Student(String name, int rollNumber) 
	    {
			this.name = name;
			this.rollNumber = rollNumber;
	    }

	    // Display method to show student details
	    public void displayDetails() 
	    {
		System.out.println("Student Details:");
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	    }
	}

	// Child class inheriting from Student class, representing marks in three subjects
class StudentWithMarks extends Student 
{
	    private int subject1Marks;
	    private int subject2Marks;
	    private int subject3Marks;

	    // Constructor to initialize student details and marks
	    public StudentWithMarks(String name, int rollNumber, int subject1Marks, int subject2Marks, int subject3Marks) {
		super(name, rollNumber);
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		this.subject3Marks = subject3Marks;
	    }

	    // Display method to show student details and marks
	    public void displayDetailsWithMarks() {
		super.displayDetails();
		System.out.println("Subject 1 Marks: " + subject1Marks);
		System.out.println("Subject 2 Marks: " + subject2Marks);
		System.out.println("Subject 3 Marks: " + subject3Marks);
	    }

	    // Calculate and display average marks
	    public void displayAverageMarks() {
		double averageMarks = (subject1Marks + subject2Marks + subject3Marks) / 3.0;
		System.out.println("Average Marks: " + averageMarks);
	    }
	}
class StudentMarksExample 
{
	    public static void main(String[] args) 
	    {
		Scanner scanner = new Scanner(System.in);

		// Get input from the user
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();

		System.out.print("Enter roll number: ");
		int rollNumber = scanner.nextInt();

		System.out.print("Enter marks for Subject 1: ");
		int subject1Marks = scanner.nextInt();

		System.out.print("Enter marks for Subject 2: ");
		int subject2Marks = scanner.nextInt();

		System.out.print("Enter marks for Subject 3: ");
		int subject3Marks = scanner.nextInt();

		// Create an object of the child class
		StudentWithMarks student = new StudentWithMarks(name, rollNumber, subject1Marks, subject2Marks, subject3Marks);

		// Display student details and marks
		student.displayDetailsWithMarks();

		// Display average marks
		student.displayAverageMarks();

		// Close the scanner
		scanner.close();
	    }
	}

