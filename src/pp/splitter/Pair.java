package pp.splitter;

public class Pair <K, V>
{
	//fields
	private K firstValue;
	private V secondValue;
	
	public Pair(K firstValue, V secondValue)
	{
		super();
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}

	public K getFirstValue()
	{
		return firstValue;
	}

	public void setFirstValue(K firstValue)
	{
		this.firstValue = firstValue;
	}

	public V getSecondValue()
	{
		return secondValue;
	}

	public void setSecondValue(V secondValue)
	{
		this.secondValue = secondValue;
	}
	
	public String split(String splitValue, String splitIdentifer, int partIdentifer)
	{
		String[] splitParts = splitValue.split(splitIdentifer);
		return splitParts[partIdentifer];
	}
	
	
}
