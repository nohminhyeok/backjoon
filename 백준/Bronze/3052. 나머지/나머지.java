import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int B = 42;
        for(int i=0; i<10; i++){
            int A = sc.nextInt();
            set.add(A % B);
        }
        System.out.println(set.size());
    }
}