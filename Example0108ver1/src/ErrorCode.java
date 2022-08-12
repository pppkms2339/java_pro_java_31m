public enum ErrorCode {
    Error1 (10, "Error1 description eng", "Error1 description rus"),
    Error2 (20, "Error2 description eng", "Error2 description rus");

    private int code;

    private String engDesc;

    private String rusDesc;

    ErrorCode(int code, String engDesc, String rusDesc) {
        this.code = code;
        this.engDesc = engDesc;
        this.rusDesc = rusDesc;
    }

    public int getCode() {
        return code;
    }

    public String getEngDesc() {
        return engDesc;
    }

    public String getRusDesc() {
        return rusDesc;
    }
}
