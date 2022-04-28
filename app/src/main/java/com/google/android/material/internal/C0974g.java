package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: com.google.android.material.internal.g */
/* loaded from: classes.dex */
public class C0974g extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C0974g> CREATOR = new C0975a();

    /* renamed from: com.google.android.material.internal.g$a */
    /* loaded from: classes.dex */
    static class C0975a implements Parcelable.ClassLoaderCreator<C0974g> {
        C0975a() {
        }

        @Override // android.os.Parcelable.Creator
        public C0974g createFromParcel(Parcel parcel) {
            return new C0974g(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public C0974g createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0974g(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public C0974g[] newArray(int i) {
            return new C0974g[i];
        }
    }

    public C0974g() {
    }

    public C0974g(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
