package InClassAssignments.Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(4, 1,3,2);
    }

    public static void toh(int n, int source_rod, int destination_rod, int helper_Rod) {
//        base case
        if(n ==0 ) {
            return;
        }

//        work and faith
        toh(n-1, source_rod, helper_Rod, destination_rod);
        System.out.println("disk is moving " + n + " source rod " + source_rod + " destination rod " + destination_rod);
        toh(n-1, helper_Rod, destination_rod, source_rod);

    }

}


/*import java.util.*;

class Main
{
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println(n+":"+ from_rod + "->" + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println(n+":"+ from_rod + "->" + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}*/
