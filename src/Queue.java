import java.util.Date;

public class Queue {

    Node first, last;

    public void enqueue(String t, Date d)
    {
        if (first != null)
        // Queue has objects already
        {
            last.next = new Node(t,d);
            last = last.next;
        }

        else
            // Queue is empty
        {
            last = new Node(t,d);
            first = last;
        }
    }

    public Node dequeue()
    {
        if (first != null)
        {
            String task = first.task;
            Date time = first.date;
            first = first.next;
            return new Node(task,time);
        }
        else
            return null;
    }
}
