package problems.easy.ransom_note;

class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        final var blank = "";
        if (ransomNote.equals(blank) && magazine.equals(blank)) return true;
        if (magazine.length() < ransomNote.length()) return false;
        for (var i = 0; i < ransomNote.length(); i++) {
            if (!magazine.contains(ransomNote.charAt(i)+blank)) {
                return false;
            } else {
                magazine = magazine.replaceFirst(blank+ransomNote.charAt(i), blank);
            }
        }
        return true;
    }
}
