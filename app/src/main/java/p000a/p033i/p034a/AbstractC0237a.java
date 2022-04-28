package p000a.p033i.p034a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.i.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0237a implements Parcelable {

    /* renamed from: b */
    private final Parcelable f701b;

    /* renamed from: c */
    public static final AbstractC0237a f700c = new C0238a();
    public static final Parcelable.Creator<AbstractC0237a> CREATOR = new C0239b();

    /* renamed from: a.i.a.a$a */
    /* loaded from: classes.dex */
    static class C0238a extends AbstractC0237a {
        C0238a() {
            super((C0238a) null);
        }
    }

    /* renamed from: a.i.a.a$b */
    /* loaded from: classes.dex */
    static class C0239b implements Parcelable.ClassLoaderCreator<AbstractC0237a> {
        C0239b() {
        }

        @Override // android.os.Parcelable.Creator
        public AbstractC0237a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbstractC0237a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC0237a.f700c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public AbstractC0237a[] newArray(int i) {
            return new AbstractC0237a[i];
        }
    }

    private AbstractC0237a() {
        this.f701b = null;
    }

    /* synthetic */ AbstractC0237a(C0238a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0237a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f701b = readParcelable == null ? f700c : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0237a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f701b = parcelable == f700c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* renamed from: a */
    public final Parcelable m3347a() {
        return this.f701b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f701b, i);
    }
}
