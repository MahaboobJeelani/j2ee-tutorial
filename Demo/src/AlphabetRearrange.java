////import java.lang.invoke.MethodHandles.Lookup.ClassOption;
//
////public class AlphabetRearrange {
////    public static void main(String[] args) {
////        String alphabet = "abcdefghjiklmnopqrstuvwxyz";
////        char[] rearrangedAlphabet = alphabet.toCharArray();
////        Arrays.sort(rearrangedAlphabet);
////        
////        String result = new String(rearrangedAlphabet);
////        System.out.println(result);
////    }
//public class AlphabetRearrange {
//	static String order(char[] a) {
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					char temp = a[i];
//					a[i]= a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		return new String(a);
//	}
//	public static void main(String[] args) {
//		String s = "kjfdkj";
//		char[] c = s.toCharArray();
//		System.out.println(order(c));
//	}
//}
//
////public class AlphabetRearrange {
////	public static String order(char[] a) {
////		for(int i=0; i<a.length; i++) {
////			for(int j=i+1; j<a.length; i++) {
////				if(a[i]>a[j]) {
////					char temp = a[i];
////					a[i]=a[j];
////					a[j]=temp;
////				}
////			}
////		}
////		return new String(a);
////	}
////	public static void main(String[] args) {
////		String s = "kjfdkj";
////		char[] c = s.toCharArray();
////		System.out.println(order(c));
////		
////	}
////}