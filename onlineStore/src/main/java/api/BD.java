package api;

public class BD
{
    private String total;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+"]";
    }
}
		
