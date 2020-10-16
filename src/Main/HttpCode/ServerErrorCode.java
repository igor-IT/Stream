package Main.HttpCode;

public class ServerErrorCode implements HttpCode {
    @Override
    public void getCode() {
        System.out.printf("ServerErrorCode");
    }
}
