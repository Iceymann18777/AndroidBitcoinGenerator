package p000a.p036j.p037a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.j.a.k */
/* loaded from: classes.dex */
public final class C0283k implements Parcelable {
    public static final Parcelable.Creator<C0283k> CREATOR = new C0284a();

    /* renamed from: b */
    C0285l[] f921b;

    /* renamed from: c */
    int[] f922c;

    /* renamed from: d */
    C0246b[] f923d;

    /* renamed from: e */
    int f924e;

    /* renamed from: f */
    int f925f;

    /* renamed from: a.j.a.k$a */
    /* loaded from: classes.dex */
    static class C0284a implements Parcelable.Creator<C0283k> {
        C0284a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C0283k createFromParcel(Parcel parcel) {
            return new C0283k(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C0283k[] newArray(int i) {
            return new C0283k[i];
        }
    }

    public C0283k() {
        this.f924e = -1;
    }

    public C0283k(Parcel parcel) {
        this.f924e = -1;
        this.f921b = (C0285l[]) parcel.createTypedArray(C0285l.CREATOR);
        this.f922c = parcel.createIntArray();
        this.f923d = (C0246b[]) parcel.createTypedArray(C0246b.CREATOR);
        this.f924e = parcel.readInt();
        this.f925f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f921b, i);
        parcel.writeIntArray(this.f922c);
        parcel.writeTypedArray(this.f923d, i);
        parcel.writeInt(this.f924e);
        parcel.writeInt(this.f925f);
    }
}
