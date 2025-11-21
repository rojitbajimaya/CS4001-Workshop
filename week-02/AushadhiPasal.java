public class AushadhiPasal{
    
    public static void main (String[] args){
        
        String medName1="Paracetamol";
        String medName2="Amoxicillin";
        String medName3="Metformin";
        String medName4="Ibuprofen";                //Declaration of English Medicine names.
        
        String nepMedName1="प्यारासिटामोल ";
        String nepMedName2="अमोक्सिसिलिन ";
        String nepMedName3="मेटफोर्मिन ";
        String nepMedName4="आइबुप्रोफेन ";              //Declaration of Nepali Medicine names.
        
        int medStock1=150;
        int medStock2=85;
        int medStock3=60;
        int medStock4=200;                          //Initialization of Stock of Medicines.
        
        double medPrice1=2.52d;
        double medPrice2=8.75d;
        double medPrice3=5.25d;
        double medPrice4=3.83d;                     //Initialization of Medicine Prices.
            
        String medPres1 = (medStock1<=100)? "Yes *LOW*":"NO";
        String medPres2 = (medStock2<=100)? "Yes *LOW*":"NO";
        String medPres3 = (medStock3<=100)? "Yes *LOW*":"NO";
        String medPres4 = (medStock4<=100)? "Yes *LOW*":"NO";       //Assigning the Prescription based on the Stock of Medicine if it is less than 100 or not.
        
        int totalMeds=4;
        int presRequired=2;
        int overTheCounter=2;                       //Initialization of Total Medicines, Prescription required and Over the Counter values.
        
        System.out.println("                                                                                                     औषधि पसल, धरान - मेडिसिन इनभेन्टरी रिपोर्ट");
        System.out.println("                                      Aushadhi Pasal, Dharan - Medicine Inventory Report");
        System.out.println("==========================================================================================================================");
        System.out.println();
        System.out.println();
        
        System.out.println("MEDICINE NAME         NEPALI NAME        PRICE              STOCK              PRESCRIPTION");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println(medName1 + "            " + nepMedName1 + "              " + "NRP " + medPrice1 + "              " + medStock1 + "                 " + medPres1);
        System.out.println(medName2 + "            " + nepMedName2 + "             " + "NRP " + medPrice2 + "              " + medStock2 + "                  " + medPres2);
        System.out.println(medName3 + "              " + nepMedName3 + "                   " + "NRP " + medPrice3 + "              " + medStock3 + "                  " + medPres3);
        System.out.println(medName4 + "              " + nepMedName4 + "                 " + "NRP " + medPrice4 + "              " + medStock4 + "                 " + medPres4);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println();
        System.out.println();
        System.out.println("SUMMARY:");
        System.out.println("• Total Medicines: " + totalMeds);
        System.out.println("• Prescription Required: " + presRequired);
        System.out.println("• Over-the-Counter: " + overTheCounter);
        System.out.println();
        System.out.println();
        
        /*
        System.out.println("STOCK ALERTS:");
        System.out.println(( medStock1<=100)?"* " + medName1 + " is running low! Stock: " + medStock1: "");
        System.out.println(( medStock2<=100)?"* " + medName2 + " is running low! Stock: " + medStock2: "");
        System.out.println(( medStock3<=100)?"* " + medName3 + " is running low! Stock: " + medStock3: "");
        System.out.println(( medStock4<=100)?"* " + medName4 + " is running low! Stock: " + medStock4: "");
        
        Used stockAlert method instead of repeating the same statement.
        */
           
        System.out.println("STOCK ALERTS:");
        stockAlert(medStock1,medName1);
        stockAlert(medStock2,medName2);
        stockAlert(medStock3,medName3);
        stockAlert(medStock4,medName4);
        
        //Output based on the owner of the Aushadhi Pasal.
        
        }
        
    public static void stockAlert(int medStock, String medName){
        
        System.out.println((medStock <=100)? "• " + medName + " is running low! Stock: " + medStock: "");
                
    }
}