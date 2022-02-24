import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        //System.out.println("Hello World");

        ArrayList<Person> contributors = InputContributors.main();
        ArrayList<Project> projects = InputProjects.main();

        for(int i = 0; i< contributors.size(); i++){
            System.out.println(contributors.get(i).getName()+" "+contributors.get(i).getSkill());
            System.out.println(projects.get(i).getName()+" "+projects.get(i).getProjectSkill());



        }
    }

}
