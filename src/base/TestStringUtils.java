package base;

import org.apache.commons.lang3.StringUtils;

public class TestStringUtils {
	
	public static void main(String[] args) {
	
		String s1 = "IKEA";
		System.out.println(StringUtils.isNumeric(s1));
		System.out.println(StringUtils.countMatches(s1, 'A'));
		System.out.println(StringUtils.reverse(s1));
		
	}
}