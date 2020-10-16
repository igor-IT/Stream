package Main.HttpCode;

public class SuccessCode implements HttpCode {
    @Override
    public void getCode() {
        System.out.printf("SuccessCode");
    }
}
