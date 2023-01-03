package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	interface Square {
	    int calculate(int x);
	}
	public static void main(String[] args) {
		 int a = 5;
		 
	        // lambda expression to define the calculate method
	        Square s = (x) -> x * x;
	 
	        // parameter passed and return type must be
	        // same as defined in the prototype
	        int ans = s.calculate(a);
	        System.out.println(ans);
		
	}
}
