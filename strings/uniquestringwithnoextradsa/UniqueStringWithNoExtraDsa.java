package strings.uniquestringwithnoextradsa;

public class UniqueStringWithNoExtraDsa {
    public static boolean isUnique(String str) {
        str = str.toLowerCase().strip();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
