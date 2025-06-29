import java.util.Scanner;

class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public Invoice() {
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Invoice");
        System.out.println("Item number: " + number);
        System.out.println("Item description: " + description);
        System.out.println("Item quantity: " + quantity);
        System.out.println("Item price: " + price);
        System.out.println("Total = " + (quantity * price));
    }
}

public class ItemInvoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Invoice item1 = new Invoice();

        System.out.print("Item number: ");
        item1.setNumber(sc.next());
        System.out.print("Item description: ");
        sc.nextLine(); 
        item1.setDescription(sc.nextLine());

        System.out.print("Item quantity: ");
        int qty = sc.nextInt();
        if (qty <= 0) {
            item1.setQuantity(0);
        } 
        else {
            item1.setQuantity(qty);
        }

        System.out.print("Item price: ");
        double price = sc.nextDouble();
        item1.setPrice(price);

        Invoice item2 = new Invoice("23ds32ewdd", "Nvidia 4050 Graphics card", 2, 50000);

        System.out.println();
        item1.display();
        System.out.println();
        item2.display();

    }
}

