package code;

import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] numbers = new int[6];
        int[] count = new int[7];

        judge x = new judge();

        int i;

        for (i = 0; i < 6; i++)
            numbers[i] = random.nextInt(6) + 1;
        //nextInt()，左闭右开

        System.out.print("你摇到的6个骰子数为：");

        for (i = 0; i < 6; i++)
            System.out.print(numbers[i] + " ");//打印6个骰子数

        System.out.print("\n");

        for(i = 1; i < 7; i++)
            count[i] = 0;//初始化count数组

        for(i = 0; i < 6; i++)
            count[numbers[i]]++;//将每个数字有几个记录下来

        x.reward(count);//调用judge的reward函数来判断奖项
    }
}
