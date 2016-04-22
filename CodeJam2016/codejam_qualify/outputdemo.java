import java.util.*;
import java.io.*;
public class outputdemo{
	public static void main(String[] args) {
		Scanner in= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t= in.nextInt(); //scanner method to read
		for(int i=1;i<=t;++i){
			int n=in.nextInt();
			int m=in.nextInt();
			System.out.println("Case #"+i+": "+(n+m)+" "+(n*m));
		}
	}
}