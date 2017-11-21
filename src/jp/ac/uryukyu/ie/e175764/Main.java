package jp.ac.uryukyu.ie.e175764;

public class Main {
    public static void main(String[] args){
        String str = null;
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException error) {
            System.out.println("NullPointerException is occurring");
            System.out.println(error.getMessage());
        }
        }


}
