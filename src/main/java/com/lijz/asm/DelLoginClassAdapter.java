package com.lijz.asm;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by jianzhongli on 16/1/24.
 */
public class DelLoginClassAdapter extends ClassAdapter {

    public DelLoginClassAdapter(ClassVisitor classVisitor) {
        super(classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int i, String s, String s2, String s3, String[] strings) {
        if(s.equals("login")){
            return null;
        }
        return super.visitMethod(i, s, s2, s3, strings);
    }
}
