package p000a.p018g.p021e;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p000a.p018g.p026i.C0161b;

/* renamed from: a.g.e.d */
/* loaded from: classes.dex */
class C0146d extends C0150h {
    /* renamed from: a */
    private File m3647a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public Typeface mo3625a(Context context, CancellationSignal cancellationSignal, C0161b.C0167f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        C0161b.C0167f a = m3623a(fVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a.m3583c(), "r", cancellationSignal);
            File a2 = m3647a(openFileDescriptor);
            if (a2 != null && a2.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(a2);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface a3 = super.m3624a(context, fileInputStream);
            fileInputStream.close();
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
            return a3;
        } catch (IOException unused) {
            return null;
        }
    }
}
