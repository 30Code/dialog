package cn.linhome.dialog;

import android.app.Activity;

import cn.linhome.lib.dialog.impl.FDialogConfirm;

/**
 * Created by Administrator on 2017/9/4.
 */

public class CustomDialog extends FDialogConfirm
{
    public CustomDialog(Activity activity)
    {
        super(activity);
        setCustomView(R.layout.dialog_custom);
    }
}
