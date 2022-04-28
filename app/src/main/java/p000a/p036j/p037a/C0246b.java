package p000a.p036j.p037a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.j.a.b */
/* loaded from: classes.dex */
public final class C0246b implements Parcelable {
    public static final Parcelable.Creator<C0246b> CREATOR = new C0247a();

    /* renamed from: b */
    final int[] f752b;

    /* renamed from: c */
    final int f753c;

    /* renamed from: d */
    final int f754d;

    /* renamed from: e */
    final String f755e;

    /* renamed from: f */
    final int f756f;

    /* renamed from: g */
    final int f757g;

    /* renamed from: h */
    final CharSequence f758h;

    /* renamed from: i */
    final int f759i;

    /* renamed from: j */
    final CharSequence f760j;

    /* renamed from: k */
    final ArrayList<String> f761k;

    /* renamed from: l */
    final ArrayList<String> f762l;

    /* renamed from: m */
    final boolean f763m;

    /* renamed from: a.j.a.b$a */
    /* loaded from: classes.dex */
    static class C0247a implements Parcelable.Creator<C0246b> {
        C0247a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C0246b createFromParcel(Parcel parcel) {
            return new C0246b(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C0246b[] newArray(int i) {
            return new C0246b[i];
        }
    }

    public C0246b(C0244a aVar) {
        int size = aVar.f727b.size();
        this.f752b = new int[size * 6];
        if (aVar.f734i) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C0244a.C0245a aVar2 = aVar.f727b.get(i2);
                int[] iArr = this.f752b;
                int i3 = i + 1;
                iArr[i] = aVar2.f746a;
                int i4 = i3 + 1;
                ComponentCallbacksC0248c cVar = aVar2.f747b;
                iArr[i3] = cVar != null ? cVar.f793f : -1;
                int[] iArr2 = this.f752b;
                int i5 = i4 + 1;
                iArr2[i4] = aVar2.f748c;
                int i6 = i5 + 1;
                iArr2[i5] = aVar2.f749d;
                int i7 = i6 + 1;
                iArr2[i6] = aVar2.f750e;
                i = i7 + 1;
                iArr2[i7] = aVar2.f751f;
            }
            this.f753c = aVar.f732g;
            this.f754d = aVar.f733h;
            this.f755e = aVar.f735j;
            this.f756f = aVar.f737l;
            this.f757g = aVar.f738m;
            this.f758h = aVar.f739n;
            this.f759i = aVar.f740o;
            this.f760j = aVar.f741p;
            this.f761k = aVar.f742q;
            this.f762l = aVar.f743r;
            this.f763m = aVar.f744s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0246b(Parcel parcel) {
        this.f752b = parcel.createIntArray();
        this.f753c = parcel.readInt();
        this.f754d = parcel.readInt();
        this.f755e = parcel.readString();
        this.f756f = parcel.readInt();
        this.f757g = parcel.readInt();
        this.f758h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f759i = parcel.readInt();
        this.f760j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f761k = parcel.createStringArrayList();
        this.f762l = parcel.createStringArrayList();
        this.f763m = parcel.readInt() != 0;
    }

    /* renamed from: a */
    public C0244a m3285a(LayoutInflater$Factory2C0266i iVar) {
        C0244a aVar = new C0244a(iVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f752b.length) {
            C0244a.C0245a aVar2 = new C0244a.C0245a();
            int i3 = i + 1;
            aVar2.f746a = this.f752b[i];
            if (LayoutInflater$Factory2C0266i.f855F) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f752b[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f752b[i3];
            aVar2.f747b = i5 >= 0 ? iVar.f868f.get(i5) : null;
            int[] iArr = this.f752b;
            int i6 = i4 + 1;
            aVar2.f748c = iArr[i4];
            int i7 = i6 + 1;
            aVar2.f749d = iArr[i6];
            int i8 = i7 + 1;
            aVar2.f750e = iArr[i7];
            i = i8 + 1;
            aVar2.f751f = iArr[i8];
            aVar.f728c = aVar2.f748c;
            aVar.f729d = aVar2.f749d;
            aVar.f730e = aVar2.f750e;
            aVar.f731f = aVar2.f751f;
            aVar.m3300a(aVar2);
            i2++;
        }
        aVar.f732g = this.f753c;
        aVar.f733h = this.f754d;
        aVar.f735j = this.f755e;
        aVar.f737l = this.f756f;
        aVar.f734i = true;
        aVar.f738m = this.f757g;
        aVar.f739n = this.f758h;
        aVar.f740o = this.f759i;
        aVar.f741p = this.f760j;
        aVar.f742q = this.f761k;
        aVar.f743r = this.f762l;
        aVar.f744s = this.f763m;
        aVar.m3303a(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f752b);
        parcel.writeInt(this.f753c);
        parcel.writeInt(this.f754d);
        parcel.writeString(this.f755e);
        parcel.writeInt(this.f756f);
        parcel.writeInt(this.f757g);
        TextUtils.writeToParcel(this.f758h, parcel, 0);
        parcel.writeInt(this.f759i);
        TextUtils.writeToParcel(this.f760j, parcel, 0);
        parcel.writeStringList(this.f761k);
        parcel.writeStringList(this.f762l);
        parcel.writeInt(this.f763m ? 1 : 0);
    }
}
