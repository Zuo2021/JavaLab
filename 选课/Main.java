package code;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Stu[] student = new Stu[2];

        int i,n;
        for(i=0;i<2;i++)
        {
            System.out.println("input student information:");
            student[i] = new Stu();
            input(student[i]);
        }

        System.out.println("\nthere are two student");
        for(i=0;i<2;i++)
        {
            System.out.println("name:"+student[i].getName());
            System.out.println("id:"+student[i].getId());
            System.out.println("classroom:"+student[i].getClassroom());
            System.out.println("phone:"+student[i].getPhone());
            System.out.printf("\n");
        }


        System.out.println("接下来是选课，以下为课程信息：");
        System.out.println("课程号：0      课程名称：physics");
        System.out.println("课程号：1      课程名称：math");
        for(i=0;i<2;i++)
        {
            System.out.printf("请为第%d名学生选课，只能能选一门\n",i+1);
            select(student[i]);
        }

        System.out.println("以下为选课结果：");
        for(i=0;i<2;i++)
        {
            System.out.println(student[i].getName()+":");
            student[i].course.getCourse();
        }
    }


    public static void input(Stu student)
    {
        String s;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("name:");
        s = sc.next();student.setName(s);
        System.out.printf("id:");
        s = sc.next();student.setId(s);
        System.out.printf("classroom:");
        n = sc.nextInt();student.setClassroom(n);
        System.out.printf("phone:");
        s = sc.next();student.setPhone(s);

    }

    public static void select(Stu student)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        student.course.selectCourse(n);
    }
}
