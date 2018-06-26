package com.ruslanito.Core.Core_String_Char;

/**
 * Created by Ruslanito on 24.02.2017.
 */
public class Srting_Summ {
	public static void main(String[] args) {
		String s1 = "Сложение ";
		String s2 = "строк";
		String s3 = s1 + s2;
		System.out.println("Сложение строк суммированием: " + s3);

		System.out.println("StringBuffer ()");
		StringBuffer s = new StringBuffer();
		s.append("Hello ");
		s.append("World!");
		String s4 = s.toString();
		System.out.println("StringBuffer () " + s4);

		System.out.println("concat()");
		String s5 = "РџРµСЂРІР°СЏ СЃС‚СЂРѕРєР° ";
		String s6 = s5.concat("Р’С‚РѕСЂР°СЏ СЃС‚СЂРѕРєР°");
		System.out.println("concat() " + s6);
		System.out.println(s5.concat("Р’С‚РѕСЂР°СЏ СЃС‚СЂРѕРєР°"));
	}

}
