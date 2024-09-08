public class Employee {
  private final String fuulName;
  private int departament;
  private double salary;
  private static int nextId = 0;
  private int id;

  public Employee(String fuulName, int departament, double salary) {
    this.fuulName = fuulName;
    this.departament = departament;
    this.salary = salary;
    this.id = nextId++;
  }

  public String getFuulName() {
    return fuulName;
  }

  public int getDepartament() {
    return departament;
  }

  public double getSalary() {
    return salary;
  }

  public int getId() {
    return id;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setDepartament(int departament) {
    this.departament = departament;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee)) return false;
    Employee employee = (Employee) o;
    return getId() == employee.getId();
  }

  @Override
  public int hashCode() {
    return getId();
  }

  @Override
  public String toString() {
    return fuulName + " отдел: " + departament + ", зарплата: " + salary + ", ID " + getId();
  }

  public static double calculateSalary(Employee[] employees) {
    double result = 0;
    for (int i = 0; i < employees.length; i++) {
      Employee employee = employees[i];
      if (employee != null) {
        result = result + employee.getSalary();
      }
    }
    return result;
  }
  public static Employee minSalary(Employee[] employees){
    Employee minSalaryEmployee = null;
    for(int i = 0; i < employees.length; i ++){
      if(employees[i] != null && (minSalaryEmployee == null || minSalaryEmployee.getSalary() > employees[i].getSalary())) {
        minSalaryEmployee = employees[i];
      }
    }
    return minSalaryEmployee;
  }
  public static Employee maxSalary(Employee[] employees){
    Employee maxSalaryEmployee = null;
    for(int i = 0; i < employees.length; i ++){
      if(employees[i] != null && (maxSalaryEmployee == null || maxSalaryEmployee.getSalary() < employees[i].getSalary())){
        maxSalaryEmployee = employees[i];
      }
    }
    return maxSalaryEmployee;
  }
  public static double averageSalary(Employee[] employees){
    double result1 = 0;
    for (int i = 0; i < employees.length; i++) {
      Employee employee = employees[i];
      if (employee != null) {
        result1 = result1 + employee.getSalary();
      }
    }
    return result1 / employees.length;
  }
}




