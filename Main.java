
import java.util.HashMap;

public class Main extends Vehicle {
    int x = 10;
    public static void main(String[] args){
        Main m = new Main();
        m.x = 5;
        HashMap<Employee,String> hashMap = new HashMap<Employee,String>();
        hashMap.put(new Employee(123,"John"), "Java");
        hashMap.put(new Employee(124,"Mark"), "Angular");
        hashMap.put(null, null);

        for(Employee e:hashMap.keySet()){
            System.out.println(e.getName());
        }
        String[] s = apply("we","will","rock","you");
        System.out.println(s[0]);
        System.out.println(m.x);
        m.greeting("Hello");
    }

    public static String[] apply(String ...str){
        return str;
    }

    void greeting(String msg) {
        System.out.println(msg);
    }

}
