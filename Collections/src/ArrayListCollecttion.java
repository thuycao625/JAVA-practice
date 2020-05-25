import java.util.ArrayList;

public class ArrayListCollecttion{
    public static void main(String [] args){

        ArrayList list_string = new ArrayList();
        list_string.add("Hoa"); // insert element
        list_string.add("Mai");
        list_string.add("Thuy");
        System.out.println("list bofore" + list_string);

        list_string.add(3,"Mai1");
        list_string.add(4,"Thu3y");

        System.out.println("After" + list_string);
    }

}
