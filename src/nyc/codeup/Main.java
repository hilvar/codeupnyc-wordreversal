package nyc.codeup;

public class Main {

    public static void main(String[] args) {
	    Stringwork stringWork = new Stringwork();
		Main.rev(stringWork);
    }

	private static void rev(Stringwork worker) {
    	String gobbledegook = worker.reverse("The school was closed");
    	System.out.println(gobbledegook);
	}
}
