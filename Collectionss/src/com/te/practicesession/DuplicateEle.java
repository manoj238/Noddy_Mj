package com.te.practicesession;

public class DuplicateEle {

	public static void main(String[] args) {
		String string = "manunatsafsahf";
		int k=0;
		char ch[] = string.toCharArray();
		for (int i = 0; i < string.length()-k; i++) {
			for (int j = i+1; j < string.length()-k; j++) {
				if(ch[i]==ch[j]) {
					char temp = ch[j];
					ch[j] = ch[string.length()-k-1];
					ch[string.length()-k-1] = temp;
					k++;
					j--;
				}
			}
		}
		System.out.println("Total dupilcate charecters :"+k);
		System.out.println("Original charecter :" +string);
		System.out.print("After Duplicate charecters are : ");
		for(int i=0;i<string.length()-k;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.print("Duplicate elements are : ");
		for (int i = string.length()-k; i < string.length(); i++) {
			System.out.print(ch[i]);
		}
	}
}
