import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputProjects {
    public static ArrayList main() {

        String fileName = "b_better_start_small.in.txt";
        //String fileName = "c_collaboration.in.txt";

        File data = new File(fileName);
        return filter(data);
    }
    private static ArrayList filter(File file) {
        ArrayList<Project> projects = new ArrayList<Project>();

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] splitLine = line.split(" ");

            int projectNum = 0;
            int contributorNum = 0;

            try{
                projectNum = Integer.parseInt(splitLine[1]);
                contributorNum = Integer.parseInt(splitLine[0]);

            }
            catch (NumberFormatException e) {
                System.out.println("Int conversion");
                e.printStackTrace();
            }

            for (int i=0; i< contributorNum; i++) {
                scanner.nextLine();
            }

            for(int i=0; i < projectNum;i++){

                Map<String, Integer> skillLevels = new HashMap<String, Integer>();
                Project project = new Project("test",skillLevels);

                line = scanner.nextLine();
                splitLine = line.split(" ");

                String projectName = splitLine[0];
                int projectSkills = Integer.parseInt(splitLine[4]);



                for(int y = 0; y < projectSkills;y++){
                    line = scanner.nextLine();
                    splitLine = line.split(" ");

                    String skillName = splitLine[0];
                    int skillLevel = Integer.parseInt(splitLine[1]);

                    skillLevels.put(skillName, skillLevel);

                    project.setName(projectName);
                    project.setProjectSkills(skillLevels);
                    projects.add(project);
                }
            }

        }catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }


        return projects;
    }

}