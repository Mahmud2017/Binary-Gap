package BinaryGap;

public class BG_Main {

	public static void main(String[] args) {
		
		int answer = solution(1041);
		System.out.println(answer);
	}
	
	public static int solution(int N)
	{
		String str = Integer.toString(N, 2);
		
		int maxLength = 0;
		int theLength = 0;
		
		for (int i = 0; i < str.length(); ++i)
		{
			char charAt = str.charAt(i);
			if(charAt == '0')
			{
				theLength++;
			}
			else
			{
				if(maxLength < theLength)
					maxLength = theLength;
				
				theLength = 0;
			}
		}
		
		return maxLength;
	}

}
