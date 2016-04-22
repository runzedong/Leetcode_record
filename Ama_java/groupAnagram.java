public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (strs==null || strs.length==0)
            return res;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str: strs){
            char[] StrArr=str.toCharArray();
            Arrays.sort(StrArr);
            String strSorted = new String(StrArr);
            if (map.get(strSorted)==null)
            {
                ArrayList<String> items = new ArrayList<>();
                items.add(str);
                map.put(strSorted,items);   
            }
            else
            {
                map.get(strSorted).add(str);    
            }
        }
        for (ArrayList<String> n: map.values())
        {
            Collections.sort(n);
            res.add(n);
        }
        return res;
    }
}