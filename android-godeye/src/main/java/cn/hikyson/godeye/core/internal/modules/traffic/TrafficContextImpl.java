package cn.hikyson.godeye.core.internal.modules.traffic;

/**
 * Created by kysonchao on 2017/11/24.
 */
public class TrafficContextImpl implements TrafficContext {

    @Override
    public long intervalMillis() {
        return 2000;
    }

    @Override
    public long sampleMillis() {
        return 1000;
    }
}
