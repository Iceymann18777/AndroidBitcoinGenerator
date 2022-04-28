package me.createbitcoins.androidbitcoingenerator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.widget.Toast;

/* renamed from: me.createbitcoins.androidbitcoingenerator.d */
/* loaded from: classes.dex */
public class C1038d extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        View$OnClickListenerC1010c cVar;
        String str;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (intent.getBooleanExtra("noConnectivity", false)) {
                cVar = View$OnClickListenerC1010c.m8a0();
                i = Color.parseColor("#FF0000");
                str = " Offline";
            } else {
                Toast.makeText(context, "Injection Service available.", 1).show();
                cVar = View$OnClickListenerC1010c.m8a0();
                i = Color.parseColor("#09FB10");
                str = " Online";
            }
            cVar.m10a(str, i);
        }
    }
}
