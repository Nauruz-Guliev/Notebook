package info.istamendil.notebook.dataStorage;


import java.sql.SQLOutput;

public class ArrayStorage implements Storage{
    private int notesCount;
    private final String[] notes;
    public ArrayStorage (String [] notes) {
        this.notes = notes;
    }

    public void save(String note) throws StorageException{
        try {
            notes[notesCount] = note;
            notesCount++;
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public String[] readAll() throws StorageException{
        return notes;
    }
    public void deleteAll() throws StorageException{
        int i = 0;
        try {
            while (notes[i] != null) {
                notes[i] = null;
                i++;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
