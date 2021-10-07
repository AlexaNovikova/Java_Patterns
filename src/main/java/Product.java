import java.math.BigDecimal;

public class Product {
    private Long id;
    private String title;
    private BigDecimal price;
    private String category;

    public Product(Long id, String title, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", category='" + category +'\''+'\n';
    }

    public Long getId() {
        return id;
    }
}
