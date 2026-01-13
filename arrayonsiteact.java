public class Main {
    public static void main (String[] args) {

        System.out.println("Numbers:");
        
        int[] number = {10, 20, 5, 30, 15, 25, 40, 2, 8, 12};
        int sum=0;
        
        //Number 1
        for (int i = 0; i < number.length;i++){
        System.out.print(number[i] + " ");             
        }
        
        
        //Number 2        
        System.out.println("\nNumbers in Reverse:");
        for (int i = 9; i >= 0;i--){
        System.out.print(number[i] + " ");             
        }

        //Number 3
        for (int i = 0; i < number.length;i++){
        sum += number[i]; }
        System.out.print("\nSum of Numbers: " +sum);  
        
        //Number 4
        System.out.println("\nNumbers less than 15:");  
        for (int i = 0; i < number.length;i++){
        if (number[i]<15) {
        System.out.print(number[i] + " ");
    
        } 
        }
        
        //Number 5
        System.out.println("\nNumbers above average (16.7):");  
        for (int i = 0; i < number.length;i++){
        if (number[i]>16.7) {
        System.out.print(number[i] + " ");
    
        } 
        }
        
}
}