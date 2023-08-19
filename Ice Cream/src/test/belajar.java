package test;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import Order.Order;


public class belajar {
	private static final String[] ICE_CREAM_TYPES = {
	        "Strawberry", "Coklat", "Vanilla", "Durian", "Blueberry"
	    };
	
	private static final String[] ICE_CREAM_CUP = {
	        "Cone","Sundae"
	    };
	
	private static final String[] ICE_CREAM_TOPPING = {
			"No Topping","Almond","Nut","Oreo","Messes"
	    };
	Scanner sc = new Scanner(System.in);
	ArrayList<Order> icecream = new ArrayList<>();
	
public int cek() {
		
		int salah = 0;
		try {
			salah = sc.nextInt();	
		}catch(Exception e) {
			salah = -1;
			System.out.println("Input must be numeric!");
		}
		sc.nextLine();
		return salah;
	}

public static boolean isOrderNumberExist(ArrayList<Order> orders, int number) {
    for (Order order : orders) {
        if (order.getNoOrder() == number) {
            return true;
        }
    }
    return false;
}

	public void Order() {
		int number,Type,cup,topping,qty;
		
		
		
		do {
			System.out.printf("Input 'No Order' [1-10000] : ");
			number = sc.nextInt();
			System.out.println();
		}while(!(number>=1) || !(number <=10000) || isOrderNumberExist(icecream, number));
		

		do {
			System.out.printf("Type (1. Strawberry 2. Coklat 3. Vanilla 4. Durian 5. Blueberry): ");
			Type = sc.nextInt();
		
			 if (Type >= 1 && Type <= ICE_CREAM_TYPES.length) {
				 	String Selectedtype = ICE_CREAM_TYPES[Type - 1];
	                System.out.println("Anda memilih tipe es krim: " + Selectedtype);
	            	System.out.println();
	            } else if (Type != 0) {
	                System.out.println("Pilihan tidak valid.");
	            }
		}while(!(Type>=1) || !(Type<=5));			
		
		do {
			System.out.printf("Cone/Sundae (1. Cone 2. Sundae) : ");
			cup = sc.nextInt();
			 if (cup >= 1 && cup <= ICE_CREAM_CUP.length) {
	                String selectedIceCup = ICE_CREAM_CUP[cup - 1];	             
	                System.out.println("Anda memilih tipe cup: " + selectedIceCup);
	            	System.out.println();
	            } else if (cup != 0) {
	                System.out.println("Pilihan tidak valid.");
	            }
		}while(!(cup>=1) || !(cup<=2));			
		
		do {
			System.out.printf("Topping (1. No Topping 2. Almond 3. Nut 4. Oreo 5. Messes) : ");
			topping = sc.nextInt();
			 if (topping >= 1 && topping <= ICE_CREAM_TOPPING.length) {
	                String selectedIceTopping = ICE_CREAM_TOPPING[topping - 1];                
	                System.out.println("Anda memilih tipe topping " + selectedIceTopping);
	            	System.out.println();
	            } else if (topping != 0) {
	                System.out.println("Pilihan tidak valid.");
	            }
		}while(!(topping>=1) || !(topping<=5));			
		do {
			System.out.printf("Quantity : ");
			qty = sc.nextInt();
			System.out.println();
		}while(!(qty>=1));			
		
		Order iceOrder = new Order(number, ICE_CREAM_TYPES[Type-1], ICE_CREAM_CUP[cup-1], ICE_CREAM_TOPPING[topping-1], qty);
		icecream.add(iceOrder);
	}
	
	
	
	public void history() {
		int totalqty = 0;
		if(icecream.isEmpty()) {
			 System.out.println("There was no order.");
			 sc.nextLine();
		 }else {
			 System.out.println("=========================================================================");
			 System.out.printf("|%-3s|%-8s|%-14s|%-11s|%-10s|%-5s|\n",
			 "No","No Order", "Ice Cream Type", "Cone/Sundae", "Topping", "qty");
			 System.out.println("=========================================================================");
			 int i = 0;
			 for (Order o : icecream) {
				 i++;
				 totalqty += o.getQty();
				 System.out.printf("|%-3s|%-8s|%-14s|%-11s|%-10s|%-5s|\n",i,o.getNoOrder(), o.getType(), o.getCup(), o.getTopping(), o.getQty());
				 System.out.println("=========================================================================");
				 
			 }System.out.println("JumlahItem :" + totalqty);
	}
	}
	
	public belajar() {
		// TODO Auto-generated constructor stub
	int pilih = 0;
	
	do {
	System.out.println("1. Order");
	System.out.println("2. Order History");
	System.out.println("3. Exit");
		
	do {
		System.out.println("Chosse>>");
		pilih = cek();
		
	}while (pilih<1 || pilih>3);
	switch(pilih) {
	case 1 :
		Order();
		break;
	case 2 :
		history();
		break;
	case 3 :
		break;
	}
		
	}while( pilih != 3 );
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new belajar();
	}

}
