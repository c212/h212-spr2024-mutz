import java.io.*;
import java.util.*;

public class Lab08 {
    public static void main(String[] args){
        String fileLocation = "votes.txt";
        int votes = 10;
        fileLocation = "src/" + fileLocation;

        try {
            Scanner in = new Scanner(new File(fileLocation));

            Map<String, Integer> counter = new HashMap<>(); //Votes -> CurrentCount

            while(in.hasNextLine()){
                String line = in.nextLine();

                String[] words = line.split(" ");
                for(String word : words){
                    if(word.equals("")) continue;

                    if(counter.containsKey(word)){
                        counter.replace(word, counter.get(word) + 1);
                    } else {
                        counter.put(word, 1);
                    }
                }
            }

            String[] keys = new String[counter.size()];
            counter.keySet().toArray(keys);
            Integer[] vote = new Integer[counter.size()];

            for(int i = 0; i < keys.length; i++){
                vote[i] = counter.get(keys[i]);
            }

            for(int i = 0; i < keys.length - 1; i++){
                for(int j = i + 1; j < keys.length; j++){
                    if(vote[i] < vote[j]){
                        swap(keys, vote, i, j);
                    }
                }
            }

            for(int i = 1; i <= votes; i++){
                System.out.println(i + ". " + keys[i-1] + " = " + vote[i-1]);
            }
        } catch (IOException e){
            System.out.println("WRONG FILE NAME AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }
    }

    private static void swap(String[] a1, Integer[] a2, int pos1, int pos2){
        String sTemp = a1[pos1];
        Integer iTemp = a2[pos1];
        a1[pos1] = a1[pos2];
        a2[pos1] = a2[pos2];
        a1[pos2] = sTemp;
        a2[pos2] = iTemp;
    }
}
