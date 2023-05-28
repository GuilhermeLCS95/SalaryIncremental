package entities;

public class employee {
    public int id;
    public String name;
    public double salary;

    public employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void salaryIncrease(double percent){
        salary = salary * percent / 100 + salary;
    }
    @Override
    public String toString(){
        return "Updated data: " + "\nName: " + name + "\nID: " + id + "\nSalary: " + salary;
    }

    public int getId() {
        return id;
    }
}
