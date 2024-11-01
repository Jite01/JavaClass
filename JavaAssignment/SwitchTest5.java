import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Phone book\n2: Messages\n3: Chat\n4: Call Register\n");
        
        int menu = scanner.nextInt();

        System.out.println("Nokia");

        switch (menu) {
            case 1:
                System.out.println("1: Search\n2: Service Nos.\n3: Add Name\n4: Erase\n5: Edit\n6: Assign Tone\n7: Send b'card\n8: Options\n9: Speed Dials\n10: Voice Tags");
                int phoneBook = scanner.nextInt();

                switch (phoneBook) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos.");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("1: Type of view\n2: Memory Status");
                        int options = scanner.nextInt();
                        switch (options) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Speed Dials");
                        break;
                    case 10:
                        System.out.println("Voice Tags");
                        break;
                }
                break;

            case 2:
                System.out.println("1: Write Messages\n2: Inbox\n3: Outbox\n4: Picture Messages\n5: Templates\n6: Smileys\n7: Message Settings\n8: Info Service\n9: Voice Mailbox Number\n10: Service Command Editor");
                int messages = scanner.nextInt();

                switch (messages) {
                    case 1:
                        System.out.println("Write Messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture Messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("1: Set1\n2: Common");
                        int messageSettings = scanner.nextInt();
                        switch (messageSettings) {
                            case 1:
                                System.out.println("1: Message centre number\n2: Messages sent as\n3: Message validity");
                                int set1 = scanner.nextInt();
                                switch (set1) {
                                    case 1:
                                        System.out.println("Message centre number");
                                        break;
                                    case 2:
                                        System.out.println("Messages sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("1: Delivery reports\n2: Reply via same centre\n3: Character support");
                                int common = scanner.nextInt();
                                switch (common) {
                                    case 1:
                                        System.out.println("Delivery reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same centre");
                                        break;
                                    case 3:
                                        System.out.println("Character support");
                                        break;
                                }
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Info Service");
                        break;
                    case 9:
                        System.out.println("Voice Mailbox Number");
                        break;
                    case 10:
                        System.out.println("Service Command Editor");
                        break;
                }
                break;

            case 3:
                System.out.println("Chat selected.");
                break;

            case 4:
                System.out.println("1: Missed calls\n2: Received calls\n3: Dialled numbers\n4: Erase recent call lists\n5: Show call duration\n6: Show call costs\n7: Call cost settings\n8: Prepaid credit");
                int callRegister = scanner.nextInt();

                switch (callRegister) {
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        System.out.println("1: Last call duration\n2: All calls' duration\n3: Received calls' duration\n4: Dialled calls' duration\n5: Clear timers");
                        int callDuration = scanner.nextInt();
                        switch (callDuration) {
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls' duration");
                                break;
                            case 3:
                                System.out.println("Received calls' duration");
                                break;
                            case 4:
                                System.out.println("Dialled calls' duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("1: Last call cost\n2: All calls' cost\n3: Clear counters");
                        int callCost = scanner.nextInt();
                        switch (callCost) {
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All calls' cost");
                                break;
                            case 3:
                                System.out.println("Clear counters");
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("1: Call cost limit\n2: Show costs in");
                        int callCostSettings = scanner.nextInt();
                        switch (callCostSettings) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show costs in");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                }
                break;

            default:
                System.out.println("Invalid option. Please select a number between 1-4.");
                break;
        }

       
    }
}
