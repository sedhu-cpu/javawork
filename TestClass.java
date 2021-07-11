import java.io.*;
import java.util.*;
import java.util.ArrayList;;

public class TestClass {
    int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());

            long out_ = solve(n);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static long solve(int n){
       // Write your code here
       ArrayList<String> vowel = new ArrayList<String>();
       ArrayList<String> vowelr = new ArrayList<String>();
       vowel.add("a");
       vowel.add("e");
       vowel.add("i");
       vowel.add("o");
       vowel.add("u");
       for(int i = 0 ; i < vowel.size(); i++){
         for(int j = 1 ; j < vowel.size() ; j++){
             vowelr.add(vowel[i]+vowel[j]);
         }
       }
        long result = 5;

        return result;
    
    }
}