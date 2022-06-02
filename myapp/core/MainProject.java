package myapp.core;

import java.io.*;

public class MainProject {


    public static void main(String[] args){


        String file ="C:\\Users\\nigel\\Desktop\\exams.csv";

        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {

                //String[] row = line.replaceAll(",", "");

                String[] row = line.split(",");


                for(String index : row){
                    System.out.printf("%s", index);
                }
                System.out.println();

            }

        }
        catch(Exception e) {
            e.printStackTrace();

        }
        finally{

                try{
                reader.close();
                }
                catch(Exception e) {
                    e.printStackTrace();

        }
    }
    
}
}
