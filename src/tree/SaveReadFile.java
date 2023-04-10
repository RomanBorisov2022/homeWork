package tree;

import java.io.*;

public class SaveReadFile implements Serializable, InterfaceSaveRead {
    @Override
    public void saveFile (Object o) {
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
            System.out.println("Файл успешно записан! \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object readFile () {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            ois.close();
            return o;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
