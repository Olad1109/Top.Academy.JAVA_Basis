package initLearn.JNio;

import java.io.IOException;

class Main {

    public static void main (String[] argStrComm) throws IOException {
        // Открываем доступ к методам через метод main()
        CalculateHandler calculateHandler = new CalculateHandler();
        calculateHandler.start();
    }

}
