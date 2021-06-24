public class loops {
		public static void main(String[] args) {
		       int int_leap;
		        for (int_leap=1990; int_leap<=2020; int_leap++){
		              if( int_leap % 4 != 0) {
		                 continue;
		              }   
		               System.out.println("The leap Year: " + int_leap);
		        }   
		}
}