package com.lijz.asm.aop;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by jianzhongli on 16/1/24.
 */
public class AddSecurityCheckClassAdapter extends ClassAdapter {

    /**
     * Constructs a new {@link org.objectweb.asm.ClassAdapter} object.
     *
     * @param cv the class visitor to which this adapter must delegate calls.
     */
    public AddSecurityCheckClassAdapter(ClassVisitor cv) {
        super(cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {

        MethodVisitor mv = cv.visitMethod(access, name, desc, signature, exceptions);
        MethodVisitor wrapperMv = mv;
        if(mv == null){
            return wrapperMv;
        }

        if(name.equals("operation")){
            wrapperMv = new AddSecurityCheckMethodAdapter(mv);
        }

        return wrapperMv;
    }
}
