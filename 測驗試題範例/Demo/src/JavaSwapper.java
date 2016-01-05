public class JavaSwapper {

	public static void main(String[] args) {
		StringBuilder firstStr = new StringBuilder("World");
		StringBuilder secondStr = new StringBuilder("Hello");
		ISwapper swapper = new Swapper();
		swapper.swap(firstStr, secondStr);
		System.out.printf("%1$s %2$s!\n", firstStr, secondStr);
	}

}

interface ISwapper {
	public void swap(StringBuilder a, StringBuilder b);
}

class Swapper implements ISwapper{

	@Override
	public void swap(StringBuilder a, StringBuilder b) {
		StringBuilder tmp = new StringBuilder(a);
		a.setLength(0);
		a.append(b.toString());
		b.setLength(0);
		b.append(tmp.toString());
	}
	
}