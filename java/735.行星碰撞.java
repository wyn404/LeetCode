import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=735 lang=java
 *
 * [735] 行星碰撞
 */

// @lc code=start
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length == 0){
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int flag = 1;
        for (int i = 0; i < asteroids.length; i++) {
            flag = 1;
            if(asteroids[i] > 0){
                deque.add(asteroids[i]);
            }
            else{
                while(!deque.isEmpty()){
                    if(asteroids[i] + deque.peekLast() > 0){
                        break;
                    }
                    else if(asteroids[i] + deque.peekLast() == 0){
                        deque.pollLast();
                        flag = 0;
                        break;
                    }
                    else{
                        deque.pollLast();
                    }
                }
                if(deque.isEmpty() && flag == 1){
                    list.add(asteroids[i]);
                }
            }
        }
        while(!deque.isEmpty()){
            list.add(deque.pollFirst());
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
// @lc code=end

