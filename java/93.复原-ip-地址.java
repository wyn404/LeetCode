/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> address = new ArrayList<>();
        doRestore(0, sb, address, s);
        return address;
    }
    private void doRestore(int k, StringBuilder sb, List<String> address, String s){
        if(k == 4 || s.length() == 0){
            if(k == 4 && s.length() == 0){
                address.add(sb.toString());
            }
            return;
        }
        for(int i = 0; i < s.length() && i <= 2; i++){
            if(i != 0 && s.charAt(0) == '0'){
                break;
            }
            String part = s.substring(0, i+1);
            if(Integer.valueOf(part) <= 255){
                if(sb.length() != 0){
                    part = "." + part;
                }
                sb.append(part);
                doRestore(k+1, sb, address, s.substring(i+1));
                sb.delete(sb.length() - part.length(), sb.length());
            }
        }
    }
}
// @lc code=end

