import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        ArrayList<String> data = getInput();
        
        /* PART 1 */
        System.out.println("PART 1: " + getTreeCount(data, 3, 1));


        /* PART 2 */
        int counter = 1;
        counter *= getTreeCount(data, 1, 1);
        counter *= getTreeCount(data, 3, 1);
        counter *= getTreeCount(data, 5, 1);
        counter *= getTreeCount(data, 7, 1);
        counter *= getTreeCount(data, 1, 2);
        System.out.println("PART 2: " + counter);
        
    }

    public static int getTreeCount(ArrayList<String> data,int dx,int dy) {
        int counter = 0;
        for(int i=0; i<data.size() ;i+=dy){
            int x = dx*(i/dy) % data.get(i).length();
            char c = data.get(i).charAt(x);
            if(c=='#'){
                counter++;
            }
        }
        return counter;
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