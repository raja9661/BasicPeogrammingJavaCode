class Pattern3
{
    public static void main(String args[])
    {
        int n=14;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1) || i==1 && (j<(n-1)/2 || j>(n-1)/2) || i==2 && (j<(n-1)/2-1 || j>(n-1)/2+1) || i==3 && (j<(n-1)/2-2 || j>(n-1)/2+2) ||i==4 && (j<(n-1)/2-3 || j>(n-1)/2+3) ||i==5 && (j<(n-1)/2-4 || j>(n-1)/2+4)||i==6 && (j<(n-1)/2-5 || j>(n-1)/2+5))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
             for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1) || i==1 && (j<(n-1)/2 || j>(n-1)/2) || i==2 && (j<(n-1)/2-1 || j>(n-1)/2+1) || i==3 && (j<(n-1)/2-2 || j>(n-1)/2+2) ||i==4 && (j<(n-1)/2-3 || j>(n-1)/2+3) ||i==5 && (j<(n-1)/2-4 || j>(n-1)/2+4)||i==6 && (j<(n-1)/2-5 || j>(n-1)/2+5))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        
    }
    
}