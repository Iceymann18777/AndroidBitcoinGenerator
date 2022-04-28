package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC0865a {
    /* renamed from: a */
    protected static <T extends AbstractC0867c> T m508a(String str, AbstractC0865a aVar) {
        try {
            return (T) ((AbstractC0867c) Class.forName(str, true, AbstractC0865a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0865a.class).invoke(null, aVar));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: a */
    private static Class m510a(Class<? extends AbstractC0867c> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }

    /* renamed from: a */
    protected static <T extends AbstractC0867c> void m511a(T t, AbstractC0865a aVar) {
        try {
            m503b(t).getDeclaredMethod("write", t.getClass(), AbstractC0865a.class).invoke(null, t, aVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: b */
    private static <T extends AbstractC0867c> Class m503b(T t) {
        return m510a((Class<? extends AbstractC0867c>) t.getClass());
    }

    /* renamed from: c */
    private void m499c(AbstractC0867c cVar) {
        try {
            mo494a(m510a((Class<? extends AbstractC0867c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: a */
    public int m514a(int i, int i2) {
        return !mo496a(i2) ? i : mo487e();
    }

    /* renamed from: a */
    public <T extends Parcelable> T m513a(T t, int i) {
        return !mo496a(i) ? t : (T) mo486f();
    }

    /* renamed from: a */
    public String m509a(String str, int i) {
        return !mo496a(i) ? str : mo485g();
    }

    /* renamed from: a */
    protected abstract void mo497a();

    /* renamed from: a */
    protected abstract void mo495a(Parcelable parcelable);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m512a(AbstractC0867c cVar) {
        if (cVar == null) {
            mo494a((String) null);
            return;
        }
        m499c(cVar);
        AbstractC0865a b = mo492b();
        m511a(cVar, b);
        b.mo497a();
    }

    /* renamed from: a */
    protected abstract void mo494a(String str);

    /* renamed from: a */
    public void m507a(boolean z, boolean z2) {
    }

    /* renamed from: a */
    protected abstract void mo493a(byte[] bArr);

    /* renamed from: a */
    protected abstract boolean mo496a(int i);

    /* renamed from: a */
    public byte[] m506a(byte[] bArr, int i) {
        return !mo496a(i) ? bArr : mo489d();
    }

    /* renamed from: b */
    protected abstract AbstractC0865a mo492b();

    /* renamed from: b */
    protected abstract void mo491b(int i);

    /* renamed from: b */
    public void m505b(int i, int i2) {
        mo491b(i2);
        mo490c(i);
    }

    /* renamed from: b */
    public void m504b(Parcelable parcelable, int i) {
        mo491b(i);
        mo495a(parcelable);
    }

    /* renamed from: b */
    public void m502b(String str, int i) {
        mo491b(i);
        mo494a(str);
    }

    /* renamed from: b */
    public void m501b(byte[] bArr, int i) {
        mo491b(i);
        mo493a(bArr);
    }

    /* renamed from: c */
    protected abstract void mo490c(int i);

    /* renamed from: c */
    public boolean m500c() {
        return false;
    }

    /* renamed from: d */
    protected abstract byte[] mo489d();

    /* renamed from: e */
    protected abstract int mo487e();

    /* renamed from: f */
    protected abstract <T extends Parcelable> T mo486f();

    /* renamed from: g */
    protected abstract String mo485g();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends AbstractC0867c> T m498h() {
        String g = mo485g();
        if (g == null) {
            return null;
        }
        return (T) m508a(g, mo492b());
    }
}
