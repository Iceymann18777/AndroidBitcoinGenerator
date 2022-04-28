package p000a.p036j.p037a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.C0761r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.j.a.l */
/* loaded from: classes.dex */
public final class C0285l implements Parcelable {
    public static final Parcelable.Creator<C0285l> CREATOR = new C0286a();

    /* renamed from: b */
    final String f926b;

    /* renamed from: c */
    final int f927c;

    /* renamed from: d */
    final boolean f928d;

    /* renamed from: e */
    final int f929e;

    /* renamed from: f */
    final int f930f;

    /* renamed from: g */
    final String f931g;

    /* renamed from: h */
    final boolean f932h;

    /* renamed from: i */
    final boolean f933i;

    /* renamed from: j */
    final Bundle f934j;

    /* renamed from: k */
    final boolean f935k;

    /* renamed from: l */
    Bundle f936l;

    /* renamed from: m */
    ComponentCallbacksC0248c f937m;

    /* renamed from: a.j.a.l$a */
    /* loaded from: classes.dex */
    static class C0286a implements Parcelable.Creator<C0285l> {
        C0286a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C0285l createFromParcel(Parcel parcel) {
            return new C0285l(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C0285l[] newArray(int i) {
            return new C0285l[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0285l(ComponentCallbacksC0248c cVar) {
        this.f926b = cVar.getClass().getName();
        this.f927c = cVar.f793f;
        this.f928d = cVar.f801n;
        this.f929e = cVar.f812y;
        this.f930f = cVar.f813z;
        this.f931g = cVar.f766A;
        this.f932h = cVar.f769D;
        this.f933i = cVar.f768C;
        this.f934j = cVar.f795h;
        this.f935k = cVar.f767B;
    }

    C0285l(Parcel parcel) {
        this.f926b = parcel.readString();
        this.f927c = parcel.readInt();
        boolean z = true;
        this.f928d = parcel.readInt() != 0;
        this.f929e = parcel.readInt();
        this.f930f = parcel.readInt();
        this.f931g = parcel.readString();
        this.f932h = parcel.readInt() != 0;
        this.f933i = parcel.readInt() != 0;
        this.f934j = parcel.readBundle();
        this.f935k = parcel.readInt() == 0 ? false : z;
        this.f936l = parcel.readBundle();
    }

    /* renamed from: a */
    public ComponentCallbacksC0248c m2995a(AbstractC0261g gVar, AbstractC0259e eVar, ComponentCallbacksC0248c cVar, C0282j jVar, C0761r rVar) {
        if (this.f937m == null) {
            Context c = gVar.m3136c();
            Bundle bundle = this.f934j;
            if (bundle != null) {
                bundle.setClassLoader(c.getClassLoader());
            }
            this.f937m = eVar != null ? eVar.mo3168a(c, this.f926b, this.f934j) : ComponentCallbacksC0248c.m3245a(c, this.f926b, this.f934j);
            Bundle bundle2 = this.f936l;
            if (bundle2 != null) {
                bundle2.setClassLoader(c.getClassLoader());
                this.f937m.f790c = this.f936l;
            }
            this.f937m.m3256a(this.f927c, cVar);
            ComponentCallbacksC0248c cVar2 = this.f937m;
            cVar2.f801n = this.f928d;
            cVar2.f803p = true;
            cVar2.f812y = this.f929e;
            cVar2.f813z = this.f930f;
            cVar2.f766A = this.f931g;
            cVar2.f769D = this.f932h;
            cVar2.f768C = this.f933i;
            cVar2.f767B = this.f935k;
            cVar2.f806s = gVar.f854d;
            if (LayoutInflater$Factory2C0266i.f855F) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f937m);
            }
        }
        ComponentCallbacksC0248c cVar3 = this.f937m;
        cVar3.f809v = jVar;
        cVar3.f810w = rVar;
        return cVar3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f926b);
        parcel.writeInt(this.f927c);
        parcel.writeInt(this.f928d ? 1 : 0);
        parcel.writeInt(this.f929e);
        parcel.writeInt(this.f930f);
        parcel.writeString(this.f931g);
        parcel.writeInt(this.f932h ? 1 : 0);
        parcel.writeInt(this.f933i ? 1 : 0);
        parcel.writeBundle(this.f934j);
        parcel.writeInt(this.f935k ? 1 : 0);
        parcel.writeBundle(this.f936l);
    }
}
