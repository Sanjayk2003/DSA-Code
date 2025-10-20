import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
 long accNo;;
 String name;
 double balance;
 String branch;

 
 public Customer(long accNo, String name, double balance, String branch) {
    this.accNo = accNo;
    this.name = name;
    this.balance = balance;
    this.branch = branch;
}

 public long getAccNo() {
    return accNo;
 }
 public void setAccNo(long accNo) {
    this.accNo = accNo;
 }
 public String getName() {
    return name;
 }
 public void setName(String name) {
    this.name = name;
 }
 public double getBalance() {
    return balance;
 }
 public void setBalance(double balance) {
    this.balance = balance;
 }
 public String getBranch() {
    return branch;
 }
 public void setBranch(String branch) {
    this.branch = branch;
 }
 

 
 
 
}
public class Bank {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Customer one=new Customer(1,"Saran" , 10000.00, "Coimbatore");
        Customer two=new Customer(2,"Sandy" , 20000.00, "Chennai");
        Customer three=new Customer(3,"Santhosh" , 30000.00, "Coimbatore");

        try(ObjectOutputStream o1=new ObjectOutputStream(new FileOutputStream("in.txt"))){
            o1.writeObject(one);
            o1.writeObject(two);
            o1.writeObject(three);

        }catch(Exception e){
         e.getStackTrace();
        }

        try(ObjectInputStream o2=new ObjectInputStream(new FileInputStream("in.txt"))){
         Customer c1=(Customer)o2.readObject();
         Customer c2=(Customer)o2.readObject();
         Customer c3=(Customer)o2.readObject();

         System.out.println("Account Number : "+ c1.getAccNo()+
                           "\nName : "+c1.getName()+
                            "\nBalance : "+ c1.getBalance()+
                             "\nBranch: "+ c1.getBranch());
         System.out.println("Account Number : "+ c2.getAccNo()+
                           "\nName : "+c2.getName()+
                            "\nBalance : "+ c2.getBalance()+
                             "\nBranch: "+ c2.getBranch());
         System.out.println("Account Number : "+ c3.getAccNo()+
                           "\nName : "+c3.getName()+
                            "\nBalance : "+ c3.getBalance()+
                             "\nBranch: "+ c3.getBranch());

        }
       
        
    }
}
