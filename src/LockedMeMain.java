public class LockedMeMain {

    public static void main(String[] args) {

        FileOperations.createMainFolderIfNotPresent("main");

        MenuOptions.printWelcomeScreen("LockedMe", "Munshi Sahil Aziz");

        HandleOptions.handleWelcomeScreenInput();
    }


}
