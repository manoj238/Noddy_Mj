package com.te.practicesession;

public class DuplicateDemo {

	public static void main(String[] args) {
		String string = "vivekvivekvivek";
		int len=string.length();
		char ch[] = string.toCharArray();
		int count=0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					count++;
					System.out.println("Duplicate ele is "+ch[j]);
					break;
				}
			}
		}
		System.out.println(count);
	}

}
