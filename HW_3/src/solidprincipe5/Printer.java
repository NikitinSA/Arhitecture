package solidprincipe5;

public class Printer {
    private TextPrinter textPrinter;
    public Printer(TextPrinter textPrinter) {
        this.textPrinter = textPrinter;
    }
    public void print(Text text) {
        textPrinter.print(text.getText());
    }
}