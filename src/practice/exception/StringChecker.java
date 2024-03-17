package practice.exception;

public class StringChecker {

    void CheckStringLength(String str) throws CustomException {
        if (str.length() != 3)
            throw new CustomException("이름은 세글자이어야만 합니다.");
    }
}
