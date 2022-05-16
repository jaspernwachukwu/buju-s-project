import java.util.Scanner;

public class Nokia22 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        mainMenu();

        int user = input.nextInt();
        mainMenu(user);

    }

    private static void simMenu() {
        System.out.println("""
                1) SIM services
                2)main menu
                """);
        Scanner input = new Scanner(System.in);
     int   user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("SIM services");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                   simMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;

        }

    }

    private static void profileMenu() {
        System.out.println("""
                1)profiles
                2) main menu
                """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("profiles");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                   profileMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;
        }
    }

    private static void clockMenu() {
        System.out.println("""
                1)alarm clock
                2)clock settings
                3)date settings
                4)stopwatch
                5)countdown timer
                6)auto update of date and time
                7) main menu
                """);
        Scanner input = new Scanner(System.in);
       int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("alarm clock");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    clockMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("clock settings");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    clockMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("date settings");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    clockMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                System.out.println("stopwatch");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    clockMenu();
                    user = input.nextInt();
                }
                break;
            case 5:
                System.out.println("countdown timer");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    clockMenu();
                    user = input.nextInt();
                }
                break;
            case 6:
                System.out.println("auto update of date and time");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    clockMenu();
                    user = input.nextInt();
                }
                break;
            case 7:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;
        }
    }

    private static void reminderMenu() {
        System.out.println("""
                1) reminders
                2) main menu
                """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("reminders");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    reminderMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;
        }
    }

    private static void calculatorMenu() {
        System.out.println("""
                1) calculator
                2) main menu
                """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("caculator");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    calculatorMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;
        }
    }

    private static void gamesMenu() {
        System.out.println("""
                1) games
                2) main menu
                """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("games");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
            gamesMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;
        }
    }
    private static void callDivertMenu() {
        System.out.println("""
                1) call divert
                2) main menu
                """);
       Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("call divert");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callDivertMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;
        }
    }

    private static void settingsMenu() {
        System.out.println("""
                1) call settings
                2) phone settings
                3)security settings
                4) restore factory settings
                5) main menu
                    """);
        Scanner input = new Scanner (System.in);
       int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("call settings");

                callSettingMenu();

                break;
            case 2:
                phoneSettingsMenu();


                break;

            case 3:
                securitySettingsMenu();

                break;
            case 4:
                System.out.println("restore factory settings");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    settingsMenu();
                    user = input.nextInt();
                }
                break;
            case 5:

                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;

        }
    }

    private static void securitySettingsMenu() {
        System.out.println("""
                        1)PIN code request
                        2)call barring service
                        3)fixed dialling
                        4)closed user group
                        5)phone security
                        6)change access codes 
                        7) back
                        """);
        Scanner input = new Scanner(System.in);
       int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("PIN code request");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    securitySettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("call barring service");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                   securitySettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("fixed dialling");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                   securitySettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                System.out.println("closed user group");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    securitySettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 5:
                System.out.println("phone security");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                   securitySettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 6:
                System.out.println("change access codes");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    securitySettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 7:
                settingsMenu();
                break;
        }
    }

    private static void phoneSettingsMenu() {
        System.out.println("""
                        1) language
                        2)cell info display
                        3)welcome note
                        4) network selection
                        5)lights
                        6)confirm SIM service actions
                        7) back
                        """);
        Scanner input = new Scanner(System.in);
       int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("language");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phoneSettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("cell info display");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phoneSettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("welcome note");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phoneSettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                System.out.println("network selection");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phoneSettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 5:
                System.out.println("phone line in use");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phoneSettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 6:
                System.out.println("confirm SIM service actions");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phoneSettingsMenu();
                    user = input.nextInt();
                }
                break;
            case 7:
                settingsMenu();
                break;

        }
    }

    private static void callSettingMenu() {
        System.out.println("""
                        1)automatic redial
                        2)speed dialling
                        3)call waiting options
                        4)own number sending
                        5) phone line in use 
                        6) automatic answer
                        7) back
                        """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("automatic redial");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callSettingMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("speed dialling");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callSettingMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("call waiting options");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callSettingMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                System.out.println("own number sending");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callSettingMenu();
                    user = input.nextInt();
                }
                break;
            case 5:
                System.out.println("phone line in use ");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callSettingMenu();
                    user = input.nextInt();
                }
                break;
            case 6:
                System.out.println("automatic answer");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callSettingMenu();
                    user = input.nextInt();
                }
                break;
            case 7:
              settingsMenu();
              break;
        }
    }

    private static void toneMenu() {
        System.out.println("""
                 1) ringing tone
                 2) ringing volume
                 3)incoming call alert
                 4) composer 
                 5) message alert tone
                 6) keypad tones
                 7) warning and game tones
                 8) vibrating alert
                 9) screen saver 
                 10) main menu
                """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("ringing tone");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    toneMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("ringing volume");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    toneMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("incoming call alert");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    toneMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                System.out.println("composer");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    toneMenu();
                    user = input.nextInt();
                }
                break;
            case 5:
                System.out.println("message alert tone");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    toneMenu();
                    user = input.nextInt();
                }
                break;
            case 6:
                System.out.println("keypad tones");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callCostSetting();
                    user = input.nextInt();
                }
                break;
            case 7:
                System.out.println("warning and game tones");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    toneMenu();
                    user = input.nextInt();
                }
                break;
            case 8:
                System.out.println(" vibrating alert");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    toneMenu();
                    user = input.nextInt();
                }
                break;
            case 9:
                System.out.println("screen saver ");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    toneMenu();
                    user = input.nextInt();
                }
                break;
            case 10:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;
        }
    }
    private static void callCostSetting() {
        System.out.println("""
                1) call cost limit
                2) show costs in
                3) back
                """);
Scanner input = new Scanner(System.in);
       int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("call cost limit");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callCostSetting();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("show costs in");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callCostSetting();
                    user = input.nextInt();
                }
                break;
            case 3:
      classRegisterMenu();
      break;
        }
    }

    private static void allCostMenu() {
        System.out.println("""
                1) last call cost
                2) all calls cost
                3) clear counters
                4) back           
                """);
        Scanner input = new Scanner(System.in);
       int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("last call cost");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    allCostMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("all calls cost");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    allCostMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("clear counters");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    allCostMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                classRegisterMenu();
                break;
        }
    }

    private static void callDurationMenu() {
        System.out.println("""
                1--> last call duration
                2--> all calls duration
                3--> received calls duration
                4--> dialled calls duration
                5--> clear timers
                6--> back
                """);
        Scanner input = new Scanner(System.in);
       int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("last call duration");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callDurationMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("all calls duration");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callDurationMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("received calls duration");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callDurationMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                System.out.println("dialled calls duration");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callDurationMenu();
                    user = input.nextInt();
                }
                break;
            case 5:
                System.out.println("clear timers");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    callDurationMenu();
                    user = input.nextInt();
                }
                break;
            case 6:
                classRegisterMenu();
                break;
        }
    }

    private static void classRegisterMenu() {
        System.out.println("""
                1) missed calls 
                2) received calls 
                3) Dialled numbers
                4) Erase call lists
                5) show call duration
                6) show all call costs
                7) call cost settings
                8) prepaid credit
                9) main menu
                """);
        Scanner input = new Scanner(System.in);
      int  user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("missed calls ");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    classRegisterMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("received calls ");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    classRegisterMenu();
                    user = input.nextInt();
                }

                break;
            case 3:
                System.out.println("Dialled numbers");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    classRegisterMenu();
                    user = input.nextInt();
                }
                break;

            case 4:
                System.out.println("Erase call lists");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    classRegisterMenu();
                    user = input.nextInt();
                }
                break;

            case 5:
                System.out.println("show call duration");

                callDurationMenu();

                break;

            case 6:
                System.out.println("show all costs");

                allCostMenu();

                break;
            case 7:
                System.out.println("call cost settings");
                callCostSetting();

                break;
            case 8:
                System.out.println("prepaid credit");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    classRegisterMenu();
                    user = input.nextInt();
                }
                break;
            case 9:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;

        }
    }

    private static void chatmenu() {
        System.out.println("""
                1--> chat
                2--> main menu
                """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("Chat");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    chatmenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;


        }
    }

    private static void commonMenu() {
        System.out.println("""
                1--> delivery reports
                2--> reply via same centre
                3--> character support
                4--> back
                  """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("delivery reports");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    commonMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("reply via same centre");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    commonMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("character support");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    commonMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                System.out.println("back");

                messageMenu();
        }
    }

    private static void setMenu() {
        System.out.println("""
                1--> message centre number
                2--> message sent as
                3-->message validity
                4--> back
                """);
        Scanner input =  new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("message centre number");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    setMenu();
                    user = input.nextInt();
                }
                break;
            case 2:
                System.out.println("message sent as");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    setMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("message validity");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    setMenu();
                    user = input.nextInt();
                }
            case 4:
                mesageSettingsMenu();

                break;
        }
    }

    private static void mesageSettingsMenu() {
        System.out.println("""
                1--> set
                2--> common
                3--> BACK
                """);
        Scanner input = new Scanner(System.in);
       int user = input.nextInt();
        switch (user) {
            case 1:
                setMenu();

                break;

            case 2:
                commonMenu();
                break;

            case 3:
                messageMenu();

                break;
        }
    }

    private static void messageMenu() {
        System.out.println("""
                1--> Write messages
                                       2-->Inbox
                                      3--> outbox
                                      4--> picture messages
                                       5-->Templates
                                      6--> smileys
                                      7--> message settings
                                      8--> info service
                                      9-->voice mailbox number
                                      10--> service command editor
                                      11--> main menu
                                      """);
        Scanner input = new Scanner(System.in);
       int  user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("Write messages");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;

            case 2:
                System.out.println("inbox");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("outbox");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;
            case 4:
                System.out.println("picture messages");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;
            case 5:
                System.out.println("templates");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;
            case 6:
                System.out.println("smileys");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;
            case 7:
                System.out.println("message settings");

                mesageSettingsMenu();

                break;
            case 8:
                System.out.println("info service");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;
            case 9:
                System.out.println("voice mailbox number");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;
            case 10:
                System.out.println("service command editor");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    messageMenu();
                    user = input.nextInt();
                }
                break;
            case 11:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;


        }

    }

    private static void optionsMenu() {
        System.out.println("""
                  1--> Type of view
                  2--> Memory status
                  3--> back
                """);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        switch (user) {
            case 1:
                System.out.println("Type of view");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    optionsMenu();
                    user = input.nextInt();

                }

                break;
            case 2:
                System.out.println("Memory status");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    optionsMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                phonebookMenu();

                break;
        }



    }


    private static void phonebookMenu() {
        System.out.println("""
                1--> search
                2--> service Nos
                3--> Add name
                4--> Erase
                5--> Edit
                6--> Assign tone
                7--> Send b'card
                8--> Options
                9--> Speed dials
                10-->Voice tags
                11--> Main menu
                                       
                """);
            Scanner input = new Scanner(System.in);
            int user = input.nextInt();
        switch (user) {

            case 1:
                System.out.println("search");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;

            case 2:
                System.out.println("Service Nos");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;
            case 3:
                System.out.println("Add name");

                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;

            case 4:
                System.out.println("Erase");

                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;
            case 5:
                System.out.println("Edit");

                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;
            case 6:
                System.out.println("Assign tone");

                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;
            case 7:
                System.out.println("Send b'card");
                System.out.println("search");
                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;
            case 8:

                System.out.println("Options");


                optionsMenu();

break;


            case 9:
                System.out.println("Speed dials");

                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;
            case 10:
                System.out.println("Voice tags");

                System.out.println("to go back press 0");
                user = input.nextInt();

                if (user == 0) {
                    phonebookMenu();
                    user = input.nextInt();
                }
                break;
            case 11:
                mainMenu();
                user = input.nextInt();
                switch (user) {

                }
                break;
        }

    }

    private static void mainMenu() {
        System.out.println("List of functions");
        System.out.println("""
                 1--> Phonebook
                 2-->Messages
                 3--> Chat
                 4--> Call register
                 5--> Tones
                 6--> Settings
                 7--> Call divert
                 8--> Games
                 9-->Calculator
                 10-->Reminders
                 11--> Clock
                 12--> Profiles
                 13--> SIM services
                14--> exit 
                """);
Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        mainMenu(user);


    }

    private static void mainMenu(int user) {
        switch (user) {
            case 1:
                phonebookMenu();
                break;

            case 2:

                messageMenu();

                break;

            case 3:
                chatmenu();

                break;

            case 4:
                classRegisterMenu();

                break;
            case 5:
                toneMenu();


                break;

            case 6:
                settingsMenu();

                break;
            case 7:
                callDivertMenu();

                break;

            case 8:
                gamesMenu();
                break;



            case 9:
                calculatorMenu();

                break;

            case 10:
                reminderMenu();

                break;

            case 11:
                clockMenu();

                break;

            case 12:
                profileMenu();


                break;

            case 13:
                simMenu();

                break;

            case 14:
                System.exit(0);
                break;


            default:
                System.out.println("you are mad");
               Scanner input = new Scanner(System.in);
            System.out.println("to go back press 0");
            user = input.nextInt();

            if (user == 0) {
                mainMenu();

            }

        }
    }
}



