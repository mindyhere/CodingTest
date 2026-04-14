class Solution {
    public String solution(String phone_number) {
        String reversed = new StringBuilder(phone_number).reverse().toString();
        String s1 = reversed.substring(0,4);
        String s2 = reversed.substring(4).replaceAll("[0-9]", "*");
        reversed = s1 + s2;
        String answer = new StringBuilder(reversed).reverse().toString();

        return answer;
    }
}