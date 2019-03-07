package design.SingLetonPattern;;
//单例模式

public class danliclass {
	private static danliclass einstance = new danliclass();

	private danliclass() {
	}

	public static danliclass getEintance() {
		return einstance;
	}


	private static danliclass dintance = null;

	public static synchronized danliclass getDintance() {
		if (dintance == null) {
			dintance = new danliclass();
		}
		return dintance;
	}


	private volatile static danliclass sintance = null;

	public static danliclass getSintance() {
		if (sintance == null) {
			synchronized (danliclass.class) {
				if (sintance == null) {
					sintance = new danliclass();
				}
			}
		}
		return sintance;
	}


	private static class singletonHolder {

		private static danliclass ssinstance=new danliclass();
		
	}
	public static danliclass getSSintance() {
		return singletonHolder.ssinstance;
	}

}
