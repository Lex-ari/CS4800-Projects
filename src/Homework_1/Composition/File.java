package Homework_1.Composition;

public class File {

    private String name;
    public File(){

    }

    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNameInSubLevel(int subLevel){
        String tab = "";
        for (int i = 0; i < subLevel; i++){
            tab += "| ";
        }
    }
}
