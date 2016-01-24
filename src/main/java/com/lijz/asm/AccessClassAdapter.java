package com.lijz.asm;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by jianzhongli on 16/1/24.
 */
public class AccessClassAdapter extends ClassAdapter {

    /**
     * Constructs a new {@link org.objectweb.asm.ClassAdapter} object.
     *
     * @param cv the class visitor to which this adapter must delegate calls.
     */
    public AccessClassAdapter(ClassVisitor cv) {
        super(cv);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        int privateAccess = Opcodes.ACC_PRIVATE;
        return super.visitField(privateAccess, name, desc, signature, value);
    }
}
