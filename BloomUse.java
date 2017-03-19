import java.io.*;

public class BloomUse {
	public static void main(String args[]) {
		BloomFilter bloom = new BloomFilter();
		System.out.println("Emply bloom filter: " + bloom.bFilter);
		bloom.insert("revanth");
		System.out.println("revanth inserted: " + bloom.bFilter);
		bloom.insert("Guwahati");
		System.out.println("Guwahati inserted: " + bloom.bFilter);
		System.out.println("Testing revanth: ");
		bloom.check("revanth");
		System.out.println("Testing chetluru: ");
		bloom.check("chetluru");
	}
}
