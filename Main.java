import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {


    public static void main(String[] args){

        ArrayList<Person> contributors = InputContributors.main();
        ArrayList<Project> projects = InputProjects.main();

        for(int i = 0; i< projects.size(); i++){

            Project bucket = projects.get(i);


            for (int j = 0; j < contributors.size(); j++) {
                for (int k = 0; k < bucket.getProjectSkill().size(); k++) {
                    if(contributors.get(j).getSkill().contains(bucket.getSkilllevel(k))){

                }

            }








        }
    }
}
