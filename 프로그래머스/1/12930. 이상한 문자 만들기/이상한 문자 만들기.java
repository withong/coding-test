class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            
            if (letter == ' ') {
                index = 0;
                sb.append(letter);
                continue;
            }

            if (index % 2 == 0) {
                sb.append(Character.toUpperCase(letter));
            } else {
                sb.append(Character.toLowerCase(letter));
            }
            index++;
        }
        return sb.toString();
    }
}