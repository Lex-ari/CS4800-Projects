package Homework_1.Composition;

import java.util.ArrayList;

public class Folder {
    /**
     * NOTE
     * For instantiation, do not do it in the constructor.
     * Do it in the setters and getters.
     */
    private String name;
    private ArrayList<File> subFiles = new ArrayList<>();
    private ArrayList<Folder> subFolders = new ArrayList<>();

    public Folder() {

    }

    public Folder(String name) {
        this.name = name;
    }

    public Folder addSubFolder(String name){
        Folder workingFolder = new Folder(name);
        subFolders.add(workingFolder);
        return workingFolder;
    }

    public File addSubFile(String name){
        File workingFile = new File(name);
        subFiles.add(workingFile);
        return workingFile;
    }

    public void removeSubFolder(String name){
        for (Folder workingSubFolder : subFolders){
            if(workingSubFolder.name.equals(name)){
                subFolders.remove(workingSubFolder);
                break;
            }
        }
    }

    public void removeSubFolder(Folder workingSubFolder){
        subFolders.remove(workingSubFolder);
    }

    public void printDirectory(){
        printDirectoryWithTabs(0);
    }

    private void printDirectoryWithTabs(int subLevel){
        String tab = "";
        for (int i = 0; i < subLevel; i++){
            tab += "| ";
        }
        System.out.println(tab + name);
        for (Folder workingFolder : subFolders){
            workingFolder.printDirectoryWithTabs(subLevel + 1);
        }
        for (File workingFile : subFiles){
            workingFile.printNameInSubLevel(subLevel);
        }
    }
}
