package code;

import java.util.Random;

public class Course
{
    public int courseID;
    public int grade;
    public class physics
    {
        public int id = 0;
        public String name = "physics";
    }

    public class math
    {
        public int id = 1;
        public String name = "math";

    }

    public void selectCourse(int n)
    {
        courseID = n;
        Random random = new Random();
        grade = random.nextInt(101);
    }


    public int getCourseID()
    {
        if(courseID==0)
            return 0;
        else
            return 1;
    }

    public String getCourseName()
    {
        if(courseID==0)
            return "physics";
        else
            return "math";
    }

    public void getCourse()
    {
        System.out.println("课程号是："+getCourseID());
        System.out.println("课程名称是："+getCourseName());
        System.out.println("课程成绩是："+grade);
    }
}
