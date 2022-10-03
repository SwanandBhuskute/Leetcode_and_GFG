import java.util.*;

class MobileDetails{
    
    protected String modelName;
    protected String companyName;
    protected int price;
    protected int yrManufacture;
    
    void set_mobileDetails(String modelName1, String companyName1, int price1, int yrManufacture1){
        modelName = modelName1;
        companyName = companyName1;
        price = price1;
        yrManufacture = yrManufacture1;
    }
    
    static void sort_mobileDetails (MobileDetails[] obj) {
        int len = obj.length;
        MobileDetails temp = new MobileDetails();
        for (int i=0;i<len-1; i++){
            for(int j = 0; j<len-i-1; j++){
            if(obj[j].companyName.compareTo(obj[j+1].companyName) >0){
                temp = obj[j];
                obj[j] = obj[j+1];
                obj[j+1]=temp;
                }
            }
        }
    }
    
    void display_mobileDetials(){
        System.out.println(modelName+" "+companyName+" "+price+" "+yrManufacture);
    }
            
    }    

public class Mobile{
    public static void main(String[] args){
        System.out.println("21BCI0184");
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        
        MobileDetails obj[] = new MobileDetails[5];
        obj[0] = new MobileDetails();
        obj[1] = new MobileDetails();
        obj[2] = new MobileDetails();
        obj[3] = new MobileDetails();
        obj[4] = new MobileDetails();
        
        for(int i=0; i<5; i++){
            
            System.out.println("Model Name: ");
            String modelName2 = sc.next();
            System.out.println("Company Name: ");
            String companyName2 = sc.next();
            System.out.println("Year of manufacture: ");
            int yrManufacture2 = sc.nextInt();
            System.out.println("Price: ");
            int price2 = sc.nextInt();
            
            
            obj[i].set_mobileDetails(modelName2, companyName2, price2, yrManufacture2);
        }
        MobileDetails.sort_mobileDetails(obj);
        
        for(int j=0; j<5; j++){
            obj[j].display_mobileDetials();
            System.out.println("");
        }
        
    }
}   
