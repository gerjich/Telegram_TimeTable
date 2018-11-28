//package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Read {

    public Map<String, String> read () {
        Map<String, String> dict = new HashMap<String, String>();

        try (FileReader fr = new FileReader("dict.txt");
             Scanner scan = new Scanner(fr)) {
            int i = 1;
            while (scan.hasNextLine()) {
                dict.put(scan.nextLine(), scan.nextLine());
                i++;

            }
        }
        catch(Exception ex){
                ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return dict;
    }
}

