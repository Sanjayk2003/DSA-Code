package net.example;

import org.junit.Test;

import net.CustomException;

import static org.junit.Assert.*;


public class Operation1Test {

    @Test
    public void countOfEmployee() {
        Operation1 op=new Operation1();
        op.l.add(new Employee(1,"Sanjay",20000));
        op.l.add(new Employee(2,"Sarn",10000));
        op.l.add(new Employee(2,"Sarn",10000));
        op.l.add(new Employee(2,"Sarn",10000));
        op.l.add(new Employee(3,"Santhosh",30000));
        op.l.add(new Employee(3,"Santhosh",30000));


        assertThrows(CustomException.class,()-> op.countOfEmployee());
    }
}