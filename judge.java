package code;

public class judge
{
    public void reward(int count[])
    {
        int i,ret;
        switch(count[4])
        {
            case 6:
                System.out.println("你获得了六博红奖项！！！");
                break;
            case 5:
                System.out.println("你获得了五王！！！");
                break;
            case 4:
                if(count[1] == 2)
                    System.out.println("你获得了状元插金花！！！");
                else
                    System.out.println("你获得了状元！！！");
                break;
            case 3:
                System.out.println("你获得了三红！！！");
                break;
            case 2:
                i = 1;ret = 0;
                while(i < 7)
                {
                    if(i != 4)
                    {
                        if(count[i] == 4)
                        {
                            ret = 1;
                            break;
                        }
                    }
                    i++;
                }
                if(ret == 1)
                {
                    System.out.println("你获得了四进带二举！！！");
                }
                else
                {
                    System.out.println("你获得了二举！！！");
                }
                break;
            case 1:
                i = 2;
                ret = count[1];
                while(i < 7)
                {
                    if(i != 4)
                    {
                        ret = Math.max(ret, count[i]);
                    }
                    i++;
                }
                switch(ret)
                {
                    case 5:
                        System.out.println("你获得了五子登科带一秀！！！");
                        break;
                    case 4:
                        System.out.println("你获得了四进带一秀！！！");
                        break;
                    case 1:
                        System.out.println("你获得了对堂！！！");
                        break;
                    default:
                        System.out.println("你获得了一秀！！！");
                        break;
                }
                break;
            default:
                i = 2;
                ret = count[1];
                while(i < 7)
                {
                    if(i != 4)
                    {
                        ret = ret>count[i]?ret:count[i];
                    }
                    i++;
                }
                switch(ret)
                {
                    case 6:
                        System.out.println("你获得了六博黑！！！");
                        break;
                    case 5:
                        System.out.println("你获得了五子登科！！！");
                        break;
                    case 4:
                        System.out.println("你获得了四进！！！");
                        break;
                    default:
                        System.out.println("很遗憾，你没有获奖！！！");
                        break;
                }
                break;
        }// end switch
    }
}
