package TestFramework.Demoproject;

public class reverse {
	
	public static void main (String [] args) {
		String str="sugumar";
		char [] str1=str.toCharArray();
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]);
		}
	}

}
