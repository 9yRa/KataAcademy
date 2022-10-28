import java.util.Arrays;
import java.util.Scanner;

public class TestMain<arr> {

    private static String MathStr(String operation, String num1, String num2){
        int iNum1 = Integer.parseInt(num1);
        int iNum2 = Integer.parseInt(num2);

        switch(operation){
            case "+" :
                return "" + (iNum1+iNum2);
            case "-" :
                return "" + (iNum1-iNum2);
            case "*" :
                return "" + (iNum1*iNum2);
            case "/" :
                return "" + (iNum1/iNum2);
        }
        return "ERROR 011";
    }

    private static int MathInt(String operation, int num1, int num2) {
        switch (operation) {
            case "+":
                return (num1 + num2);
            case "-":
                if ((num1 - num2) > 0)
                    return (num1 - num2);
                else
                    try {
                        throw new MyException();
                    } catch (MyException e) {
                        System.out.println("No - rum number");
                    }
                break;
            case "*":
                return (num1 * num2);
            case "/":
                return (num1 / num2);
        }
        return -1;
    }

    private static int ChangeRumStrInt(String num) {
        switch (num) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        return 0;
    }

    private static String ChangeRumIntStr(int num) {
        char[] number = new char[8];
        int key1 = num / 10;
        int key2 = num % 10;
        switch (key1) {
            case 1:
                number[0] = 'X';
                break;
            case 2:
                number[0] = 'X';
                number[1] = 'X';
                break;
            case 3:
                number[0] = 'X';
                number[1] = 'X';
                number[2] = 'X';
                break;
            case 4:
                number[0] = 'X';
                number[1] = 'L';
                break;
            case 5:
                number[0] = 'L';
                break;
            case 6:
                number[0] = 'L';
                number[1] = 'X';
                break;
            case 7:
                number[0] = 'L';
                number[1] = 'X';
                number[2] = 'X';
                break;
            case 8:
                number[0] = 'L';
                number[1] = 'X';
                number[2] = 'X';
                number[3] = 'X';
                break;
            case 9:
                number[0] = 'X';
                number[1] = 'C';
                break;
            case 10:
                number[0] = 'C';
                break;
            default:
                break;
        }
        switch (key2) {
            case 1:
                number[4] = 'I';
                break;
            case 2:
                number[4] = 'I';
                number[5] = 'I';
                break;
            case 3:
                number[4] = 'I';
                number[5] = 'I';
                number[6] = 'I';
                break;
            case 4:
                number[4] = 'I';
                number[5] = 'V';
                break;
            case 5:
                number[4] = 'V';
                break;
            case 6:
                number[4] = 'V';
                number[5] = 'I';
                break;
            case 7:
                number[4] = 'V';
                number[5] = 'I';
                number[6] = 'I';
                break;
            case 8:
                number[4] = 'V';
                number[5] = 'I';
                number[6] = 'I';
                number[7] = 'I';
                break;
            case 9:
                number[4] = 'I';
                number[5] = 'X';
                break;
        }
        char[] ss=new char[8];
        int k=0;
        for(int i=0;i<8;i++) {
            if (number[i] == 'I' || number[i] == 'X' || number[i] == 'V' || number[i] == 'L' || number[i] == 'C') {
                ss[k] = number[i];
                k++;
            }
        }
        char[] ss1 = Arrays.copyOfRange(ss, 0, k);
        return String.copyValueOf(ss1);
    }

    private static boolean CheckNumInt(String... arr){

        boolean check1 = true;
        boolean check2 = true;

        if(arr[0].equals("1")||arr[0].equals("2")||arr[0].equals("3")||arr[0].equals("4")||arr[0].equals("5")||arr[0].equals("6")||arr[0].equals("7")||arr[0].equals("8")||arr[0].equals("9")||arr[0].equals("10")){
            if (!(arr[2].equals("1")||arr[2].equals("2")||arr[2].equals("3")||arr[2].equals("4")||arr[2].equals("5")||arr[2].equals("6")||arr[2].equals("7")||arr[2].equals("8")||arr[2].equals("9")||arr[2].equals("10")))
                check1=false;
        }
        else
            check2=false;
        return check1&&check2;
    }

    private static boolean CheckNumRum(String[] arr){

        boolean check1 = true;
        boolean check2 = true;

        if (arr[0].equals("I") || arr[0].equals("II") || arr[0].equals("III") || arr[0].equals("IV") || arr[0].equals("V") || arr[0].equals("VI") || arr[0].equals("VII") || arr[0].equals("VIII") || arr[0].equals("IX") || arr[0].equals("X")) {
            if (!(arr[2].equals("I") || arr[2].equals("II") || arr[2].equals("III") || arr[2].equals("IV") || arr[2].equals("V") || arr[2].equals("VI") || arr[2].equals("VII") || arr[2].equals("VIII") || arr[2].equals("IX") || arr[2].equals("X"))) {
                check1 = false;
            }
        } else {
            check2 = false;
        }
        if((check1==true&&check2==false)||(check1==false&&check2==true)){
            try{
                throw new MyException();
            }catch (MyException e) {
                System.out.println("False number");
            }
        }
        return check1&&check2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String list = scan.nextLine();
        String[] arr = list.split(" ");
        if(arr.length<3)
            try{
                throw new MyException();
            }catch (MyException e) {
                System.out.println("Math not operation");
            }
        else if(!(arr.length==3))
            try{
                throw new MyException();
            }catch (MyException e) {
            System.out.println("More math operation");
            }
        else if (CheckNumInt(arr))
            System.out.println(MathStr(arr[1],arr[0],arr[2]));
        else if(CheckNumRum(arr))
            System.out.println(ChangeRumIntStr(MathInt(arr[1],ChangeRumStrInt(arr[0]),ChangeRumStrInt(arr[2]))));
    }

}
