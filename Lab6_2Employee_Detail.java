import java.util.Scanner;
class Lab6_2Employee_Detail {
    private int employeeId;
    private String name;
    private String designation;
    private double salary;
        public Lab6_2Employee_Detail(int employeeId, String name, String designation, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Designation: ");
        String empDesignation = scanner.nextLine();

        System.out.print("Enter Salary: $");
        double empSalary = scanner.nextDouble();
        Employee_Detail employee = new Employee_Detail(empId, empName, empDesignation, empSalary);
        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        scanner.close();
    }
}


