package org.example;

import org.example.service.ThreadClass;
import org.example.service.ThreadClassImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ThreadClassImpl t = new ThreadClassImpl(1);
        t.start();

        ThreadClassImpl t2 = new ThreadClassImpl(2);
        t2.start();
    }
}


