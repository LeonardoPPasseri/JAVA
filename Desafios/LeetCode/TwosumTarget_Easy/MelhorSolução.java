package Desafios.LeetCode.TwosumTarget_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MelhorSolução {
    public static void main(String[] args) {
        int[] nums = {7,2,8};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                //Se nesse map tiver uma chave que seja o complemento do array escolhido
                
                //Depurar
                //0* map.containsKey(10 - 7) (3) (map -> null) false
                //map.put(nums[i],i) --> (map -> (7 , 0))

                //1* map.containsKey(10 - 2) (8) (map -> (7,0)) false
                //map.put(nums[i],i) --> (map -> (2 , 1))

                //2* map.containsKey(10 - 8) (2) (map -> (7,0) (2,1)) true
                //return new int[] {2, map.get(2)} --> {2,1}

                return new int[] { i,map.get(target - nums[i])};
            }
            
            map.put(nums[i],i);//Coloca todos os ValoresArrays(map chave) com suas posições(map valores)
        }
        return new int[0]; //Isso é usado caso não exista os numeros corretos.
    }
}
