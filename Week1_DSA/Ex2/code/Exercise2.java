
import java.util.Scanner;

class Product {
    int prodId;
    String prodName, category;
}
class Exercise2{
    static int n; //Size of the product array
    static int[] products; // Products array to store the product IDs
    
    public int linearSearch(int x) {
        for (int i = 0; i < n; i++)
            if (products[i] == x)
                return i;
        return -1;
    }

    public int binarySearch(int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (products[mid] == x)
                return mid;
            if (x > products[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        n = sc.nextInt();
        products = new int[n];
        for (int i = 0; i < n; i++) {
            products[i] = 1000+i;
        }
        System.out.print("Enter the productId you require: ");
        int id = sc.nextInt();
        Exercise2 obj = new Exercise2();
        System.out.println("Index of the required product (by linear search method) = " + obj.linearSearch(id));
        System.out.println("Index of the required product (by binary search method) = " + obj.binarySearch(id));
        sc.close();
    }
}
