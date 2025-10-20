import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    
    public static void main(String[] args) {
      LinkedList<Employee> l=new LinkedList<>();
      l.add(new Employee(1,"Sanjay",20000));
      l.add(new Employee(2,"Sarn",10000));
      l.add(new Employee(2,"Sarn",10000));
      l.add(new Employee(2,"Sarn",10000));
      l.add(new Employee(3,"Santhosh",30000));
      l.add(new Employee(3,"Santhosh",30000));

      List<Integer> l2 = l.stream().map((emp) -> emp.getId()).filter(id -> id%2==0).toList();
      List<Employee> l3 = l.stream().filter(id -> id.getId()%2==0).toList();
      Map<Double,List<Employee>> k=l.stream().collect(Collectors.groupingBy(Employee::getSalary));
      System.out.println(l2);
      System.out.println(l3);
      System.out.println(k);
      l.stream().map(a -> a.getName()).forEach(System.out::println);
    }
}
class Employee{

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    
}
