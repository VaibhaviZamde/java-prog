import java.util.*;

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Student extends Person {
    int studentId;

    public Student(String name, int id, int studentId) {
        super(name, id);
        this.studentId = studentId;
    }
}

class Staff extends Person {
    String[] designation;  // Changed to an array to store multiple designations

    public Staff(String name, int id, int numberOfDesignations) {
        super(name, id);
        this.designation = new String[numberOfDesignations];
    }

    // Method to set designation at a specific index
    public void setDesignation(int index, String value) {
        if (index >= 0 && index < designation.length) {
            designation[index] = value;
        }
    }

    // Method to get designation at a specific index
    public String getDesignation(int index) {
        if (index >= 0 && index < designation.length) {
            return designation[index];
        }
        return null;
    }
}

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    Book[] books;
    int bookCount;

    public Library(int maxBooks) {
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].title + ", Author: " + books[i].author);
        }
    }
}

class LibraryManage {
    public static void main(String[] args) {
        // Creating a library with a capacity for 5 books
        Library library = new Library(5);

        // Adding books to the library
        library.addBook(new Book("1.The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("2.To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("3.Wings of fire", "Dr. A. P. J. Kalam"));

        // Creating a staff member
        Staff staffMember = new Staff("John Doe", 101, 2);  // Specify the number of designations

        // Setting designations
        staffMember.setDesignation(0, "Librarian");
        staffMember.setDesignation(1, "Incharge");

        // Displaying staff member details
        System.out.println("Staff Members Details:");
        System.out.println("Name: " + staffMember.name);
        System.out.println("ID: " + staffMember.id);

        for (int i = 0; i < 2; i++) {
            System.out.println("Designation " + (i + 1) + ": " + staffMember.getDesignation(i));
        }

        // Simulating user interaction with a basic menu
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check available books");
            System.out.println("2. Issue a book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display available books
                    System.out.println("Available Books in the Library:");
                    library.displayBooks();
                    break;

                case 2:
                    // Issue a book to the student
                    System.out.print("Enter the index of the book to issue: ");
                    int bookIndex = scanner.nextInt();

                    if (bookIndex >= 0 && bookIndex < library.bookCount) {
                        Book issuedBook = library.books[bookIndex];
                        System.out.println("Book issued: " + issuedBook.title);
                    } else {
                        System.out.println("Invalid book index. Please try again.");
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

