package info.istamendil.notebook.dataStorage;

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
        try {
            for (int i = 0; i< notes.length; i++) {
                if (notes[i] != null) {
                    notes[i] = null;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public void deleteNote(String str) throws StorageException {
        try {
            for (int i = 0; i < notes.length; i++) {
                if (str.equals(notes[i])) {
                    notes[i] = null;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
