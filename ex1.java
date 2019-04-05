/*public class ex1 {
		int i = 0;
		public static void main(String args[]) {
			int i = 1;
			change_i(i);
			System.out.println(i);
		}
	public static void change_i(int i) {
			i = 2;
			i *= 2;
			
		}
	}*/
/*prints 1*/

-------------------------------------------------------------------------

/*public class ex1{
	int i[] = {0};
	public static void main(String args[]) {
		int i[] = {1};
		change_i(i);
		System.out.println(i[0]);
	}
	public static void change_i(int i[]) {
		i[0] = 2;
		i[0] *= 2;
 	}
}*/ 

/*prints 4*/
---------------------------------------------------------------------------------
public class ex1{
	int i[] = {0};
	public static void main(String args[]) {
		int i[] = {1};
		change_i(i);
		System.out.println(i[0]);
	}
	public static void change_i(int i[]) {
		int j[] = {2};
		i = j;
 	}
}
prints 1