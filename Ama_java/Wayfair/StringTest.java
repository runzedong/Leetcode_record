public class StringTest {
	public static void combinationString (ArrayList<ArrayList<String>> listStrs) {
		ArrayList<String> res = new ArrayList<String>();
		if (listStrs==null || listStrs.size()==0) { 
			return;
		}

		dfs(listStrs, res, 0, "");
		for (String str : res) {
			System.out.println(str+"  here");
		}
	} 
	private static void dfs(ArrayList<ArrayList<String>> listStrs, ArrayList<String> res, int point, String s ) {
		if (point == listStrs.size()) {			
			res.add(s);
			return;
		}
		ArrayList<String> curr = listStrs.get(point);
		for (String sub : curr) {			
			dfs(listStrs, res, point+1, s+sub);			
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


