package services;

import java.util.Comparator;


public interface TEST<T> extends Comparator<T>{

	int myinttest(T t1,T t2);

}
