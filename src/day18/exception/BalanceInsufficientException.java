package day18.exception;

public class BalanceInsufficientException extends Exception{
    //관례상 누가 봐도 예외 클래일 수 있도록 끝에는 꼭 Exception 적기
    //잔액이 충분하지 않은 에러라는 뜻


    public BalanceInsufficientException() {
    }

    //에러 원인메세지를 super 에 보내서 에러를 볼 수 있다.
    public BalanceInsufficientException(String message) {
        super(message);
    }
}
