import java.util.List;

public class Category {
    private Long id;
    private String title;
    private List<Product> products;

    public Category(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Category " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", products=" + products.toString();
    }

    public Long getId() {
        return id;
    }
}
