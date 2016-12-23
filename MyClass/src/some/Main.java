package some;
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 

import java.util.ArrayList; 
import java.util.List; 

public class Main { 
public static void main(String[] args) throws IOException { 

List<Nigga> myNigga = new ArrayList(); 
myNigga.add(new Nigga("vasya", "yo")); 
myNigga.add(new Nigga("petya", "go")); 

BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\file.txt")); 


for (Nigga nigga : myNigga) { 
bw.write("name:"); 
bw.write(nigga.getName()); 
bw.write("\r\n"); 
bw.write("surname:"); 
bw.write(nigga.getSurname()); 
bw.write("\r\n"); 
bw.write("\r\n"); 
} 

bw.close(); 
System.out.println("done"); 
} 

}