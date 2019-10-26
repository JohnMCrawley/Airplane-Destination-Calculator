/*
  * Airplane Constructor class *
 */
package airplane_program;

public class airplaneObject 
{
    String plane_type;      //String to store the plane type
    int plane_speed;        //int to store the speed of the plane
    int plane_range;        //int to store the range the plane can go
    
    //the airplane constructor
    public airplaneObject(String type, int speed, int range)
    {
        plane_type = type;
        plane_speed = speed;
        plane_range = range;
    }
    
    
            
}
