
import java.util.HashMap;

public class MapCount
{
	public static void main(String[] args)
	{
		var nums = new String[] {"a", "b", "a", "b", "c", "a", "b", "c", "b"};
		
		var map = new HashMap();
		
		for ( var i = 0; i < nums.length; i++)
		{
			if(map.containsKey(nums[i]))
			{
				int oldcount = (Integer) map.get(nums[i]);
				int newcount = oldcount + 1;
				map.put(nums[i], newcount);
			}
			else
			{
				map.put(nums[i], 1 );
			}
		}
		for (var key : map.keySet())
		{
			System.out.println(key + "-->" + map.get(key));
		}
	}
}