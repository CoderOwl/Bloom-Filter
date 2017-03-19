import java.util.BitSet;
import java.io.*;

public class BloomFilter {
	static int m = 16;
	BitSet bFilter = new BitSet(m);	
	
	public void insert(String inp) {
		int hashV = Math.abs(inp.hashCode());
		int hashC = hashV%m;
		int hash2C = (hashV/m)%m;
		this.bFilter.set(hashC);
		this.bFilter.set(hash2C);
	}
	
	public void check(String inp) {
		int hashV = Math.abs(inp.hashCode());
		int hashC = hashV%m;
		int hash2C = (hashV/m)%m;
		if(this.bFilter.get(hashC) == true && this.bFilter.get(hash2C) == true)
		{
			System.out.println(inp + " maybe in the given strings.");
		}
		else
		{
			System.out.println(inp + " is definitely not in the given strings.");
		}
	}	
	
/*	public static void main(String args[]) {
		BloomFilter bloom = new BloomFilter();
		//bloom.bFilter.set(3);
		//bloom.bFilter.set(5);
		//bloom.bFilter.set(6);
		//System.out.println(bloom.bFilter.get(5));
		//System.out.println(bloom.bFilter.get(2));
		System.out.println(bloom.bFilter);
		String str = "revanth";
		int hashC = str.hashCode()%m;
		int hash2C = (str.hashCode()/m)%m;
		System.out.println("Hashcode for revanth: " + hashC  + " " + hash2C);
		bloom.insert(str);
		System.out.println(bloom.bFilter);
		String str2 = "techniche";
		bloom.insert(str2);
		bloom.check(str);
		bloom.check("rover");
		System.out.println(bloom.bFilter);
	} */
}
