package grade_6kyu;

import java.util.HashSet;
import java.util.Set;

public class DetectPangram {

	public static void main(String[] args) {

		DetectPangram o = new DetectPangram();

		System.out.println(o.check("The quick brown 1212fox jumps over the lazy dog"));
	}

	public boolean check(String sentence) {
		Set<Character> set = new HashSet<>();
		sentence = sentence.toLowerCase();
		sentence = sentence.replaceAll("[^a-z]", "");
		sentence = sentence.trim();

		for (int n = 0; n < sentence.length(); n++) {
			set.add(sentence.charAt(n));
		}
		if (set.size() < 26) {
			return false;
		}
		return true;
	}

}
