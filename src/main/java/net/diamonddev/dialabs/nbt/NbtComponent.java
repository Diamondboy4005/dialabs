package net.diamonddev.dialabs.nbt;

import net.minecraft.nbt.NbtCompound;

public abstract class NbtComponent<T> {

    public final String key;

    public NbtComponent(String key) {
        this.key = key;
    }
    abstract T read(NbtCompound nbt);
    abstract void write(NbtCompound nbt, T data);
}
