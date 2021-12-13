//Задача 1
public class Lesson2 {
	 
// Задача 2
	 public static void main(String[] args) {
	        int i = 0;
	        int s = 0;
	        int n = 1;
	        for (; i <= 200; i++) {
	            if ((i % 10) == 0) {
	                s = (s + i);
	                n++;
	            }
	        }
	        System.out.println(s /(--n));
	    }
}