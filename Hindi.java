import java.io.*; // Imports File
import java.util.*; // Import Scanner
import javax.tools.*; // Imports JavaCompiler
public class Hindi{
	// Compares each String in User Input to Hindi Command and Accordingly Translates to English
	public static String translate(String word){
		if(word.equals("अगला")){
			return("next ");
		}
		if(word.equals("लाना")){
			return("import ");
		}
		if(word.equals("जावा.संग्रह.*")){
			return("java.util.*; ");
		}
		if(word.equals("सामान्य")){
			return("public ");
		}
		if(word.equals("कक्षा")){
			return("class ");
		}
		if(word.equals("तय")){
			return("static ");
		}
		if(word.equals("खाली")){
			return("void ");
							}
		if(word.equals("मुख्य")){
			return("main");
		}
		if(word.equals("(")){
			return("(");
		}
		if(word.equals("शब्द")){
			return("String ");
		}
		if(word.equals("[")){
			return("[");
		}
		if(word.equals("]")){
			return("]");
		}
		if(word.equals("तर्क")){
			return("args");
		}
		if(word.equals(")")){
			return(") ");
		}
		if(word.equals("पूर्णांक")){
			return("int ");
		}
		if(word.equals("दशमलव")){
			return("double ");
		}
		if(word.equals("लिखो")){
			return("System.out.print");
		}
		if(word.equals("अगली_पंक्ति_लिखो")){
			return("System.out.println ");
		}
		if(word.equals("पढ़ो")){
			return("Scanner ");
		}
		if(word.equals("नया")){
			return("new ");
		}
		if(word.equals("के_लिये")){
			return("for ");
		}
		if(word.equals("जब_तक")){
			return("while ");
		}
		if(word.equals("अगर")){
			return("if ");
		}
		if(word.equals("वरना")){
			return("else ");
		}
		if(word.equals("वापस")){
			return("return ");
		}
		if(word.equals("सच")){
			return("true ");
		}
		if(word.equals("झूठ")){
			return("false ");
		}
		if(word.equals("रुक")){
			return("break ");
		}
		if(word.equals("अक्षर")){
			return("char ");
		}
		if(word.equals("\"")){
			return("\" ");
		}
		if(word.equals("प्रणाली.इनपुट")){
			return("System.in ");
		}
		if(word.equals("}")){
			return("} \n");
		}
		if(word.equals("{")){
			return("{ \n");
		}
		else{
			return(word + " ");
		}
	}
	public static void main(String[] args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		String name = console.next(); // Translated English file name
		File file = new File(name + ".txt.rtf"); 
		try {	
			FileWriter myWriter = new FileWriter(name + ".java"); // Creating new file for storing translated English JAVA program	
     					String word = console.next();
     					int a=0;
     					while(!(word.equals("stop"))){ // Accepts code until user enters "stop"
     						if(word.charAt(word.length()-1)==(';')){ // Distinguishes ; from word
     							word=word.substring(0,word.length()-1);
     							myWriter.write(translate(word)+"; ");
     							a=1;
     						}
     						if(word.length()>1){
                  				if(word.charAt(word.length()-1)==('(')){ // Distinguishes ( from word
                    				word=word.substring(0,word.length()-1);
                    				myWriter.write(translate(word)+"( ");
                    				a=1;
                  				}
               				}
     						if(word.length()>1){
                  				if(word.charAt(word.length()-1)==('{')){ // Distinguishes { from word
                    				word=word.substring(0,word.length()-1);
                    				myWriter.write(translate(word)+"{\n");
                    				a=1;
                  				}
               				}
							if(a==0){
								myWriter.write(translate(word));
							}
							word = console.next();
							a=0;
     					}
      					myWriter.close();
      					System.out.println("Successfully wrote to the file.");
    	} catch (IOException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
    	String fileToCompile = name+".java"; // This is the English translated file
    	JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    	int compilationResult = compiler.run(null,null,null,fileToCompile);
    	if(compilationResult==0){
    		System.out.println("Compilation successful"); // Printed if Translated English Program is compiled and ready to run
    	}
    	else{
    		System.out.println("Compilation failed");
    	}
    	
    }
}

	