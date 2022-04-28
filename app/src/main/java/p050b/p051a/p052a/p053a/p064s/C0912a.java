package p050b.p051a.p052a.p053a.p064s;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p013d.C0080g;
import p000a.p033i.p034a.AbstractC0237a;

/* renamed from: b.a.a.a.s.a */
/* loaded from: classes.dex */
public class C0912a extends AbstractC0237a {
    public static final Parcelable.Creator<C0912a> CREATOR = new C0913a();

    /* renamed from: d */
    public final C0080g<String, Bundle> f3355d;

    /* renamed from: b.a.a.a.s.a$a */
    /* loaded from: classes.dex */
    static class C0913a implements Parcelable.ClassLoaderCreator<C0912a> {
        C0913a() {
        }

        @Override // android.os.Parcelable.Creator
        public C0912a createFromParcel(Parcel parcel) {
            return new C0912a(parcel, null, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public C0912a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0912a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public C0912a[] newArray(int i) {
            return new C0912a[i];
        }
    }

    private C0912a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f3355d = new C0080g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f3355d.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ C0912a(Parcel parcel, ClassLoader classLoader, C0913a aVar) {
        this(parcel, classLoader);
    }

    public C0912a(Parcelable parcelable) {
        super(parcelable);
        this.f3355d = new C0080g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f3355d + "}";
    }

    @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f3355d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f3355d.m4016b(i2);
            bundleArr[i2] = this.f3355d.m4013d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
