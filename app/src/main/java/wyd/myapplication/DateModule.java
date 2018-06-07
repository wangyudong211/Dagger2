package wyd.myapplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wangyudong on 2018/5/24.
 */
@Module
public class DateModule {
    int mid;
    String mName;

    public DateModule(int id, String name) {
        mid = id;
        mName = name;
    }

    @Provides
    public Phone providePhone(){
        return new Phone(mid);
    }
    @BookQualifierC1
    @Provides
    public Book provideBookC1(){
        return new Book(mid);
    }
    @BookQualifierC2
    @Provides
    @BookScope
    public Book provideBookC2(){
        return new Book(mid, mName);
    }

}
