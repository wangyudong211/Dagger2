package wyd.myapplication;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by wangyudong on 2018/5/24.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface BookScope {
}
