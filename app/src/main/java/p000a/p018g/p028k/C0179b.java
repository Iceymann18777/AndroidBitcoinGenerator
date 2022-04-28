package p000a.p018g.p028k;

import android.util.Log;
import java.io.Writer;

/* renamed from: a.g.k.b */
/* loaded from: classes.dex */
public class C0179b extends Writer {

    /* renamed from: b */
    private final String f631b;

    /* renamed from: c */
    private StringBuilder f632c = new StringBuilder(128);

    public C0179b(String str) {
        this.f631b = str;
    }

    /* renamed from: a */
    private void m3563a() {
        if (this.f632c.length() > 0) {
            Log.d(this.f631b, this.f632c.toString());
            StringBuilder sb = this.f632c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m3563a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m3563a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m3563a();
            } else {
                this.f632c.append(c);
            }
        }
    }
}
