import java.util.*;

public class Cgpa{
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Number of students: ");
        int num = sc.nextInt();
         
        int count = 1;
        int count1 = 0;
        System.out.println("CGPA of students: ");
        for(int i=0; i<num; i++){
            float cgpa = sc.nextFloat();
             
            if(cgpa>=8.0){
                ++count;
            }
        }
        
        System.out.println("Name of students with 8+ CGPA: "); 
        String name[] = new String[count]; 
        for(int j=0; j<count; j++){ s
            name[j] = sc.nextLine();
        }
        
         
        System.out.println("User Input: ");
        String name1 = sc.next();
        for (int j=0;j<num;j++){
            
            if (name[j].contains(name1)){
                System.out.println(name1+" is a 8.0 pointer");
                count1=count1+1;
                
            }
        
            }
        if(count1==0){
                System.out.println(name1+" is not a 8.0 pointer");
                }
        
    }
}
