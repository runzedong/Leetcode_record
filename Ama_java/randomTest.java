import java.lang.Math;
import java.util.*;
public class randomTest {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++)
			System.out.println((int) (Math.random()*i)+1);
	}
}