package cn.linhome.dialog;

import android.app.Activity;

import cn.linhome.lib.dialog.impl.SDDialogConfirm;

/**
 * Created by Administrator on 2017/9/4.
 */

public class CustomDialog extends SDDialogConfirm
{
    public CustomDialog(Activity activity)
    {
        super(activity);
        setCustomView(R.layout.dialog_custom);
    }
}
