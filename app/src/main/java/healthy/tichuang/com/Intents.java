package healthy.tichuang.com;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;

/**
 * Created by punisher on 2017/3/1.
 */

public class Intents {

    public static final String INTENT_PREFIX = "healthy.tichuang.com.";

    /**
     * Intents静态内部类
     */
    public static class Builder {

        private final Intent intent;

        public Builder() {
            intent = new Intent();
        }

        public Builder(String actionSuffix) {
            intent = new Intent(INTENT_PREFIX + actionSuffix);
        }

        public Builder setClass(Context context, Class<?> cls) {
            intent.setClass(context, cls);
            return this;
        }

        public Builder setFlags(int flags) {
            intent.setFlags(flags);
            return this;
        }

        public Builder add(String fieldName, String value) {
            intent.putExtra(fieldName, value);
            return this;
        }

        public Builder add(String fieldName, CharSequence[] values) {
            intent.putExtra(fieldName, values);
            return this;
        }

        public Builder add(String fieldName, String[] values){
            intent.putExtra(fieldName, values);
            return this;
        }

        public Builder add(String fieldName, int value) {
            intent.putExtra(fieldName, value);
            return this;
        }

        public Builder add(String fieldName, int[] values) {
            intent.putExtra(fieldName, values);
            return this;
        }

        public Builder add(String fieldName, boolean[] values) {
            intent.putExtra(fieldName, values);
            return this;
        }

        public Builder add(String fieldName, Serializable value) {
            intent.putExtra(fieldName, value);
            return this;
        }

        public Builder add(Bundle bundle) {
            intent.putExtras(bundle);
            return this;
        }

        public Intent toIntent() {
            return intent;
        }
    }

}
