package Main.HttpCode;

public class ClientErrorCode implements HttpCode {
    @Override
    public void getCode() {
        System.out.printf("ClientErrorCode");
    }
}