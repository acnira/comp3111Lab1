package lab1;

public class Library {
	public static void main(String arg[]) {
		Library lib=new Library();
		if(lib.someLibraryMethod())System.out.println("testing");
	}
	
    public boolean someLibraryMethod() {
        return true;
    }
}
