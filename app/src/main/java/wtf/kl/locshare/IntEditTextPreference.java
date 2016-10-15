package wtf.kl.locshare;

import android.content.Context;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.util.AttributeSet;

/**
 * Created by kenny on 10/15/16.
 */

public class IntEditTextPreference extends EditTextPreference {
    public IntEditTextPreference(Context context) { super(context); }
    public IntEditTextPreference(Context context, AttributeSet attrs) { super(context, attrs); }
    public IntEditTextPreference(Context context, AttributeSet attrs, int defStyle) { super(context, attrs, defStyle); }

    @Override
    protected String getPersistedString(String defaultReturnValue) {
        return String.valueOf(getPersistedInt(0));
    }

    @Override
    protected boolean persistString(String value) {
        return persistInt(Integer.valueOf(value));
    }
}
