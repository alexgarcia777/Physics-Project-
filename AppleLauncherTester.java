
/**
 *Tester for AppleClass.
 *
 * Alexander Garcia
 * 11/26/2018
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
