package question04;

public class SideAirBag extends CarAirBag{
	@Override
	public void airBagMotionDetection() {
		System.out.println("Motion detection on for Side Air Bag");
	}

	@Override
	public void airBagLightIndecator() {
		System.out.println("Light Indicator on for Side Air Bag");
	}
}
