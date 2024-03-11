package reflectionAPI;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Objects;

/**
 * Product Entity class to model
 * the real-world product
 */
class Product{
    private String productName;
    private String productManufacturer;
    private String productDescription;
    private double productPrice;
    private float productRating;
    private Date productExpiryDate = new Date("12/12/24");

    // Constructors
    public Product() {
    }

    public Product(String productName, String productManufacturer, String productDescription, double productPrice, float productRating, Date productExpiryDate) {
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.productExpiryDate = productExpiryDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductRating() {
        return productRating;
    }

    public void setProductRating(float productRating) {
        this.productRating = productRating;
    }

    public Date getProductExpiryDate() {
        return productExpiryDate;
    }

    public void setProductExpiryDate(Date productExpiryDate) {
        this.productExpiryDate = productExpiryDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productManufacturer='" + productManufacturer + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productRating=" + productRating +
                ", productExpiryDate=" + productExpiryDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(productPrice, product.productPrice) == 0 && Float.compare(productRating, product.productRating) == 0 && Objects.equals(productName, product.productName) && Objects.equals(productManufacturer, product.productManufacturer) && Objects.equals(productDescription, product.productDescription) && Objects.equals(productExpiryDate, product.productExpiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productManufacturer, productDescription, productPrice, productRating, productExpiryDate);
    }
}

/**
 * Reflection API
 */
public class Example1 {
    public static void main(String[] args) throws Exception{
        // Method Used For Inspecting The UserDefined Class
        Class<?> concreteClass = Class.forName("reflectionAPI.Product");
        System.out.println(concreteClass.getCanonicalName());

        // Method for Inspecting the Wrapper class
        Class<?> MyRefBooleanClass = Boolean.TYPE;
        System.out.println(MyRefBooleanClass.getCanonicalName());

        Class<?> MyRefPrimitiveIntegerClass = int.class;
        System.out.println(MyRefPrimitiveIntegerClass.getCanonicalName());

        Class<?>SuperClassFromConcereteClass = concreteClass.getSuperclass();
        System.out.println( "Super Class Of Concrete Class : "+ SuperClassFromConcereteClass.getCanonicalName());
        System.out.println("Super Class Of Object class : " + SuperClassFromConcereteClass.getSuperclass());

    }
}
