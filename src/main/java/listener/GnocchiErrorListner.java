import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.*;
import java.util.BitSet;

public class GnocchiErrorListner implements ANTLRErrorListener {

    private PrintWriter writer;
    private BufferedReader reader;
    private String destinationFile;
    private String tmpFile;

    GnocchiErrorListner(String destinationPath, String file) {
        try {
            this.writer = new PrintWriter(new BufferedWriter(new FileWriter(destinationPath + "file.tmp")));
            this.reader = new BufferedReader(new FileReader(destinationPath + file));
            this.destinationFile = destinationPath + file;
            this.tmpFile = destinationPath + "file.tmp";
        } catch (IOException e) {
            System.out.println("no cusz");
        }
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        String errorMessage = "    // <- Error at " + i1 + " character: " + s;
        writeTo(i, errorMessage);
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
package listener;

    }

    private void writeTo(int lineNumber, String message) {
        int lineCounter = 0;
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                if (lineCounter == lineNumber - 1) {
                    line += message;
                }
                lineCounter++;
                writer.println(line);
            }
            writer.close();
            reader.close();
            File realName = new File(destinationFile);
            realName.delete();
            new File(tmpFile).renameTo(realName);
        } catch (IOException e) {
            System.out.println("coś poszło nie tak");
        }
    }

}
