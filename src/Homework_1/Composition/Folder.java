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

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addSubFolder(String name){
        Folder workingFolder = new Folder(name);
        subFolders.add(workingFolder);
    }

    public void addSubFile(String name){
        File workingFile = new File(name);
        subFiles.add(workingFile);
    }

    public Folder getSubFolder(String name){
        for (Folder folder : subFolders){
            if (folder.getName().equals(name)){
                return folder;
            }
        }
        return null;
    }

    public File getSubFile(String name){
        for (File file : subFiles){
            if (file.getName().equals(name)){
                return file;
            }
        }
        return null;
    }

    public void removeSubFolder(String name){
        for (Folder workingSubFolder : subFolders){
            if(workingSubFolder.getName().equals(name)){
                subFolders.remove(workingSubFolder);
                break;
            }
        }
    }

    public void removeSubFolder(Folder workingSubFolder){
        subFolders.remove(workingSubFolder);
    }

    public void removeSubFile(File workingSubFile){
        subFiles.remove(workingSubFile);
    }

    public void removeSubFile(String name){
        for (File workingSubFile: subFiles){
            if (workingSubFile.getName().equals(name)){
                subFiles.remove(workingSubFile);
                break;
            }
        }
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
