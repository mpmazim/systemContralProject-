package com.test.testunuversal;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

public class DeviceAdminLock extends DeviceAdminReceiver {

@Override
public void onEnabled(Context context, Intent intent) {
}

@Override
public CharSequence onDisableRequested(Context context, Intent intent) {
    return "This is an optional message to warn the user about disabling.";
}

@Override
public void onDisabled(Context context, Intent intent) {
}

@Override
public void onPasswordChanged(Context context, Intent intent) {
}

@Override
public void onPasswordFailed(Context context, Intent intent) {
}

@Override
public void onPasswordSucceeded(Context context, Intent intent) {
}

}