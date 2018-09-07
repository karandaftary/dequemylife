import java.util.Date;

public class Node {
    Node next = null;
    String task; // Task that you want to do
    Date date; // Date the task was added


    public Node(String t, Date d) {
        task = t;
        date = d;
    }
}
