/*
 * Destination Constructor class *
 */
package airplane_program;

public class DestinationObject 
{
    String destination;     //String to store the location object
    int distance;           //int to store the distance from Dublin to [x] location
    
    //The constructor for the variables above//
    public DestinationObject (String dest, int dist)
    {
        destination = dest;
        distance = dist;
    }
}
