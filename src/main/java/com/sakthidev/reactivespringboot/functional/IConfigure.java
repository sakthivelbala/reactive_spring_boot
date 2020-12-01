package com.sakthidev.reactivespringboot.functional;

@FunctionalInterface
public interface IConfigure<T,R> {
    R configure(T t);
}
