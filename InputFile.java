import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputFile {
    public static ArrayList main() {

        String fileName = "b_better_start_small.in.txt";

        File data = new File(fileName);
        return filter(data);
    }
    private static ArrayList filter(File file) {
        ArrayList<Person> contributors = new ArrayList<Person>();

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] splitLine = line.split(" ");

            int contributorNum = 0;
            int projectNum = 0;
            //String contributorName ="hold";
            //int contributorskills = 0;
            //Person contributor;

            try{
                contributorNum = Integer.parseInt(splitLine[0]);
                projectNum = Integer.parseInt(splitLine[1]);

            }
            catch (NumberFormatException e) {
                System.out.println("Int conversion");
                e.printStackTrace();
            }

            for(int i=0; i < contributorNum;i++){
                line = scanner.nextLine();
                splitLine = line.split(" ");
                String contributorName = splitLine[0];
                int contributorskills = Integer.parseInt(splitLine[1]);
                line = scanner.nextLine();
                splitLine = line.split(" ");
                String skillName = splitLine[0];
                int skillLevel = Integer.parseInt(splitLine[1]);
                Map<String, Integer> skillLevels = new HashMap<>();
                Person contributor = new Person("test",skillLevels);
                for(int y = 0; y < contributorskills;y++){
                    contributor.setName(contributorName);
                    contributor.setSkillLevels(skillName,skillLevel);

                contributors.add(contributor);


                }

            }







        }catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }


    return contributors;
    }

}
