class Test
{
    

    void display(int arr[])
    { 

        for(int i:arr)
        {
        System.out.println(i);
        }
    }
    
}
class Demo
{
    public static void main(String args[])
    {
        Test t=new Test();
        t.display(new int[]{1,2,3,4,5});
    }
}