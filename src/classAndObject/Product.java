package classAndObject;

public class Product {
    private Integer id;
    private String code;
    private String name;
    private Double price;
    private Integer quantity;


    public  void setProduct(Integer id,
                            String code,
                            String name,
                            Double price,
                            Integer quantity) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Code: " + code);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
    }
}
