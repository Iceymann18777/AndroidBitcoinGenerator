package p000a.p031h.p032a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.h.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0236c extends AbstractC0231a {

    /* renamed from: j */
    private int f697j;

    /* renamed from: k */
    private int f698k;

    /* renamed from: l */
    private LayoutInflater f699l;

    @Deprecated
    public AbstractC0236c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f698k = i;
        this.f697j = i;
        this.f699l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p000a.p031h.p032a.AbstractC0231a
    /* renamed from: a */
    public View mo3348a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f699l.inflate(this.f698k, viewGroup, false);
    }

    @Override // p000a.p031h.p032a.AbstractC0231a
    /* renamed from: b */
    public View mo1931b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f699l.inflate(this.f697j, viewGroup, false);
    }
}
