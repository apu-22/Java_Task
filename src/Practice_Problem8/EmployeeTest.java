package Practice_Problem8;
abstract class Employee{
    public String name;
    public int id;
    public String department;

    public Employee(String name,int id,String department){
        this.name=name;
        this.id=id;
        this.department=department;
    }
    public abstract double calculatePay();
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ id);
        System.out.println("Department: "+department);
        System.out.println("Pay: $"+calculatePay());
        System.out.println("_-_-_-_-_-_-_-_-_-_-_");
    }
}

class FullTimeEmployee extends Employee{
    public double fixedSalary;
    public FullTimeEmployee(String name,int id,String dept,double fixedSalary){
        super(name,id,dept);
        this.fixedSalary=fixedSalary;
    }
    @Override
    public double calculatePay(){
        return fixedSalary;
    }
}
class PartTimeEmployee extends Employee{
    public double hourlyRate;
    public int hourWorked;

    public PartTimeEmployee(String name, int id, String dept,double hourlyRate, int hourWorked){
        super(name,id,dept);
        this.hourlyRate=hourlyRate;
        this.hourWorked=hourWorked;
    }
    @Override
    public double calculatePay(){
        return (hourWorked*hourWorked);
    }
}

class ContractEmployee extends Employee{
    public String projectName;
    public double contractAmmount;

    public ContractEmployee(String name, int id, String dept,String projectName,double contractAmmount){
        super(name,id,dept);
        this.contractAmmount=contractAmmount;
        this.projectName=projectName;
    }
    @Override
    public double calculatePay(){
        return contractAmmount;
    }
}

public class EmployeeTest {
    public static void main(String[] args){
        Employee em1 = new FullTimeEmployee("Apu",2022831022,"SWE",10000);
        Employee em2 = new PartTimeEmployee("LB",2022123300,"IS",50.5,10);
        Employee em3 = new ContractEmployee("Rayhan",2022831000,"SWE","GAME_PROJECT",1000000.0);

        em1.displayInfo();
        em2.displayInfo();
        em3.displayInfo();
    }
}
