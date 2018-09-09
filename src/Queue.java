import java.util.Date;

public class Queue {

    Node first, last;
    int size;

    public Queue()
    {
        size = 0;
    }

    public void enqueue(String t, Date d)
    {
        // Adds new nodes to the Queue

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

        size++;
    }

    public Node dequeue()
    {
        // Deletes the first node from the Queue

        if (first != null)
        {
            String task = first.task;
            Date time = first.date;
            first = first.next;
            size--;
            return new Node(task,time);
        }
        else
            return null;
    }

    public String printQueue()
    {
        // Prints the entire Queue
        // Strings separated by new line
        String q = "";
        Node temp = first;

        while (temp != null)
            // If there are objects in the queue
        {
            q = q + temp.toString() + "\n";
            temp = temp.next;
        }

        return q;
    }

    public boolean isEmpty()
    {
        // Checks if Queue is empty

        boolean empty = false;
        if (first == null)
            empty = true;

        return empty;
    }

    public void clear()
    {
        // Delete all objects in the Queue
        // How does this affect memory?
        first = null;
        last = null;
        size = 0;
    }

    public String peek()
    {
        // Shows first element of the Queue
        String top = "Queue is empty";
        if (first != null)
            top = first.task;

        return top;
    }

    public int getSize()
    {
        return size;
    }

}
