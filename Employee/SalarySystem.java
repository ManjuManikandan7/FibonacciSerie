class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    void totalSalary() {
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + (salary + bonus));
    }
}

public class SalarySystem {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Manju", 30000, 5000);
        m.display();
        m.totalSalary();
    }
}