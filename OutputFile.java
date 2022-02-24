import java.io.FileWriter;
import java.io.IOException;

public class OutputFile {

    public OutputFile(String[] projects, String[][] teams) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(projects.length+"\n");
            for(int i = 0; i < projects.length;i ++){
                myWriter.write(projects[i]+"\n");
                for(int y = 0; y < teams[i].length; y++){
                    myWriter.write(teams[i][y]+" ");

                }
                myWriter.write("\n");
            }
            System.out.println("done");
            myWriter.close();





        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();


        }
    }}
