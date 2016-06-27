import java.util.*;

public class Itinerary {
   public static LinkedList<String> findItinerary(String[][] tickets) {
    LinkedList<String> ret = new LinkedList<String>();
    Map<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
    Stack<String> stack = new Stack<String>();
    for(String[] t : tickets) {
        if(!map.containsKey(t[0])) map.put(t[0], new PriorityQueue<String>());
        map.get(t[0]).offer(t[1]);
    }
    stack.push("JFK");
    while(!stack.isEmpty()) {
        String next = stack.peek();
        if(map.containsKey(next) && map.get(next).size() > 0) stack.push(map.get(next).poll());
        else ret.addFirst(stack.pop());
    }

    for (String s : ret) {
    	System.out.println(s);
    }
    return ret;
}

    public static void main(String[] args) {
    	String[][] tickets1 = {{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}};
    	//String[][] tickets2 = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
    	findItinerary(tickets1);
    }
}