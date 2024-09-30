package Desafios.LeetCode.TwosumTarget_Easy;

import java.util.Arrays;
/* 
Procurar no array uma soma entre dois numeros que
de exatamente o numero na variavel "target" 
*/
public class Solução {
    public static void main(String[] args) {
        int[] nums = {7,2,8};
        int target = 10;

        int[] resposta = twoSum(nums, target);
        System.out.println(Arrays.toString(resposta));
    }
    //resposta 1
    public static int[] twoSum(int[] nums, int target) {
        int teste;
        int[] corretos = new int[2];
        for(int j = 0;j<=nums.length-1;j++){
            for(int i=j+1;i<nums.length;i++){
                teste = nums[j] + nums[i];
                if(teste == target){
                    corretos[0] = i;
                    corretos[1] = j;
                }
            }
        }
        return corretos;
    }
    //resposta 2
    public static int[] twoSum2(int[] nums, int target) {
        int teste;
        int[] corretos = new int[2];
        for(int j = 0;j < nums.length;j++){
            teste = target - nums[j];
            for (int i = 0; i < nums.length; i++) {
                if(i != j && nums[i] == teste){
                    corretos[0] = i;
                    corretos[1] = j;
                }
            } 
        }
        return corretos;
    }
}
