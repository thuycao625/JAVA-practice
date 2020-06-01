public class Main {
    public static void main(String [] args){
        Author author = new Author("thuycao","thuycao@gmail.com", 'f');

        author.setEmail("thuy23@gmail.com");

        Book b1 = new Book("Tam cam",author,123,2);

        System.out.println(b1);
    }
}
