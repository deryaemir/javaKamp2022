public class Main {

    public static void main(String[] args) {
        Product product=new Product();
        product.name="Laptop";
        product.id=1;
        product.price=5000;
        product.stockAmount=3;
        product.description="Asus Laptop";
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
//bir klas sadece bir işi yapar.

    }
}
