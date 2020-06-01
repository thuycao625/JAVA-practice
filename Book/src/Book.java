public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStore = 0;

    public Book(String name,Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name,Author author, double price, int qtyInStore){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStore = qtyInStore;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStore() {
        return qtyInStore;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStore(int qtyInStore) {
        this.qtyInStore = qtyInStore;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qtyInStore=" + qtyInStore +
                '}';
    }
}
