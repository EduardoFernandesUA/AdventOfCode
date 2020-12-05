import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        ArrayList<String> data = getInput();
        
        /* PART 1 */
        for(int i=0; i<data.size() ;i++){
            for(int j=i+1; j<data.size() ;j++){
                int a = Integer.parseInt(data.get(i));
                int b = Integer.parseInt(data.get(j));
                if( a+b==2020 ){
                    System.out.println("Part 1: " + a*b);
                }
            }
        }


        /* PART 2 */
        for(int i=0; i<data.size() ;i++){
            for(int j=i+1; j<data.size() ;j++){
                for(int k=j+1; k<data.size() ;k++){
                    int a = Integer.parseInt(data.get(i));
                    int b = Integer.parseInt(data.get(j));
                    int c = Integer.parseInt(data.get(k));
                    if( a+b+c==2020 ){
                        System.out.println("Part 2: " + a*b*c);
                    }
                }
            }
        }
        
    }

    public static ArrayList<String> getInput() {
        ArrayList<String> input = new ArrayList<String>();
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                input.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return input;
    }
}