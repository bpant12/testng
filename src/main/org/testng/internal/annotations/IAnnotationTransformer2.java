package org.testng.internal.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public interface IAnnotationTransformer2 extends IAnnotationTransformer {
  public void transform(IConfiguration annotation, Class testClass,
      Constructor testConstructor, Method testMethod);
  
  public void transform(IDataProvider annotation, Method testMethod);

  public void transform(IFactory annotation, Method testMethod);
}