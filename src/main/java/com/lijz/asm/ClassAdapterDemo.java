package com.lijz.asm;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by jianzhongli on 16/1/24.
 */
public class ClassAdapterDemo {

    public static void main(String[] args) throws IOException {

        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        ClassAdapter delLoginClassAdaptor = new DelLoginClassAdapter(classWriter);
        ClassAdapter accessClassAdaptor = new AccessClassAdapter(delLoginClassAdaptor);

        ClassReader classReader = new ClassReader(TestLogin.class.getName());
        classReader.accept(accessClassAdaptor, ClassReader.SKIP_DEBUG);
        byte[] data = classWriter.toByteArray();
        File file = new File("TestLogin.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();
    }
}
