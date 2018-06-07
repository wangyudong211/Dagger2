package wyd.myapplication;


import dagger.Component;

/**
 * Created by wangyudong on 2018/5/24.
 */
@BookScope
@Component(modules = {DateModule.class})
public interface BookComponent {

    void inject(MainActivity activity);

}
