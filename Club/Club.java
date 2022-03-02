import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    public static ArrayList<Membership> clublist = new ArrayList<>();
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...

    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        clublist.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {   
        return clublist.size();
    }

    /**
     * Determinar el número de miembros que se han unido en 
     * el mes indicado
     * @param month El mes que nos interesa
     * @return El número de miembros que se han unido es mes
     */

     public static int joinedMonth(int month){
        int contador = 0;
        if(month >12 || month<1){
            System.out.println(month +" esta fuera de rango");
            return 0;
        }else{
            for(Membership m1:clublist){
                if(m1.getMonth() == month){
                    contador++;
                }
            }
        }
        return contador;
     }

     public static int purge(int month){
        Iterator<Membership> it = clublist.iterator();
        int contador = 0;
        while(it.hasNext()){
            Membership m1 = it.next();
            if(m1.getMonth()==month){
                it.remove();
                contador++;
            }
        }
        return contador;
     }
}