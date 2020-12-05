import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        ArrayList<String> data = getInput();
        
        /* PART 1 */
        int counter = 0;
        for(int i=0; i<data.size() ;i++){
            String[] parts = data.get(i).split(" ");
            String[] minmax = parts[0].split("-");
            int min = Integer.parseInt(minmax[0]);
            int max = Integer.parseInt(minmax[1]);
            char letter = parts[1].charAt(0);

            int letterCount = 0;
            for(int j=0; j<parts[2].length() ;j++) {
                if( letter==parts[2].charAt(j) ){
                    letterCount++;
                }
            }
            if( letterCount>=min && letterCount<=max ) {
                counter++;
            } 
        }
        System.out.println("Part 1: " + counter);


        /* PART 2 */
        counter = 0;
        for(int i=0; i<data.size() ;i++){
            String[] parts = data.get(i).split(" ");
            String[] ab = parts[0].split("-");
            int a = Integer.parseInt(ab[0])-1;
            int b = Integer.parseInt(ab[1])-1;
            char letter = parts[1].charAt(0);

            if( parts[2].charAt(a)==letter ^ parts[2].charAt(b)==letter ) {
                counter++;
            } 
        }
        System.out.println("Part 2: " + counter);
        
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