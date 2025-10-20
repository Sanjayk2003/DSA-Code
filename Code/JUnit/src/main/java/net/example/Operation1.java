package net.example;

import java.util.LinkedList;
import java.util.List;

import net.CustomException;

public class Operation1 {
    List<Employee> l= new LinkedList<>();

    public double countOfEmployee(){
        double count=l.stream().map(Employee::getSalary).filter(emp -> emp==10000).count();
        if(count ==3)
                throw new CustomException("You cannot do anything");
        return count;
    }
}
