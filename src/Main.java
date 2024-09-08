public class Main {
  private static Employee createEmployee(String fuulName, int departament, double salary) {
    Employee employee = new Employee(fuulName, departament, salary);
    return employee;
  }

  public static void main(String[] args) {
    Employee[] employees = new Employee[10];
    employees[0] = createEmployee("Авилов Иван Андреевич", 1, 10500);
    employees[1] = createEmployee("Баранова Ольга Петровна", 2, 15500);
    employees[2] = createEmployee("Баринов Олег Иванович", 3, 18900);
    employees[3] = createEmployee("Васильев Михаил Сергеевич", 4, 21500);
    employees[4] = createEmployee("Виноградов Вадим Викторович", 5, 9500);
    employees[5] = createEmployee("Гаврилова Елена Ивановна", 1, 14500);
    employees[6] = createEmployee("Доброва Ольга Васильевна", 2, 10500);
    employees[7] = createEmployee("Зайцев Сергей Викторович", 3, 11500);
    employees[8] = createEmployee("Зверева Ирина Викторовна", 4, 13500);
    employees[9] = createEmployee("Фролов Федор Семенович", 5, 23500);
    for (int i = 0; i < employees.length; i++) {
      System.out.println(employees[i]);
    }
    System.out.println("Сумма затрат за месяц составила: " + Employee.calculateSalary(employees));
    System.out.println("Сотрудником с минимальной зарплатой является: " + Employee.minSalary(employees));
    System.out.println("Сотрудником с максимальной зарплатой является: " + Employee.maxSalary(employees));
    System.out.println("Средняя зарплата составляет: " + Employee.averageSalary(employees));
    System.out.println("Список сотрудников:");
    System.out.println("Авилов Иван Андреевич.");
    System.out.println("Баранова Ольга Петровна.");
    System.out.println("Баринов Олег Иванович.");
    System.out.println("Васильев Михаил Сергеевич.");
    System.out.println("Виноградов Вадим Викторович.");
    System.out.println("Гаврилова Елена Ивановна.");
    System.out.println("Доброва Ольга Васильевна.");
    System.out.println("Зайцев Сергей Викторович.");
    System.out.println("Зверева Ирина Викторовна.");
    System.out.println("Фролов Федор Семенович.");
  }
}

