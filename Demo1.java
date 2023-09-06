class Demo1
{
    public static void main(String args[])
    {
        int arr[]={2,4,6,8};
        System.out.println("traversing using index values:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("traversing using for loop:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("traversing using for each loop:");
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}