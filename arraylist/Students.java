package arraylist;
import java.util.*;
import java.io.*;
public class Students {

    ArrayList<String> students=new ArrayList<>();
  Scanner input=new Scanner(System.in);

    void addStudents(){
students.add("Joshua Juma");
students.add("Vidah Limaya");
students.add("Scovia Michael");
students.add("Idaa Ooko");
System.out.println("Students added successfully");
    }

void saveStudentsToFile(){
try(BufferedWriter bw=new BufferedWriter(new FileWriter("arraylist/students.txt"))) {

for (String student: students){
    bw.write(student);
    bw.newLine();
}
System.out.println("Students written successfully");

    
} catch (Exception e) {
    e.printStackTrace();
    System.out.println("An error has occurred");
}
}
void displayStudents(){
   for(int i=0;i<students.size();i++){
    System.out.println(i+1+":"+students.get(i));
   }
}

void listStudents(){
    for(String student: students){
        System.out.println(student);
    }

  
}
void linearSearch(){
    System.out.println("Enter the name of the student: ");
String target=input.nextLine().toLowerCase();
boolean isExist=false;
    for(int i=0;i<students.size();i++){
        if(students.get(i).toLowerCase().equals(target)){
        isExist=true;
        } 
    }
   if(isExist){
    System.out.println("Student found. Student exist");
   }else{
    System.out.println("Student does not exist");
   }
}

public void updateName(){
    System.out.println("Enter the old name: ");
    String oldName=input.nextLine();
    System.out.println("Enter the new name: ");
    String newName=input.nextLine();
    boolean updated=false;
for(int i=0;i<students.size();i++){
    if(students.get(i).equalsIgnoreCase(oldName)){
        students.set(i,newName);
        updated=true;
    }
}
    
if(updated){
    System.out.println("Student updated successfully");
} else{
    System.out.println("Student not found");
}
}
public void sortStudents(){
      Collections.sort(students,Collections.reverseOrder());
      System.out.println(students);
}
void readFromFile(){
    try (BufferedReader br=new BufferedReader(new FileReader("arraylist/students.txt"))){
        String line;
        while ((line=br.readLine())!=null) {
            System.out.println(line);
            
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("An error has occured");
        
    }
}
public static void main(String[] args) {
    Students watoto=new Students();
    watoto.addStudents();
    watoto.saveStudentsToFile();
    watoto.displayStudents();
    watoto.readFromFile();
watoto.sortStudents();


}
}
