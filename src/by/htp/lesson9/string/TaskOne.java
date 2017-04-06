package by.htp.lesson9.string;


public class TaskOne {
	public static void main(String[] args) {
		int k=10;
		char c= 'A';
		String s = "В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.";
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length;i++){
			if(s1[i].length()>k){
				//Заменить k-й символ
				 char r =s1[i].charAt(k);
				 s1[i]=s1[i].replace(r, c);
				//System.out.print(s1[i]);
			}
			System.out.print(s1[i].toString()+" ");
		}
	}
}
