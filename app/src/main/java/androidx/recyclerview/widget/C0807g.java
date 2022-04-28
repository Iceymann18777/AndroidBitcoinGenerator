package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
class C0807g {

    /* renamed from: b */
    int f3057b;

    /* renamed from: c */
    int f3058c;

    /* renamed from: d */
    int f3059d;

    /* renamed from: e */
    int f3060e;

    /* renamed from: h */
    boolean f3063h;

    /* renamed from: i */
    boolean f3064i;

    /* renamed from: a */
    boolean f3056a = true;

    /* renamed from: f */
    int f3061f = 0;

    /* renamed from: g */
    int f3062g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m1055a(C0813j.C0847v vVar) {
        View d = vVar.m603d(this.f3058c);
        this.f3058c += this.f3059d;
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m1056a(C0813j.C0815a0 a0Var) {
        int i = this.f3058c;
        return i >= 0 && i < a0Var.m907a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3057b + ", mCurrentPosition=" + this.f3058c + ", mItemDirection=" + this.f3059d + ", mLayoutDirection=" + this.f3060e + ", mStartLine=" + this.f3061f + ", mEndLine=" + this.f3062g + '}';
    }
}
