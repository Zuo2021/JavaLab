package code;

public class Main
{
    public static void main(String[] args)
    {
        int i,cnt;
        primer p = new primer();
        cnt = 0;
        for(i=2;i<10000;i++)
        {
            if(p.judge_senior(i)==1)
            {
                ++cnt;
                System.out.printf("%4d ",i);
                if(cnt%39==0)
                    System.out.printf("\n");
            }
        }
        System.out.printf("\n有%d个素数",cnt);
    }
}
