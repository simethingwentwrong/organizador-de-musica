
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
   

    /**
     * Constructor for objects of class test
     */
    public test()
    {
        MusicOrganizer coleccion = new MusicOrganizer();
        System.out.println("Añadiendo 3 elementos de la colección");
        coleccion.addFile("Hotel California.mp3");
        coleccion.addFile("Wish you where here.mp3");
        coleccion.addFile("Blow your trumpest Gabriel.mp3");
        System.out.println("===============================================");
        
        System.out.println("Comprobamos que el numero de elementos es 3");
        System.out.println(coleccion.getNumberOfFiles());
        System.out.println("===============================================");       
        
        System.out.println("Comprobamos listFile");
        coleccion.listFile(0);
        coleccion.listFile(1);
        coleccion.listFile(2);
        System.out.println("===============================================");
        
        System.out.println("Comprobamos checkIndex");
        coleccion.chekindex(3);
        System.out.println("===============================================");
        
        System.out.println("Comprobamos validIndex false");
        coleccion.validIndex(3);
        System.out.println(coleccion.getValidIndex());
        System.out.println("Comprobamos validIndex true");
        coleccion.validIndex(1);
        System.out.println(coleccion.getValidIndex());
        System.out.println("===============================================");
        
        System.out.println("Comprobamos removeFile");
        coleccion.removeFile(2);
        System.out.println("Comprobamos que el numero de elementos es 2 despues de eliminar el tercero");
        System.out.println(coleccion.getNumberOfFiles());
        System.out.println("===============================================");
        
    }

    
}
