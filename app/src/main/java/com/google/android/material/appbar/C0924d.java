package com.google.android.material.appbar;

import android.view.View;
import p000a.p018g.p029l.C0216r;

/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes.dex */
class C0924d {

    /* renamed from: a */
    private final View f3401a;

    /* renamed from: b */
    private int f3402b;

    /* renamed from: c */
    private int f3403c;

    /* renamed from: d */
    private int f3404d;

    /* renamed from: e */
    private int f3405e;

    public C0924d(View view) {
        this.f3401a = view;
    }

    /* renamed from: c */
    private void m316c() {
        View view = this.f3401a;
        C0216r.m3420d(view, this.f3404d - (view.getTop() - this.f3402b));
        View view2 = this.f3401a;
        C0216r.m3422c(view2, this.f3405e - (view2.getLeft() - this.f3403c));
    }

    /* renamed from: a */
    public int m320a() {
        return this.f3404d;
    }

    /* renamed from: a */
    public boolean m319a(int i) {
        if (this.f3405e == i) {
            return false;
        }
        this.f3405e = i;
        m316c();
        return true;
    }

    /* renamed from: b */
    public void m318b() {
        this.f3402b = this.f3401a.getTop();
        this.f3403c = this.f3401a.getLeft();
        m316c();
    }

    /* renamed from: b */
    public boolean m317b(int i) {
        if (this.f3404d == i) {
            return false;
        }
        this.f3404d = i;
        m316c();
        return true;
    }
}
