package strings;

import static strings.uniquestringwithextradsa.UniqueStringWithExtraDsa.isUniqueWithExtraDsa;
import static strings.uniquestringwithnoextradsa.UniqueStringWithNoExtraDsa.isUnique;

public class Main {
    public static void main(String[] args) {
        // This has a TIME complexity of O(n-squared) due to the nested for loops
        System.out.println(isUnique("AaBbCc"));

        // This has TIME complexity of O(n) due to the single for loop
        System.out.println(isUniqueWithExtraDsa("AaBbCc"));
    }
}
