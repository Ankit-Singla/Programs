class PrintAlphabet {

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		int a = (int)'a';

		System.out.println("integer a: "+a);

		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int index = ((int)ch) - a;
			System.out.println(index);
		}
	}
}