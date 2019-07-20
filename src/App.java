
public class App {	//9-11

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger intro = new AsteriskLogger();
		intro.Log(new StringBuilder("Hello"));
		intro.Error(new StringBuilder("Hello"));
		intro.Log(new StringBuilder("See You Later!"));
		intro.Error(new StringBuilder("This is wrong!"));
		Logger intro2 = new SpacedLogger();
		intro2.Log(new StringBuilder("Hello"));
		intro2.Error(new StringBuilder("Hello"));
		intro2.Log(new StringBuilder("Spaces"));
		intro2.Error(new StringBuilder("Goodbye!"));
	}

}
