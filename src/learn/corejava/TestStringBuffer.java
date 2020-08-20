package learn.corejava;


public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer stb = new StringBuffer("Aibesh ");
		//stb.append("patil");
		//System.out.println(stb);
		
		StringBuffer sb=new StringBuffer("ms");
		//sb.append("dhoni");
		//System.out.println(sb);
		
		sb.insert(1, "dhoni");
		System.out.println(sb);
		
		//stb.replace(1, 3, "patil");
		//System.out.println(stb);
		
		//stb.delete(1,3);
		//System.out.println(stb);
		
		//stb.reverse();
		//System.out.println(stb);
		
		
		System.out.println(stb.capacity());
		
		stb.append("hjfbsjbnf");        
        System.out.println(stb.capacity());
        
        stb.append("sgjvfdkjsbfkSDhvf    dfdjhmnfmb ffjhsbfnmsfh hbfmnsfhe nmfbm");
        System.out.println(stb.capacity());
        stb.ensureCapacity(20);
        System.out.println(stb.capacity());
        stb.ensureCapacity(100);
        System.out.println(stb.capacity());
	}

}
