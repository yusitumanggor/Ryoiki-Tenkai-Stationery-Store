
package midstoreprogram;

import java.util.Scanner;

public class MainProgram {

    double price, payment, change;
    int choose, totalItem, stock, totalPrice;
    
    double totalCount(int count){
        totalPrice = count;
        
        switch(choose){
            case 0:
                System.exit(0);
                break;
            case 1:
                price = 5000;
                stock = 100;
                totalPrice = (int) (price*totalItem);
                break;
            case 2:
                price = 2000;
                stock = 100;
                totalPrice = (int) (price*totalItem);
                break;
            case 3:
                price = 1000;
                stock = 100;
                totalPrice = (int) (price*totalItem);
                break;
            case 9:
                break;
            default:
                System.out.println("ERROR : You Enter the wrong input!! Please try again.");
                break;
        }
        return totalPrice;
    }
    
    double remainStocks (int item){
        totalItem = item;
        
        switch(choose){
            case 0:
                System.exit(0);
                break;
            case 1:
                stock = 100;
                stock = stock - item;
                break;
            case 2:
                stock = 100;
                stock = stock - item;
                break;
            case 3:
                stock = 100;
                stock = stock - item;
                break;
            case 9:
                break;
            default:
                System.out.println("ERROR : You Enter the wrong input!! Please try again.");
                break;
        }
        return stock;
    }

    
    void viewtotalPrice(){
        System.out.println("================= PAYMENT TIME =====================");
        System.out.println("The Total Price is : Rp." + totalPrice);
    }
    
    double changeCount(double paid){
        payment = paid;
        change = paid-totalPrice;
        
        return change;
    }
    
    double remainStocks (double stockItem){
        stock = (int) stockItem;
        stock = (int)(stockItem-totalItem);
        
        return stock;
    }
    void viewstockItem(){
        System.out.println("Available stock : " + stock);
    }
    
    void viewchangeCount(){
        System.out.println("The Total Change is : Rp."+change);
        System.out.println("============ THANK YOU FOR SHOPPING =============");

    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MainProgram in = new MainProgram();
        System.out.println("================================================");
        System.out.println("        Ryoiki Tenkai Stationary's Store        ");
        do{
            System.out.println("================================================");
            System.out.println("                                                ");
            System.out.println("             List of Stationary's Name          ");
            System.out.println("Number      Item Name       Stock        Price  ");
            System.out.println("  1.          Book           100       Rp. 5.000");
            System.out.println("  2.         Pencil          100       Rp. 2.000");
            System.out.println("  3.         Eraser          100       Rp. 1.000");
            System.out.println("\n9. Finish and calculate payment");
            System.out.println("0. Exit the Program");
            System.out.println("================================================");
            System.out.println("Input your chosen item : ");

            in.choose = input.nextInt();
            
            if(in.choose>=1 && in.choose<=3){
                System.out.println("Input the purchase amount : ");
                in.totalItem = input.nextInt(); 
                in.remainStocks(in.totalItem);
                in.viewstockItem();
            }else{
                
            }
            
            in.totalCount(in.totalPrice);
            
        }while(in.choose!=9);
        in.viewtotalPrice();
        System.out.println("Total payment : ");
        in.payment = input.nextDouble();
        in.changeCount(in.payment);
        in.viewchangeCount();
        
    }
    
}
