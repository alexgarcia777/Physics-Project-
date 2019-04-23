

/**
 * Catapult Trajectory
 *
 * @ Aleaxander Garcia
 * @ January 1, 2019
 */
public class AppleLauncherTester
{
        public static void main (String []args){
        AppleLauncher launched= new AppleLauncher();
        System.out.println(launched.toString());
        System.out.println("****************** Projectile Distance (in ft.) ******************");
        System.out.println();
        launched.calculateDistance();
        System.out.println();
        System.out.println("******************************************************************");
    }
}
