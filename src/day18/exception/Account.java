package day18.exception;

import day12.modi.memper.pac1.E;

public class Account {

    private int balance; //잔액

    public Account(int balance) {
        this.balance = balance;
    }

    //출금 기능
    public void withDraw(int money) throws Exception{
        if (balance < money) {
            //throws 는 예외를 호출부에 던지는거
            // throw: 유발하다(raise), 발생하다
            throw new BalanceInsufficientException("잔액이 부족함!");

        }
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Account acc = new Account(1000);

        try {
            acc.withDraw(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("잔액: " + acc.getBalance());
        System.out.println("프로그램 정상 종료!");
    }
}
