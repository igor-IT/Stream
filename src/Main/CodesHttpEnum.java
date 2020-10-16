package Main;

import Main.HttpCode.*;

import java.util.Arrays;

public enum CodesHttpEnum {
    HTTP_INFORMATION(100, 199, new InformationCode()),
    HTTP_SUCCESS(200, 299, new SuccessCode()),
    HTTP_REDIRECTION(300, 399, new RedirectionCode()),
    HTTP_CLIENT_ERROR(400, 499, new ClientErrorCode()),
    HTTP_SERVER_ERROR(500, 599 , new ServerErrorCode());

    private final int min;
    private final int max;
    private final HttpCode code;

    CodesHttpEnum(int min, int max, HttpCode code) {
        this.code = code;
        this.max = max;
        this.min = min;
    }
    public static void findByCode(int code){
        CodesHttpEnum[] codesHttpEnum = values();
        CodesHttpEnum httpEnum =  Arrays.stream(codesHttpEnum).filter(f -> code >= f.min && code <= f.max).findFirst().get();
        httpEnum.code.getCode();
    }
}
