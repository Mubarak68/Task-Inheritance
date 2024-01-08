package CompanyStructure;

public class Main {
    public static void main(String[] args) {

        String[] xx = new String[3];
        xx[0] = "Coding";
        xx[1] = "Time Managment";
        xx[2] = "Project Managment";

        Employee Mubarak = new Employee("Mubarak", "IT", 1200);
        Director Ahmed = new Director("Ahmed", "IT", 1203, 45000);
        Engineer Othman = new Engineer("Othman", "IT", 2300, xx);
        Intern Saleh = new Intern("Saleh", "Sales", 900, "AUM");
        Manager Yousef = new Manager("Yousef", "HR", 12000, 39);
        SalesPerson Feras = new SalesPerson("Feras", "Sales", 3900, 100);
        System.out.println(Mubarak);
        System.out.println(Ahmed);
        System.out.println(Othman);
        System.out.println(Saleh);
        System.out.println(Yousef);
        System.out.println(Feras);
    }

}
