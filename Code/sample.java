import java.util.Optional;

class sample{
    
    public static void main(String[] args) {
        String k=null;
        Optional<String> s;
        if(k==null){
         s=Optional.empty();
        }
        else{
            s=Optional.of(k);
        }
        s=s.map((a) -> a.toUpperCase()).or(() -> Optional.of("Nothing"));
        System.out.println(s.get());
        System.out.println(Thread.currentThread().getName());
    }
}