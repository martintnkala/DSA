package strings.uniquestringwithextradsa;

import java.util.HashSet;
import java.util.Set;

public class UniqueStringWithExtraDsa {

    public static boolean isUniqueWithExtraDsa(String str) {
        Set<Character> seen = new HashSet<>();
        for (char s : str.toLowerCase().strip().toCharArray()) {
            if (seen.contains(s))return false;
            seen.add(s);
        }
        return true;
    }
}
