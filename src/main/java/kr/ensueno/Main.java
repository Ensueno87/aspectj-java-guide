package kr.ensueno;

import kr.ensueno.annotation.EnsuenoLog;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.myLog();
    }

    @EnsuenoLog
    public void myLog(){
        System.out.println("My Log Demo");
    }

}
