class Solution {

    public String solution(String phone_number) {
        int length = phone_number.length();
        int setLength = length - 4;

        StringBuilder stringBuilder = new StringBuilder(phone_number);

        for (int i = 0; i < setLength; i++) {
            stringBuilder.setCharAt(i, '*');
        }

        String answer = stringBuilder.toString();
        return answer;
    }
}