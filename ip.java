import java.util.Scanner;

class IpAddress {
    static Scanner sc = new Scanner(System.in);

    public void attributes() {
        System.out.println("Network IP: ");
        String ip0 = sc.next();

        System.out.println("Broadcast ID: ");
        String ip1 = sc.next();

        System.out.println("Next Network ID: ");
        String ip2 = sc.next();

        System.out.println("First Host ID: ");
        String ip3 = sc.next();

        System.out.println("Last Host ID: ");
        String ip4 = sc.next();

        System.out.println("Number of IPs: ");
        String ip5 = sc.next();

        System.out.println("Subnet: ");
        String ip6 = sc.next();
    }

    public static void main(String[] args) {
        IpAddress obj = new IpAddress();

        String[] ipList = {
            "10.1.1.55/28", "10.1.1.37/29", "10.2.2.88/27", "10.2.2.111/25",
            "10.2.2.20/30", "10.2.2.199/26", "10.3.3.85/29", "10.3.3.170/29",
            "10.3.3.147/28", "10.3.3.197/30", "10.3.3.117/29", "10.4.77.188/19",
            "10.4.235.99/21", "10.4.211.6/18", "10.50.111.222/12", "10.50.111.222/7"
        };

        while (true) {
            int randomIndex = (int) (Math.random() * ipList.length);
            String randomIp = ipList[randomIndex];

            System.out.println("\nQuestion IP: " + randomIp);

            obj.attributes();

            switch (randomIp) {
                case "10.1.1.55/28":
                    System.out.println("Network IP: 10.1.1.48");
                    System.out.println("Broadcast ID: 10.1.1.63");
                    System.out.println("Next Network ID: 10.1.1.64");
                    System.out.println("First Host ID: 10.1.1.49");
                    System.out.println("Last Host ID: 10.1.1.62");
                    System.out.println("Number of IPs: 16");
                    System.out.println("Subnet: 255.255.255.240");
                    break;

                case "10.1.1.37/29":
                    System.out.println("Network IP: 10.1.1.32");
                    System.out.println("Broadcast ID: 10.1.1.39");
                    System.out.println("Next Network ID: 10.1.1.40");
                    System.out.println("First Host ID: 10.1.1.33");
                    System.out.println("Last Host ID: 10.1.1.38");
                    System.out.println("Number of IPs: 8");
                    System.out.println("Subnet: 255.255.255.248");
                    break;

                case "10.2.2.88/27":
                    System.out.println("Network IP: 10.2.2.64");
                    System.out.println("Broadcast ID: 10.2.2.95");
                    System.out.println("Next Network ID: 10.2.2.96");
                    System.out.println("First Host ID: 10.2.2.65");
                    System.out.println("Last Host ID: 10.2.2.94");
                    System.out.println("Number of IPs: 32");
                    System.out.println("Subnet: 255.255.255.224");
                    break;

                case "10.2.2.111/25":
                    System.out.println("Network IP: 10.2.2.0");
                    System.out.println("Broadcast ID: 10.2.2.127");
                    System.out.println("Next Network ID: 10.2.2.128");
                    System.out.println("First Host ID: 10.2.2.1");
                    System.out.println("Last Host ID: 10.2.2.126");
                    System.out.println("Number of IPs: 128");
                    System.out.println("Subnet: 255.255.255.128");
                    break;

                case "10.2.2.20/30":
                    System.out.println("Network IP: 10.2.2.20");
                    System.out.println("Broadcast ID: 10.2.2.23");
                    System.out.println("Next Network ID: 10.2.2.24");
                    System.out.println("First Host ID: 10.2.2.21");
                    System.out.println("Last Host ID: 10.2.2.22");
                    System.out.println("Number of IPs: 4");
                    System.out.println("Subnet: 255.255.255.252");
                    break;

                case "10.2.2.199/26":
                    System.out.println("Network IP: 10.2.2.192");
                    System.out.println("Broadcast ID: 10.2.2.255");
                    System.out.println("Next Network ID: 10.2.3.0");
                    System.out.println("First Host ID: 10.2.2.193");
                    System.out.println("Last Host ID: 10.2.2.254");
                    System.out.println("Number of IPs: 64");
                    System.out.println("Subnet: 255.255.255.192");
                    break;

                case "10.3.3.85/29":
                    System.out.println("Network IP: 10.3.3.80");
                    System.out.println("Broadcast ID: 10.3.3.87");
                    System.out.println("Next Network ID: 10.3.3.88");
                    System.out.println("First Host ID: 10.3.3.81");
                    System.out.println("Last Host ID: 10.3.3.86");
                    System.out.println("Number of IPs: 8");
                    System.out.println("Subnet: 255.255.255.248");
                    break;

                case "10.3.3.170/29":
                    System.out.println("Network IP: 10.3.3.168");
                    System.out.println("Broadcast ID: 10.3.3.175");
                    System.out.println("Next Network ID: 10.3.3.176");
                    System.out.println("First Host ID: 10.3.3.169");
                    System.out.println("Last Host ID: 10.3.3.174");
                    System.out.println("Number of IPs: 8");
                    System.out.println("Subnet: 255.255.255.248");
                    break;

                case "10.3.3.147/28":
                    System.out.println("Network IP: 10.3.3.144");
                    System.out.println("Broadcast ID: 10.3.3.159");
                    System.out.println("Next Network ID: 10.3.3.160");
                    System.out.println("First Host ID: 10.3.3.145");
                    System.out.println("Last Host ID: 10.3.3.158");
                    System.out.println("Number of IPs: 16");
                    System.out.println("Subnet: 255.255.255.240");
                    break;

                case "10.3.3.197/30":
                    System.out.println("Network IP: 10.3.3.196");
                    System.out.println("Broadcast ID: 10.3.3.199");
                    System.out.println("Next Network ID: 10.3.3.200");
                    System.out.println("First Host ID: 10.3.3.197");
                    System.out.println("Last Host ID: 10.3.3.198");
                    System.out.println("Number of IPs: 4");
                    System.out.println("Subnet: 255.255.255.252");
                    break;

                case "10.3.3.117/29":
                    System.out.println("Network IP: 10.3.3.112");
                    System.out.println("Broadcast ID: 10.3.3.119");
                    System.out.println("Next Network ID: 10.3.3.120");
                    System.out.println("First Host ID: 10.3.3.113");
                    System.out.println("Last Host ID: 10.3.3.118");
                    System.out.println("Number of IPs: 8");
                    System.out.println("Subnet: 255.255.255.248");
                    break;

                case "10.4.77.188/19":
                    System.out.println("Network IP: 10.4.64.0");
                    System.out.println("Broadcast ID: 10.4.95.255");
                    System.out.println("Next Network ID: 10.4.96.0");
                    System.out.println("First Host ID: 10.4.64.1");
                    System.out.println("Last Host ID: 10.4.95.254");
                    System.out.println("Number of IPs: 8192");
                    System.out.println("Subnet: 255.255.224.0");
                    break;

                case "10.4.235.99/21":
                    System.out.println("Network IP: 10.4.232.0");
                    System.out.println("Broadcast ID: 10.4.239.255");
                    System.out.println("Next Network ID: 10.4.240.0");
                    System.out.println("First Host ID: 10.4.232.1");
                    System.out.println("Last Host ID: 10.4.239.254");
                    System.out.println("Number of IPs: 2048");
                    System.out.println("Subnet: 255.255.248.0");
                    break;

                case "10.4.211.6/18":
                    System.out.println("Network IP: 10.4.192.0");
                    System.out.println("Broadcast ID: 10.4.255.255");
                    System.out.println("Next Network ID: 10.5.0.0");
                    System.out.println("First Host ID: 10.4.192.1");
                    System.out.println("Last Host ID: 10.4.255.254");
                    System.out.println("Number of IPs: 16384");
                    System.out.println("Subnet: 255.255.192.0");
                    break;

                case "10.50.111.222/12":
                    System.out.println("Network IP: 10.48.0.0");
                    System.out.println("Broadcast ID: 10.63.255.255");
                    System.out.println("Next Network ID: 10.64.0.0");
                    System.out.println("First Host ID: 10.48.0.1");
                    System.out.println("Last Host ID: 10.63.255.254");
                    System.out.println("Number of IPs: 1048576");
                    System.out.println("Subnet: 255.240.0.0");
                    break;

                case "10.50.111.222/7":
                    System.out.println("Network IP: 10.0.0.0");
                    System.out.println("Broadcast ID: 11.255.255.255");
                    System.out.println("Next Network ID: 12.0.0.0");
                    System.out.println("First Host ID: 10.0.0.1");
                    System.out.println("Last Host ID: 11.255.255.254");
                    System.out.println("Number of IPs: 33554432");
                    System.out.println("Subnet: 255.0.0.0");
                    break;

                default:
                    System.out.println("Unknown IP.");
                    break;
            }

            System.out.print("\nDo you want the next IP? (true/false): ");
            boolean choice = sc.nextBoolean();

            if (!choice) {
                System.out.println("Program terminated.");
                break;
            }
        }
    }
}
