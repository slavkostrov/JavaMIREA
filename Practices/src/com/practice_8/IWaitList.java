package com.practice_8;

import java.util.Collection;

/**
 * Интерфейс дли списка ожидания.
 * @autor Костров Вячеслав
 * @version 1.0
 */

public interface IWaitList <E>{
    /**
     * Процедура добавления нового элемента
     * @param element - добавляемый элемент
     */
    public void add(E element);
    /**
     * Функция удаления элмента
     * @return возвращает удаленный элемент
     */
    public E remove();
    /**
     * Функция проверки содержания объекта
     * @return boolean
     */
    public boolean contains(E element);
    /**
     * Функция проверки содержания нескольких объектов
     * @return boolean
     */
    public boolean containsAll(Collection<E> c);
    /**
     * Функция проверки на пустоту содержания нескольких объектов
     * @return boolean
     */
    public boolean isEmpty();
}
