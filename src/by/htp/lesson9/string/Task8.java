package by.htp.lesson9.string;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		String s ="Удалить из текста его часть, !заключенную! между двумя символами, которые вводятся между !";
		String[] parts =s.split("!");
		System.out.println(Arrays.toString(parts));
		
	}
	//доп. посчитать кол. объктов(не ссылок) типа String

}
