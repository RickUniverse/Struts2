package org.struts2.valuestack;

import org.struts2.pojo.Person;

import java.util.Comparator;

/**
 * @author lijichen
 * @date 2020/10/27 - 17:19
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
