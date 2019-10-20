package csc220;

//	K is the type of the key, V is the type of the value
public class KVP<K, V>
{
	K key;
	V value;

	public KVP(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
}