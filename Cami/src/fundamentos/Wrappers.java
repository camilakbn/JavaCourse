package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		//Integer i = Integer.parseInt("10000"); se colocar esse código vai dar o mesmo valor do de cima
		Long l = 100000L;
		//transformou os tipos primitivos em classes colocando letra maiúscula no início
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
	}

}
