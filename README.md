# Subnet-Practice-Tool

This is a simple **Java console project** to practice and verify subnetting concepts such as network ID, broadcast ID, host range, subnet mask, and CIDR.  

The program randomly selects an IP address (with subnet) from a predefined list and asks the user to input **seven attributes**. After the input, it displays the correct values for comparison. The user can then choose whether to continue with another random IP or terminate the program.

---

## Features

- Random selection of IP addresses from a pool of 16 predefined subnets.  
- User inputs 7 attributes:
  1. Network IP  
  2. Broadcast ID  
  3. Next Network ID  
  4. First Host ID  
  5. Last Host ID  
  6. Number of IPs  
  7. Subnet mask  

- Program validates against correct answers.  
- Loop continues until user enters `false`.  

---

## Tech Stack

- **Language:** Java  
- **Concepts used:**  
  - Arrays  
  - Switch-case  
  - Loops (`while`)  
  - Random selection using `Math.random()`  
  - Scanner for user input  

---

## Example Run

Question IP: 10.1.1.55/28
Network IP:
10.1.1.48
Broadcast ID:
10.1.1.63
Next Network ID:
10.1.1.64
First Host ID:
10.1.1.49
Last Host ID:
10.1.1.62
Number of IPs:
16
Subnet:
255.255.255.240

Do you want the next IP? (true/false): true

---

## How to Run

1. Clone the repository:  
   ```bash
   git clone https://github.com/<your-username>/<repo-name>.git
   cd <repo-name>

2. Compile the program:

javac IpAddress.java


3. Run the program:

java IpAddress




---

IP Address Cheat-Sheet

Question IP Network IP Broadcast ID Next Network ID First Host Last Host No. of IPs Subnet Mask

10.1.1.55/28 10.1.1.48 10.1.1.63 10.1.1.64 10.1.1.49 10.1.1.62 16 255.255.255.240
10.1.1.37/29 10.1.1.32 10.1.1.39 10.1.1.40 10.1.1.33 10.1.1.38 8 255.255.255.248
10.2.2.88/27 10.2.2.64 10.2.2.95 10.2.2.96 10.2.2.65 10.2.2.94 32 255.255.255.224
10.2.2.111/25 10.2.2.0 10.2.2.127 10.2.2.128 10.2.2.1 10.2.2.126 128 255.255.255.128
10.2.2.20/30 10.2.2.20 10.2.2.23 10.2.2.24 10.2.2.21 10.2.2.22 4 255.255.255.252
10.2.2.199/26 10.2.2.192 10.2.2.255 10.2.3.0 10.2.2.193 10.2.2.254 64 255.255.255.192
10.3.3.85/29 10.3.3.80 10.3.3.87 10.3.3.88 10.3.3.81 10.3.3.86 8 255.255.255.248
10.3.3.170/29 10.3.3.168 10.3.3.175 10.3.3.176 10.3.3.169 10.3.3.174 8 255.255.255.248
10.3.3.147/28 10.3.3.144 10.3.3.159 10.3.3.160 10.3.3.145 10.3.3.158 16 255.255.255.240
10.3.3.197/30 10.3.3.196 10.3.3.199 10.3.3.200 10.3.3.197 10.3.3.198 4 255.255.255.252
10.3.3.117/29 10.3.3.112 10.3.3.119 10.3.3.120 10.3.3.113 10.3.3.118 8 255.255.255.248
10.4.77.188/19 10.4.64.0 10.4.95.255 10.4.96.0 10.4.64.1 10.4.95.254 8192 255.255.224.0
10.4.235.99/21 10.4.232.0 10.4.239.255 10.4.240.0 10.4.232.1 10.4.239.254 2048 255.255.248.0
10.4.211.6/18 10.4.192.0 10.4.255.255 10.5.0.0 10.4.192.1 10.4.255.254 16384 255.255.192.0
10.50.111.222/12 10.48.0.0 10.63.255.255 10.64.0.0 10.48.0.1 10.63.255.254 1048576 255.240.0.0
10.50.111.222/7 10.0.0.0 11.255.255.255 12.0.0.0 10.0.0.1 11.255.255.254 33554432 255.0.0.0



---

Future Improvements

Add auto-validation of user input (check if entered values match expected attributes).

Add a score system to track correct answers.

Expand IP pool with more subnets.

GUI version with Next button for better user experience.



---

License

This project is open source under the MIT License.
