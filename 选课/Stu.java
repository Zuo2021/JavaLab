package code;

public class Stu
{
    public Course course = new Course();

    private String id;
    private String name;
    private int classroom;
    private String phone;

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
    public int getClassroom()
    {
        return classroom;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setPhone()
    {

    }
    public void setPhone(String s)
    {
        phone = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setClassroom(int n)
    {
        classroom = n;
    }

}
