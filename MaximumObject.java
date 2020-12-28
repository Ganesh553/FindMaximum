package Generic;

public class MaximumObject <T extends Comparable<T>> {
	T x, y, z;

	public MaximumObject(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void main(String[] args) {

		Integer xInt=3, yInt=2, zInt=5;
		Float xf1=10.2f, yf1=25.5f, zf1=25.5f;
		new MaximumObject(xInt, yInt, zInt).maximum();
		new MaximumObject(xf1, yf1, zf1).maximum();
		new MaximumObject(xInt, yInt, zInt).maximum();
	}
	private T maximum() {
		return MaximumObject.maximum(x, y, z);	
	}

	private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		printMax(x, y, z, max);			
		return max;		
	}

	private static<T> void printMax(T x, T y, T z, T max) {
		System.out.println(x+" "+y+" "+ z+" "+"The maximum value is: "+max);
	}
		System.out.print(x+" "+y+" "+ z+" "+"The maximum value is: "+max);
	}
}
