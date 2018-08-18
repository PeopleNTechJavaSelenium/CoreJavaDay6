package staticvariable;

public class TestDriveWay {

	public static void main(String[] args) {

		DriveWay  kiran = new DriveWay();
		kiran.driveWaySize = 10 ;
		System.out.println(kiran.driveWaySize);
		
		DriveWay  luis = new DriveWay();
		luis.driveWaySize = 12 ;
		System.out.println(luis.driveWaySize);
		
		System.out.println(kiran.driveWaySize);
	}

}
