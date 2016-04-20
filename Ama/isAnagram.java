public class isAnagram {
/*
    normal solution use hashtable to keep char:number
    two time scan, one for build map, another for check
    this method use ASCII array.
    upon find one new char, counter++
    when specific char number decrease to zero, counter--;
*/
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        int counter=0;
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        int[] record = new int[127];
        for (int i=0; i<sc.length; i++)
        {
            if (++record[sc[i]]==1)
                counter++;
            if (--record[tc[i]]==0)
                counter--;
        }
        return counter==0;
    }
}