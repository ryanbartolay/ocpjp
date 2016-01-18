package com.ryan.standard.test1;


abstract class SomeClass {   public abstract void m1(); }
public class Number21
{
  public static SomeClass getSomeClass()  //note static
  {
     return new SomeClass()
        {
            public void m1() { }
        };
  }
}
