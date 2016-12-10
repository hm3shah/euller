package miscellaneous;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;


public class FindDomainName {

	private static Pattern pDomainNameOnly;
	private static final String DOMAIN_NAME_PATTERN = "^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$";

	static {
		pDomainNameOnly = Pattern.compile(DOMAIN_NAME_PATTERN);
	}
	public static void main(String[] args) throws MalformedURLException {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int n = Integer.valueOf(s);
		
		StringBuffer resultString = new StringBuffer();
		for(int i=0;i<n;++i) {
			String temp = scanner.nextLine();
			int length = temp.length();
			for(int j=0;j<length;++j) {
				int start = j;
				while(temp.charAt(j)!=' ') {
					++j;
					if(j>=length) {
						j=j-1;
						break;
					}
				}
				String word = temp.substring(start, j+1);
				String checkDomain="";
				boolean check=false;
				if(word.startsWith("www.")||word.startsWith("ww2.")||word.startsWith("web.")) {
					checkDomain = word.substring(word.indexOf('.')+1);
					check=true;
				} else if (word.startsWith("http://")||word.startsWith("https://")) {
					int x = word.indexOf('/');
					checkDomain = word.substring(x+2);
					check=true;
 				} else if (word.startsWith("<a href=")) {
 					checkDomain = word.substring(word.indexOf('=')+1);
 					check=true;
 				}
				if(check) {
				if(isValidDomainName(checkDomain)) {
					if (word.startsWith("http:/")) {
				        if (!word.contains("http://")) {
				            word = word.replaceAll("http:/", "http://");
				        }
				    } else {
				        word = "http://" + word;
				    }
				   
					URL aURL = new URL(word);
					String domain1 = aURL.getHost();
					System.out.println(domain1.startsWith("www.") ? domain1.substring(4) : domain1);
					System.out.println();
					//String domain=word.substring(word.indexOf('.')+1);
					//resultString.append(domain+';');
				}
			}
			}
		}
		System.out.println(resultString.toString());
	}
	
	public static boolean isValidDomainName(String domainName) {
		return pDomainNameOnly.matcher(domainName).find();
	}
}
