import java.util.ArrayList;
import java.util.List;

class Node<T>
{
    T val;
    Node<T> next;

    public Node(T val)
    {
        this.val = val;
        this.next = null;
    }
}

class Solution
{

    public static List<String> linkedListValues(Node<String> head)
    {
        List<String> values = new ArrayList<>();
        Node<String> current = head;

        while (current != null)
        {
            values.add(current.val);
            current = current.next;
        }
        return values;
    }

    public static void main(String[] args)
    {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(Solution.linkedListValues(a));
    }
}

