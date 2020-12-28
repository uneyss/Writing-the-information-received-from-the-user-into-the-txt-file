
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Samochód[] cars = new Samochód[n];
        for(int i = 0; i < n; i++){
            cars[i] = new Samochód();
            String s;
            System.out.println("Marka pisz");
            s = scan.next(); 
            cars[i].setMarka(s);
            System.out.println("Model pisz");
            s = scan.next();
            cars[i].setModel(s);
            System.out.println("Silnik pisz");
            s = scan.next();
            cars[i].setSilnik(s);
        }
         BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String s = "";
        ArrayList<String> oldSentences = new ArrayList<String>();
        while((s = br.readLine()) !=null){
            System.out.println(s);
            oldSentences.add(s);
        }
        
        
        try(Writer writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("test1.txt"),"utf-8"))){
            for(String sentence : oldSentences){
                writer.write(sentence + '\n');
            }
            for(Samochód car : cars){
                writer.write(car.toString()+'\n');
            }
            
        }
        
       
}
    
}
