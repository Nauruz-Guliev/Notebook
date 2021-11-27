package info.istamendil.notebook.dataStorage;


public class ArrayStorage {
    private int notesCount;
    private final String[] notes;
    public ArrayStorage (String [] notes) {
        this.notes = notes;
    }

    public void save(String note){
        notes[notesCount] = note;
        notesCount++;
    }
    public String[] readAll() {
        return notes;
    }
}
