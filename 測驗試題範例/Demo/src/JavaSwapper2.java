public class JavaSwapper2 {

	public static void main(String[] args) {
		System.out.printf("%1$d %2$d\n", MyMath.recur(10), MyMath.nonRecur(10));
	}

}

class MyMath {
	public static long recur(long n){
		if(n == 0 || n == 1)
			return n;
		return recur(n-1) + recur(n-2);
	}
	
	public static long nonRecur(long n){
		if(n == 0 || n == 1)
			return n;
		long a = 0;
		long b = 1;
		for(long i = 2; i<=n ; i++){
			long tmp = b;
			b = a+b;
			a = tmp;
		}
		return b;
	}
}
