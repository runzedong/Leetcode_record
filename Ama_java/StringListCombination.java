import java.util.*;

public class StringListCombination {
	public static void combinationString (ArrayList<ArrayList<String>> listStrs) {
		ArrayList<String> res = new ArrayList<String>();
		if (listStrs==null || listStrs.size()==0) { 
			return;
		}

		res.add("");
		for (int i=0; i<listStrs.size(); i++) {
			ArrayList<String> newRes = new ArrayList<String>();
			for (int j=0; j<res.size(); j++) {
				for (int k=0; k<listStrs.get(i).size(); k++) {
					newRes.add(res.get(j)+listStrs.get(i).get(k));
				}
			}
			res=newRes;
		}

		for (String str : res) {
			System.out.println(str);
		}
	} 

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> listStrs = new ArrayList<ArrayList<String>>();
		ArrayList<String> temp1 = new ArrayList<>();
		ArrayList<String> temp2 = new ArrayList<>();
		ArrayList<String> temp3 = new ArrayList<>();
		temp1.add("x");
		temp2.add("aaa");
		temp2.add("bbb");
		temp2.add("ccc");
		temp3.add("mid");
		temp3.add("Term");
		listStrs.add(temp1);
		listStrs.add(temp2);
		listStrs.add(temp3);
		for (int s=0; s<listStrs.size(); s++) {
			System.out.println("list at "+s);
			for (String e : listStrs.get(s)){
				System.out.println(e);
			}
		}
		combinationString(listStrs);
	}
}