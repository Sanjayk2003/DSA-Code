package OOPS;

class Parent{
    int num;

    public Parent(int num) {
        this.num = num;
    }

    public Parent() {
    }
    
    
}
class Child1 extends Parent{
    int phno;
    String name;
    public Child1(int num, int phno, String name) {
        super(num);
        this.phno = phno;
        this.name = name;
    }
    

}
class Child2 extends Child1{
 int temp;

public Child2(int num, int phno, String name, int temp) {
    super(num, phno, name);
    this.temp = temp;

}

public Child2(int num, int phno, String name) {
    super(num, phno, name);
}

@Override
public String toString() {
    return "Child2 [num=" + num + ", phno=" + phno + ", name=" + name + ", temp=" + temp + "]";
}

@Override
public int  hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + temp;
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Child2 other = (Child2) obj;
    if (temp != other.temp)
        return false;
    return true;
}





 
}
public class Multilevel {
    public static void main(String[] args) {
        
        Parent c=new Child2(1,10,"jg");
        System.out.println(c.toString());

    }
    
}
