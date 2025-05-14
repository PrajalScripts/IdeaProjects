package OOPs;

    // Parent Class
    class Employee {
        int id;
        int salary;

        Employee(int i, int s) {
            id = i;
            salary = s;
        }
    }

    // Child Class
    class SalesEmp extends Employee {
        int salesIncentive;

        SalesEmp(int i, int s, int si) {
            super(i, s);
            salesIncentive = si;
        }
    }


    public class Inheritance {
        public static void main(String[] args) {
            SalesEmp se = new SalesEmp(101, 30000, 10000);

            System.out.println("Salary: " + se.salary);
            System.out.println("ID: " + se.id);
            System.out.println("Sales Incentive: " + se.salesIncentive);
        }

}
