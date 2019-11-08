package inventory;

import javax.persistence.EntityManager;

import java.util.*;
import java.util.*;
public class Main {
	static EntityManager em =  HibernateOGMUtil.getEntityManagerFactory().createEntityManager();
	List<Product> products=new ArrayList<>();
	public static void main(String args[]) {
		
		int choice;
		System.out.println("Welcome");
		do {
		System.out.println("Enter your choice");
		Scanner inp=new Scanner(System.in);
		System.out.println("1.View all products");
		System.out.println("2.Add a new product");
		System.out.println("3.Delete a product");
		System.out.println("4.Update an existing product");
		System.out.println("5.Exit");
		choice=inp.nextInt();
		switch(choice) {
		case 1:
			viewAll();
			break;
		case 2:
			addProduct();
			break;
		case 3:
			deleteProduct();
			break;
		case 4:
			updateProduct();
			break;
		case 5:
			break;
			default:
				System.out.println("Invalid choice, add again");
		}
	}while(choice!=5);
	}
private static void updateProduct() {
		// TODO Auto-generated method stub
		
	}
private static void deleteProduct() {
		// TODO Auto-generated method stub
		
	}
private static void viewAll() {
		// TODO Auto-generated method stub
		
	}
public static void addProduct() {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter product name");
	String name=inp.nextLine();
	System.out.println("Enter product description");
	String desc=inp.nextLine();
	System.out.println("Enter product price");
	int price=inp.nextInt();
	System.out.println("Enter product quantity");
	int quantity=inp.nextInt();
	em.getTransaction().begin();
	em.persist(new Product(name,desc,price,quantity));

	em.getTransaction().commit();
}
}
