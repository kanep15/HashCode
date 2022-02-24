import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        //System.out.println("Hello World");

        ArrayList<Person> data = InputContributors.main();

        for(int i = 0; i< data.size(); i++){
            System.out.println(data.get(i).getName()+" "+data.get(i).getSkill());



        }
    }

}
