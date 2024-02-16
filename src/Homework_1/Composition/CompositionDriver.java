package Homework_1.Composition;

public class CompositionDriver {
    public static void main(String[] args){
        Folder demo1 = new Folder("demo1");
        Folder sourceFiles = demo1.addSubFolder("Source Files");
        sourceFiles.addSubFolder(".phalcon");
        Folder app = sourceFiles.addSubFolder("app");
        app.addSubFolder("config");
        app.addSubFolder("controllers");
        app.addSubFolder("library");
        app.addSubFolder("migrations");
        app.addSubFolder("models");
        app.addSubFolder("models");
        app.addSubFolder("views");
        sourceFiles.addSubFolder("cache");
        sourceFiles.addSubFolder("public");
        sourceFiles.addSubFile(".htaccess");
        sourceFiles.addSubFile(".htrouter.php");
        sourceFiles.addSubFile("index.html");
        demo1.addSubFolder("Include Path");
        demo1.addSubFolder("Remote Files");

        demo1.printDirectory();

        System.out.println("\n Task 2: Deleting app \n");
        sourceFiles.removeSubFolder(app);

        demo1.printDirectory();

        System.out.println("\n Task 3: Deleting public \n");
        sourceFiles.removeSubFolder("public");

        demo1.printDirectory();
    }
}
