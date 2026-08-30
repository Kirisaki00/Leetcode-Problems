class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int maxwrd = Math.max(word1.length(), word2.length());
        StringBuilder newWord = new StringBuilder();

        int i = 0;

        while (i < maxwrd) {
            if (i < word1.length()) {
                newWord.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                newWord.append(word2.charAt(i));
            }

            i++;
        }

        return newWord.toString();
    }
    public static void main(String[] args){
        System.out.println(mergeAlternately("abc", "12345"));
    }
}