package additional_task;


public class Array {
    public static void printOddNumbers(int[] array){
       String s = "";
        for(int a = 0; a < array.length; a++){
            if (array[a]%2==0) {
                continue;
            }
            else{

                System.out.print(s);
                System.out.print(array[a]);
                s = ":";

            }
        }
    }
    public static void main(String[] args) {
        int[] array = {4,2,7,16,18,35,24,98,45};
        printOddNumbers(array);


    }
}
