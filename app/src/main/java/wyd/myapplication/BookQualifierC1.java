package wyd.myapplication;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by wangyudong on 2018/6/4.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface BookQualifierC1 {
}
