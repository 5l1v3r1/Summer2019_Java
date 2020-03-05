package kendi_practicelerim;

public class retrunmethodpractice {
	public static void main(String[] args) {
		String[] arr = {"sdsds","ghghghg","ieieiei","vnjcvlfnv"};
		String ok = longest(arr);
		System.out.println(ok);
	}

	
	public static String longest(String[] arr) {
		String result = "";
		int max = 0;
		for(int i =0; i < arr.length;i++) {
			if(arr[i].length() > max) {
				max = arr[i].length();
				result = arr[i];
			}
		}
		return result;
	}
	
	
	
}
