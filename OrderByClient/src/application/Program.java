package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		 String name = scan.nextLine();
		System.out.print("Email: ");
		 String email = scan.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		 Date birthDate = sdf.parse(scan.nextLine());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		 OrderStatus status = OrderStatus.valueOf(scan.next());
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		 int n = scan.nextInt();
		
		 for(int i=1;i<=n;i++) {
			 System.out.println("Enter #" + i + " item data: ");
			 System.out.print("Product name: ");
			 scan.nextLine();
			 String productName = scan.nextLine();
			 System.out.print("Product price: ");
			 double productPrice = scan.nextDouble();
			  
			 Product product = new Product(productName, productPrice);
			 
			 System.out.print("Quantity: ");
			  int qtd = scan.nextInt();
			 
			 OrderItem orderItem = new OrderItem(qtd, productPrice, product);
			 
			 order.addItem(orderItem); 
		 }
		 
		 System.out.println();
		 System.out.println("ORDER SUMMARY:");
		 System.out.println(order);
		 
		 scan.close();
	}

}
