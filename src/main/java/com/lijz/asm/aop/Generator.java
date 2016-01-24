package com.lijz.asm.aop;

import java.io.File;
import java.io.FileOutputStream;

import org.objectweb.asm.*;

public class Generator {

    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader(Account.class.getName());
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        ClassAdapter classAdapter = new AddSecurityCheckClassAdapter(cw);
        cr.accept(classAdapter, ClassReader.SKIP_DEBUG);
        byte[] data = cw.toByteArray();
        File file = new File("Account.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();
    }
}
