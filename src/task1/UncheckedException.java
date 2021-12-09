package task1;

import java.util.List;

public class UncheckedException extends RuntimeException{
    private ErrorCode errorCode;

    public UncheckedException(final List<String> messages, final ErrorCode errorCode) {
        super(messages.toString());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
