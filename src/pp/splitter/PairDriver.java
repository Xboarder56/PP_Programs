package pp.splitter;

public class PairDriver
{
		public static void main(String[] args)
		{
			Pair<String, String> result2 = inputOne("The World Is Flat", 4);
			System.out.println(result2.getFirstValue());
			System.out.println(result2.getSecondValue());
			
			Pair<Integer, Integer> result3 = inputTwo(new int[] {1,2,3,4});
			System.out.println(result3.getFirstValue());
			System.out.println(result3.getSecondValue());

		}
		
		
		public static  Pair<String, String> inputOne(String name, int index)
		{
			String result1 = null, result2 = null;
			
			result1 = name.substring(0, index);
			result2 = name.substring(index + 1, 17);
			Pair<String, String> results = new Pair<String, String>(result1, result2);
			
			
			return results;
					
		}
		
		public static  Pair<Integer, Integer> inputTwo(int[] num)
		{
			int sum = 0;
			int avg = 0;
			
			for(int i=0; i<num.length; i++)
			{
				sum+=num[i];
			}

			avg=sum/num.length;
			
			Pair<Integer, Integer> results = new Pair<Integer, Integer>(sum, avg);
			
			
			return results;
					
		}


}
