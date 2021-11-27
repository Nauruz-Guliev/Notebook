package info.istamendil.notebook.dataStorage;

public interface Storage {
    void save(String note) throws StorageException;
    String[] readAll() throws StorageException;
    void deleteAll() throws StorageException;
}
