package additional_task;

public class SportsComplex {
    int age;

    public int determineGroup(int age){
        if(7<=age && age<=13){
            System.out.println("Вы состоите в 1 группе");
            return 1;
        }
        else if(14<=age && age<=17){
            System.out.println("Вы состоите в 2 группе");
            return 2;
        }
        else if((18<=age && age<=65)){
            System.out.println("Вы состоите в 3 группе");
            return 3;
        }
        else{
            System.out.println("Вы не проходите не в одну из групп");
            return -1;
        }
    }


    public static void main(String[] args) {
        SportsComplex sport = new SportsComplex();
        System.out.println(sport.determineGroup(23));
    }
}
