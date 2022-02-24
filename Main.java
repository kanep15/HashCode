import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void main() {
        String fileName = "b_better_start_small.in.txt";
        File data = new File(fileName);
        filter(data);
    }



    private void filter(File file) {
        ArrayList conditions = new ArrayList();

        try {
            Scanner scanner = new Scanner(file);
            String firstLine = scanner.nextLine();
            String[] splitFirstLine = firstLine.split(" ");

            int people;
            int projects;

            try {
                people = Integer.parseInt(splitFirstLine[0]);
                projects = Integer.parseInt(splitFirstLine[1]);
            } catch (NumberFormatException e) {
                System.out.println("Int conversion");
                e.printStackTrace();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(" ");
            }


        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
    }
}
