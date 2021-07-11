import jdk.jshell.execution.Util;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean loopFlag = true;//是否退出程序
        char choice; //选择的选项
        int balance = 10000;//账户余额;
        String details = "收支\t账户金额\t收支金额\t说  明\n";
        while(loopFlag){
            System.out.println("------------------------------家庭收支记账软件------------------------------");
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t 1 收支明细  \t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t 2 登记收入  \t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t 3 登记支出  \t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t 4 退   出  \t\t\t\t\t\t\t");
            System.out.println();
            System.out.print("\t\t\t\t\t\t\t 请选择(1-4):");
            choice = Utility.readMenuSelection();
            switch (choice){
                case '1':
                    System.out.println(details);
                    break;
                case '2':
                    System.out.print("本次收入金额:");
                    int receive = Utility.readNumber();
                    System.out.print("本次收入说明:");
                    String description = Utility.readString();
                    balance += receive;
                    details+="收入\t"+balance+"\t"+receive+"\t\t"+description+"\n";
                    break;
                case '3':
                    System.out.print("本次支出金额:");
                    int takeout = Utility.readNumber();
                    System.out.print("本次支出说明:");
                    String description2 = Utility.readString();
                    balance -= takeout;
                    details+="收入\t"+balance+"\t"+takeout+"\t\t"+description2+"\n";
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N):");
                    char choiceExit = Utility.readConfirmSelection();
                    if(choiceExit=='y'||choiceExit=='Y') loopFlag = false;
                    else loopFlag = true;
                    break;
            }
        }
    }
}
