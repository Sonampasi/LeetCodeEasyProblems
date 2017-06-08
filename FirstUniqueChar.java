/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Time Complexity: O(n)
 */
public class FirstUniqueChar {

	public int firstUniqChar(String s) {
		boolean[] v = new boolean[s.length()];

		for (int i = 0; i < s.length() && v[i] != true; i++) {
			if (v[i] == true) {
				continue;
			}
			for (int j = i + 1; j < s.length(); j++) {
				if (v[j] == true) {
					continue;
				}
				if (s.charAt(i) == s.charAt(j)) {
					v[i] = true;
					v[j] = true;
				}
			}
		}
		int k = 0;
		while (k < v.length) {
			if (v[k] == false) {
				return k;
			}
			k++;
		}
		return -1;
	}

	public static void main(String[] args) {
		FirstUniqueChar obj = new FirstUniqueChar();
		int index = obj.firstUniqChar("leetl");
		System.out.print(index);
	}

}
