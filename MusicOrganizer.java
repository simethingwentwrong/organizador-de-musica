import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    private boolean validIndex;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        validIndex = false;
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        validIndex(index);
        if(validIndex == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        validIndex (index);
        if(validIndex == true) {
            files.remove(index);
        }
    }
    
    /**
     * Este m�todo toma un par�metro entero y comprueba que sea un �ndice v�lido para el atributo files. 
     * Si el par�metro no es v�lido debe mostrar un mensaje de error por pantalla e indicar el rango v�lidoEste m�todo toma un par�metro entero y comprueba que sea un �ndice v�lido para el atributo files.
     * Si el par�metro no es v�lido debe mostrar un mensaje de error por pantalla e indicar el rango v�lido
     */
    public void chekindex (int index)
    {
       if(index < 0 || index >= files.size()) 
       {
            System.out.println("Error el rango valido es de 0 a " + files.size());
        } 
    }
    
    /**
     * Este m�todo toma un par�metro entero y comprueba que sea un �ndice v�lido para el atributo files. Si el par�metro no es v�lido debe mostrar un mensaje de error por pantalla e indicar el rango v�lido
     */
    public void validIndex(int index)
      {
    
        if(index < 0 || index >= files.size()) 
        {
            validIndex = true;
        }
        else
        {
           validIndex = false;
        }
    
      }
      
      /**
       *  nos da el valor de valid index 
       */
     public boolean getValidIndex()
     {
         return validIndex;
     }
         
}
