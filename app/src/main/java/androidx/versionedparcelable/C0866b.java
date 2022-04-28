package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C0866b extends AbstractC0865a {

    /* renamed from: a */
    private final SparseIntArray f3273a;

    /* renamed from: b */
    private final Parcel f3274b;

    /* renamed from: c */
    private final int f3275c;

    /* renamed from: d */
    private final int f3276d;

    /* renamed from: e */
    private final String f3277e;

    /* renamed from: f */
    private int f3278f;

    /* renamed from: g */
    private int f3279g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0866b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    C0866b(Parcel parcel, int i, int i2, String str) {
        this.f3273a = new SparseIntArray();
        this.f3278f = -1;
        this.f3279g = 0;
        this.f3274b = parcel;
        this.f3275c = i;
        this.f3276d = i2;
        this.f3279g = this.f3275c;
        this.f3277e = str;
    }

    /* renamed from: d */
    private int m488d(int i) {
        int readInt;
        do {
            int i2 = this.f3279g;
            if (i2 >= this.f3276d) {
                return -1;
            }
            this.f3274b.setDataPosition(i2);
            int readInt2 = this.f3274b.readInt();
            readInt = this.f3274b.readInt();
            this.f3279g += readInt2;
        } while (readInt != i);
        return this.f3274b.dataPosition();
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public void mo497a() {
        int i = this.f3278f;
        if (i >= 0) {
            int i2 = this.f3273a.get(i);
            int dataPosition = this.f3274b.dataPosition();
            this.f3274b.setDataPosition(i2);
            this.f3274b.writeInt(dataPosition - i2);
            this.f3274b.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public void mo495a(Parcelable parcelable) {
        this.f3274b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public void mo494a(String str) {
        this.f3274b.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public void mo493a(byte[] bArr) {
        if (bArr != null) {
            this.f3274b.writeInt(bArr.length);
            this.f3274b.writeByteArray(bArr);
            return;
        }
        this.f3274b.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: a */
    public boolean mo496a(int i) {
        int d = m488d(i);
        if (d == -1) {
            return false;
        }
        this.f3274b.setDataPosition(d);
        return true;
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: b */
    protected AbstractC0865a mo492b() {
        Parcel parcel = this.f3274b;
        int dataPosition = parcel.dataPosition();
        int i = this.f3279g;
        if (i == this.f3275c) {
            i = this.f3276d;
        }
        return new C0866b(parcel, dataPosition, i, this.f3277e + "  ");
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: b */
    public void mo491b(int i) {
        mo497a();
        this.f3278f = i;
        this.f3273a.put(i, this.f3274b.dataPosition());
        mo490c(0);
        mo490c(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: c */
    public void mo490c(int i) {
        this.f3274b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: d */
    public byte[] mo489d() {
        int readInt = this.f3274b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3274b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: e */
    public int mo487e() {
        return this.f3274b.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: f */
    public <T extends Parcelable> T mo486f() {
        return (T) this.f3274b.readParcelable(C0866b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC0865a
    /* renamed from: g */
    public String mo485g() {
        return this.f3274b.readString();
    }
}
