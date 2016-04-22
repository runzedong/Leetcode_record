import java.util.*;
//main method for test.
public class LRUCache {
    public static void main(String[] args) {
        LRUCache tester = new LRUCache(2);
        tester.set(2,1);
        tester.set(1,1);
        System.out.println("get "+tester.get(2));
        System.out.println("get "+tester.get(1));
        tester.set(4,99);
        System.out.println("get "+tester.get(1));
        System.out.println("get "+tester.get(2));
    }
    class Node
    {
        Node pre,next;
        int value;
        int key;
        Node(int key, int value)
        {
            this.value=value;
            this.key=key;
        }
    }
    private int capacity;
    private int num;
    private HashMap<Integer, Node> map;
    private Node first;
    private Node last;
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.num=0;
        first=null;
        last=null;
        map = new HashMap<Integer, Node>();
    }
    
    public int get(int key) {
        if (map.containsKey(key))
        {
            Node temp=map.get(key);
            if (temp==null)
                return -1;
            if (temp!=last)
            {
                if (temp==first)
                    first=temp.next;
                else
                    temp.pre.next=temp.next;
             temp.next.pre=temp.pre;
             last.next=temp;
             temp.next=null;
             temp.pre=last;
             last=temp;
            }
            return temp.value;
        }
        else
            return -1;
    }
    
    public void set(int key, int value) {
        Node temp=map.get(key);
        if (temp!=null)
        {
            temp.value=value;
            if (temp!=last)
            {
                if (temp==first)
                    first=temp.next;
                else
                    temp.pre.next=temp.next;
                temp.next.pre=temp.pre;
                last.next=temp;
                temp.next=null;
                temp.pre=last;
                last=temp;
            }
        }
        else
        {
            Node newNode=new Node(key, value);
            if (num>=capacity)
            {
                map.remove(first.key);
                first=first.next;
                if (first!=null)
                    first.pre=null;
                else
                    last=null;
                num--;
            }
            if (first==null||last==null)
                first=newNode;
            else
                last.next=newNode;
            newNode.pre=last;
            newNode.next=null;
            last=newNode;
            map.put(key,newNode);
            num++;
        }
    }
}