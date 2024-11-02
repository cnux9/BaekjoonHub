class Solution {
    public String solution(String phone_number) {
        String back_number = phone_number.substring(phone_number.length()-4);
        return "*".repeat(phone_number.length()-4)+back_number;
    }
}