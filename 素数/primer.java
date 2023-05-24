package code;

public class primer
{
    public int judge_junior(int n)//1 refer to primer
    {
        switch (n)
        {
            case 2:
            case 3:
                return 1;
            default:
                int i = 0;
                for (i = 2; i <= n / 2; i++) {
                    if (n % i == 0)
                        return 0;
                }
                return 1;
        }
    }
    public int judge_senior(int n)//1 refer to primer
    {
        switch(n)
        {
            case 2:
            case 3:
                return 1;
            default:
                int i=0;
                double square=Math.sqrt(n);
                for(i=2;i<=square;i++)
                {
                    if(n%i==0)
                        return 0;
                }
                return 1;
        }
    }
}
