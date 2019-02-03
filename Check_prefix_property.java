import java.util.Scanner;

public class Check_prefix_property {
	
	public static void  main(String args[]) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter The Codes:\n Enter Number Of Codes: ");
		int n = x.nextInt();
		String code[] = new String[n];
		int status = 1;
		
		for(int i = 0; i<n; i++)
		{
			System.out.println("Enter Code For (" + i + "):");
			code[i] = x.next();
		}
		
		for(int i=0; i < n; i++)
		{
			
			for(int j=0; j < n; j++)
			{
				//System.out.println(code[i] + code[j]);
				if(code[i] != (code[j]))
				{   //System.out.println("\nin" + code[i] + code[j]);
					String a = code[i];
					String b = code[j];
					//System.out.println("a="+a+"b="+b);
					int aa = a.length();
					int bb = b.length();
					//System.out.println("al="+aa);
					//System.out.println("bl="+bb);
					for(int k=0,l=0; k < aa && l < bb ;k++,l++)
					{
						
							if(a.charAt(l) == b.charAt(k) && a.charAt(0) == b.charAt(0) )
							{
								//System.out.println("ac=" + a.charAt(l) + "bc=" + b.charAt(k) );
								status = 0;
							}
						}
					}
					
				
				
			}
		}
		
		if (status == 0)
			System.out.println("True");		
		else
			System.out.println("false");
		
	x.close();
	}
	
}
