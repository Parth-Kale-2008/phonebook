import java.util.Hashtable;
import java.util.Scanner;

class Phonebook2{
    public static void main(String[] args) {
        Hashtable<String,Long>ht = new Hashtable<String,Long>();

        ht.put("Rehman Dakait",1244452704L);
        ht.put("Uzair Baloch",24452671423L);
        ht.put("Hamza Mazari",7858418949L);
        ht.put("Aslam Chaudhary",7952855945L);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ");
        String name = sc.nextLine();
    
        if(ht.containsKey(name)){
            System.out.println("found "+ht.get(name));
        }else{
            System.out.print("not found");
        }

    }
}