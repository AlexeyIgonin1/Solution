import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(scanner.hasNext()){
            if(i%2 != 0){
                list.add(scanner.nextInt());
                i++;
            }
            else{
                scanner.next();
                i++;
            }
        }
       System.out.println(list);
        for(int a =list.size() -1;a >= 0; a--){
            list.get(a);
            System.out.print(list.get(a) + " ");
        }
    }
}
