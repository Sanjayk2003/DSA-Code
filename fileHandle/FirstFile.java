package fileHandle;
import java.io.*;
public class FirstFile {

    public static void main(String[] args) {
        // try(InputStreamReader ir=new InputStreamReader(System.in)){

        //     int s=ir.read();
        //     int n=1;
        //     while(ir.ready()){
        //     System.out.println(s +""+ (char)s);
        //     s=ir.read();
        //     }
        //     ir.close();
        // }catch(Exception e){
        //  System.out.println(e);
        // }


        // try(FileReader fr=new FileReader("input.txt")){

            
        //     while(fr.ready()){
        //         int s=fr.read();
        //     System.out.println((char)s);
        //     }
        //     System.out.println();
        //     // fr.close();
        // }catch(Exception e){
        //  System.out.println(e);
        // }
    
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write('o');
            osw.write(10);
            osw.write("Hello world");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}