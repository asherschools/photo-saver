import java.util.ArrayList;

public class InputLocation {

    private String input;
    private ArrayList<String> filesToMove;

    public InputLocation(String input) {
        this.input = input;
        filesToMove = new ArrayList<String>();
    }

    public ArrayList<String> getFilesToMove() {
        return filesToMove;
    }

    public void setFilesToMove(ArrayList<String> filesToMove) {
        this.filesToMove = filesToMove;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

}
