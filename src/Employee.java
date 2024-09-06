public class Employee {
  private final String fuulName;
  private int departament;
  private double salary;
  private static int nextId = 0;
  private int id;

  public Employee (String fuulName, int departament, double salary){
    this.fuulName = fuulName;
    this.departament = departament;
    this.salary = salary;
    this.id = nextId++;
  }
  public String getFuulName(){
    return this.fuulName;
  }
  public int getDepartament(){
    return this.departament;
  }
  public double getSalary(){
    return this.salary;
  }
  public double setSalary(){
    return this.salary;
  }
@Override
  public String toString() {
  return fuulName + " отдел: " + departament + ", зарплата: " + salary;
}
}

