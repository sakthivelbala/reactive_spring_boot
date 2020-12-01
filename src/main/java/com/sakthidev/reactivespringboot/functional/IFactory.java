package com.sakthidev.reactivespringboot.functional;

@FunctionalInterface
public interface IFactory<T> {
    T create();
}
