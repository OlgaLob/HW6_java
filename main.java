package HW6;

import java.util.HashSet;
import java.util.Set;

public class main
{
    public static void main(String[] args)
    {
        System.out.println("\n Привет! Это программа\n для подбора ноутбука!");
        Set<NoteBook> set = new HashSet<>();
        set.add(new NoteBook
                ("001", 16, "Windows", 1024, "Samsung"));
        set.add(new NoteBook
                ("002", 32, "Windows", 1024, "Lenovo"));
        set.add(new NoteBook
                ("003", 8, "linux", 256, "Asus"));
        set.add(new NoteBook
                ("004", 8, "Mac", 512, "Apple"));
        set.add(new NoteBook
                ("005", 16, "Solaris", 512, "IBM"));
        //System.out.println(set);

        Operation operation = new Operation(set);
        operation.start();
        System.out.println("\nВсего доброго! \nБыло приятно иметь с вами дело!");

    }
}

