import java.util.*;
class Gusser
{
    int gussnum;
    int gussernum()
    {
     Scanner scan=new Scanner(System.in);
     System.out.println("guess any one number");
     gussnum=scan.nextInt();
     return gussnum;
    }

}
class Player
{
    int playernum;
    int playerguess()
    {
     Scanner scan=new Scanner(System.in);
     System.out.println("players please enter your guess number here");
     playernum=scan.nextInt();
     return playernum;
    }

}
class Umpire
{
    int gussernum1;
    int player1num;
    int player2num;
    int player3num;
    void collectfromgusser()
    {
        Gusser g=new Gusser();
        gussernum1=g.gussernum();
    }
    void collectfromplayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        player1num=p1.playerguess();
        player2num=p2.playerguess();
        player3num=p3.playerguess();
    }
    void compare()
    {
        if(gussernum1==player1num)
        {
            if(gussernum1==player2num && gussernum1==player3num)
            {
                System.out.println("all player guess is correct:");
            }
            else if(gussernum1==player2num)
            {
                System.out.println("player one and two is correct");
            }
            else if(gussernum1==player3num)
            {
                System.out.println("player one and two is correct");
            }
            else
            {
                System.out.println("player one is correct");
            }
        }    
            else if(gussernum1==player2num)
            {
                if(gussernum1==player3num)
                {
                    System.out.println("player two and three is correct");
                }
                else
                {
                    System.out.println("player two is correct");
                }

            }
            else if(gussernum1==player3num)
            {
                System.out.println("player three is correct");
            }
            else
            {
                System.out.println("all players guess wrong number please try again");
            }
        
    }
}
class Game
{
    public static void main(String args[])
    {
        Umpire u=new Umpire();
        u.collectfromgusser();
        u.collectfromplayer();
        u.compare();
    }
}