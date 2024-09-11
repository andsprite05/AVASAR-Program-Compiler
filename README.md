# AVASAR Program Compiler
Avasar Program Compiler is a computer algorithm compiler to compile and run algorithms written in the Hindi language in accordance with the Avasar Program Compiler dictionary. This compiler implements the “java.io”, “java.util”, and “javax.tools” libraries of the Java programming language. In a class declared “Hindi”, the compiler declares and initializes a “translate” method of return type String that accepts a String parameter in Hindi to translate the Hindi string into an English equivalent of the Java programming language in accordance with the dictionary set by the compiler. The English equivalent of the string parameter is returned as a String type. The main method throws a “FileNotFoundException”. In the main method, a variable of type Scanner is declared and initialized and a file containing the Hindi algorithm is input by the user and is stored in a new File variable as a “.txt.rtf” file. A FileWriter is used to create a new “.java” file where the Hindi program translated in English is stored. The user is continuously prompted to enter functions from their algorithm in Hindi until the keyword “विराम” is entered. Each Hindi function input by the user is sent through the “translate” method and the translated function in English is saved into the “.java” file created by FileWriter. Once the entire Hindi algorithm is translated into English and saved into the “.java” file, the FileWriter is closed and a “Successfully written to the file.” message is displayed on the user terminal. If, instead, an “IOException” is caught, an error message is displayed. The translated English algorithm stored in the “.java” file is compiled if compilation is successful, a message is sent to the user via Terminal and the user may proceed with running the program to receive desired results. If there is an error in compilation, an error message is sent to the user and a Stack Trace is printed to the Terminal. 

To run the Avasar Program Compiler, the user must download the code for the compiler from GitHub and run the program in either an IDE, Terminal, or alternate programming environment. The program will prompt them to enter their Hindi algorithm, by function, and enter the keyword “विराम” to indicate the end of the program. The compiler will then translate the entered Hindi program to English, compile it, and prompt the user to run the compiled program if compilation is successful, or will alternatively report an error to the user with the corresponding Stack Trace to track the error location.

The parsing by string translation and compilation method of the Avasar Program Compiler is new, innovative and is claimed as the subject matter of the invention.

# COMPILER DOCUMENTATION
अगला (next) <br />
प्रणाली.इनपुट (System.in) <br />
लाना जावा.संग्रह.* (import java.util.*) <br />
आम कक्षा _ हिंदी (public class _) <br />
आम तय खाली मुख्य(शब्द[] तर्क) (public static void main(String[] args)) <br />
पूर्णांक (int) <br />
शब्द (String) <br />
दशमलव (double) <br />
लिखो (System.out.print) <br />
अगर / वरना (if / else) <br />
वापस (return) <br />
सच (true) <br />
झूठ (false) <br />
रुक (break) <br />
अक्षर (char) <br />
अगली_पंक्ति_लिखो (System.out.println) <br />
पढ़ो (Scanner) <br />
नया (new) <br />
के_लिये (for) <br />
जब_तक (while) <br />

# COMPILER FRAMEWORK
![image](https://github.com/user-attachments/assets/e6223d6b-bde0-4f38-8307-1548ecebb21f)

# DEMO
[Avasar_Program_Compiler.webm](https://github.com/user-attachments/assets/e51cd23e-f227-466d-a235-944797e9b386)

