import java.util.*;
import java.io*;
import java.lang.*;

public class problemA{
	public static void main(String[] args) {
		Scanner in= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t= in.nextInt(); //scanner method to read
		for(int i=1;i<=t;++i){
			int res=solution(in.nextInt);
			if (res==0)
				System.out.println("Case #"+i+": INSOMNIA");
			else
				System.out.println("Case #"+i+": "+res);
	}
	public solution(int n){
		if (n==0)
			return 0;
		else
		{
			HashSet<Integer> dic=new HashSet<Integer>();
			int count=0;
			int base=n;
			while (True){
				int temp=n;
				while (temp!=0){
					int digit=temp%10;
					if (!dic.contains(digit)){
						dic.add(digit);
						count++;
						if (count==10)
							return n;
					}
					temp/=10;
				}
				n+=base;
			}
		}
	}
}