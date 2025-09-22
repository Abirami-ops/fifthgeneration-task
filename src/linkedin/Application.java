package linkedin;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException, InterruptedException {
		LoginPage.emptyPassword();
		LoginPage.invalidPassword();
		LoginPage.validPassword();
	}

}
