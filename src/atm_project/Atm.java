package atm_project;

/*
Window 1: Enter pin:
    textField
    buttons ok and cancel:
        if ok -> validate pin (not empty)
            if not valid -> not valid, try again count++
                if count=3 -> quit app
            if valid -> go to window 2
        if cancel - > Bye, quit app
Window 2: choices:
    Buttons: check balance, withdraw and deposit, quit
        check balance win3
        withdraw win 4
        deposit win 4
        quit -> Bye, quit app
Window 3: balance
    Your balance Label
    Buttons: deposit - > win 4
             withdraw -> win 4
             back -> win 2
Window 4: deposit/withdraw
    Input field
    Result empty label
    Buttons ok - > call function dep/withdraw
            cancel -> win 2
 */
class Atm {
    public static void main(String[] args) {
        Account myAccount = new Account(1000);
        PinWin pinWin = new PinWin(myAccount);

        System.out.println();
    }

}