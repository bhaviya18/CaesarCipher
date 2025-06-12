🔐 Caesar Cipher Java Program
A simple Java command-line application that implements the Caesar Cipher, one of the earliest known encryption techniques. This program allows users to encrypt and decrypt messages using a shift key.

✨ Features
✅ Encrypts plain text with a Caesar shift and saves the result to a file

✅ Decrypts user-entered ciphertext using a known shift key

✅ Menu-driven interface with an option to exit

✅ Handles both uppercase and lowercase letters, and preserves symbols and spaces

📁 Files
Main.java # Java source file containing the full Caesar Cipher logic
ciphertext.txt # File where encrypted messages are saved
README.md # This documentation file

▶️ How to Run
Open Command Prompt or PowerShell

Navigate to the folder:

cd "C:\Users\Bhaviya\Desktop\caesor cipher"

Compile and run the Java program:

javac Main.java
java Main

Follow the menu to encrypt or decrypt messages.

🧪 Sample Program Output
--- Caesar Cipher Menu ---

Encrypt and Save to File

Decrypt Entered Ciphertext

Exit
Choose an option (1-3): 1
Enter text to encrypt: Hello World!
Enter shift key (0-25): 3
Encrypted text saved to file: Khoor Zruog!

--- Caesar Cipher Menu ---

Encrypt and Save to File

Decrypt Entered Ciphertext

Exit
Choose an option (1-3): 2
Enter ciphertext to decrypt: Khoor Zruog!
Enter shift key used for encryption (0-25): 3
Decrypted text: Hello World!

💡 How Caesar Cipher Works
The Caesar Cipher shifts each letter by a fixed number of places in the alphabet. For example, with a shift of 3:

A → D
B → E
C → F
...
X → A
Y → B
Z → C

🧰 Tools Used
Java (JDK 8 or later)

Command Line (Terminal, CMD, or PowerShell)

Git (for version control and uploading to GitHub)

📘 License
This project is for learning and educational purposes only. No license restrictions.

Created by Bhaviya ✨
