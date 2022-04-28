package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p018g.p019d.C0124a;
import p000a.p018g.p022f.p023a.AbstractMenuC0155a;
import p000a.p018g.p029l.C0220s;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public class C0496h implements AbstractMenuC0155a {

    /* renamed from: A */
    private static final int[] f1702A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1703a;

    /* renamed from: b */
    private final Resources f1704b;

    /* renamed from: c */
    private boolean f1705c;

    /* renamed from: d */
    private boolean f1706d;

    /* renamed from: e */
    private AbstractC0497a f1707e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1715m;

    /* renamed from: n */
    CharSequence f1716n;

    /* renamed from: o */
    Drawable f1717o;

    /* renamed from: p */
    View f1718p;

    /* renamed from: x */
    private C0501k f1726x;

    /* renamed from: z */
    private boolean f1728z;

    /* renamed from: l */
    private int f1714l = 0;

    /* renamed from: q */
    private boolean f1719q = false;

    /* renamed from: r */
    private boolean f1720r = false;

    /* renamed from: s */
    private boolean f1721s = false;

    /* renamed from: t */
    private boolean f1722t = false;

    /* renamed from: u */
    private boolean f1723u = false;

    /* renamed from: v */
    private ArrayList<C0501k> f1724v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<AbstractC0513p>> f1725w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f1727y = false;

    /* renamed from: f */
    private ArrayList<C0501k> f1708f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0501k> f1709g = new ArrayList<>();

    /* renamed from: h */
    private boolean f1710h = true;

    /* renamed from: i */
    private ArrayList<C0501k> f1711i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0501k> f1712j = new ArrayList<>();

    /* renamed from: k */
    private boolean f1713k = true;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    /* loaded from: classes.dex */
    public interface AbstractC0497a {
        /* renamed from: a */
        void mo65a(C0496h hVar);

        /* renamed from: a */
        boolean mo64a(C0496h hVar, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    /* loaded from: classes.dex */
    public interface AbstractC0498b {
        /* renamed from: a */
        boolean mo2265a(C0501k kVar);
    }

    public C0496h(Context context) {
        this.f1703a = context;
        this.f1704b = context.getResources();
        m2385e(true);
    }

    /* renamed from: a */
    private static int m2404a(ArrayList<C0501k> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m2360c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0501k m2419a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0501k(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m2416a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = m2376l();
        if (view != null) {
            this.f1718p = view;
            this.f1716n = null;
            this.f1717o = null;
        } else {
            if (i > 0) {
                this.f1716n = l.getText(i);
            } else if (charSequence != null) {
                this.f1716n = charSequence;
            }
            if (i2 > 0) {
                this.f1717o = C0124a.m3732b(m2388e(), i2);
            } else if (drawable != null) {
                this.f1717o = drawable;
            }
            this.f1718p = null;
        }
        mo87b(false);
    }

    /* renamed from: a */
    private void m2415a(int i, boolean z) {
        if (i >= 0 && i < this.f1708f.size()) {
            this.f1708f.remove(i);
            if (z) {
                mo87b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m2406a(SubMenuC0523v vVar, AbstractC0513p pVar) {
        boolean z = false;
        if (this.f1725w.isEmpty()) {
            return false;
        }
        if (pVar != null) {
            z = pVar.mo124a(vVar);
        }
        Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0513p> next = it.next();
            AbstractC0513p pVar2 = next.get();
            if (pVar2 == null) {
                this.f1725w.remove(next);
            } else if (!z) {
                z = pVar2.mo124a(vVar);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m2389d(boolean z) {
        if (!this.f1725w.isEmpty()) {
            m2373s();
            Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0513p> next = it.next();
                AbstractC0513p pVar = next.get();
                if (pVar == null) {
                    this.f1725w.remove(next);
                } else {
                    pVar.mo123a(z);
                }
            }
            m2374r();
        }
    }

    /* renamed from: e */
    private void m2386e(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f1725w.isEmpty()) {
            Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0513p> next = it.next();
                AbstractC0513p pVar = next.get();
                if (pVar == null) {
                    this.f1725w.remove(next);
                } else {
                    int a = pVar.mo136a();
                    if (a > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(a)) != null) {
                        pVar.mo130a(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m2385e(boolean z) {
        boolean z2 = true;
        if (!z || this.f1704b.getConfiguration().keyboard == 1 || !C0220s.m3382d(ViewConfiguration.get(this.f1703a), this.f1703a)) {
            z2 = false;
        }
        this.f1706d = z2;
    }

    /* renamed from: f */
    private static int m2383f(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1702A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: f */
    private void m2382f(Bundle bundle) {
        Parcelable c;
        if (!this.f1725w.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0513p> next = it.next();
                AbstractC0513p pVar = next.get();
                if (pVar == null) {
                    this.f1725w.remove(next);
                } else {
                    int a = pVar.mo136a();
                    if (a > 0 && (c = pVar.mo117c()) != null) {
                        sparseArray.put(a, c);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: a */
    public int m2421a(int i) {
        return m2420a(i, 0);
    }

    /* renamed from: a */
    public int m2420a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1708f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem m2418a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m2383f(i3);
        C0501k a = m2419a(i, i2, i3, f, charSequence, this.f1714l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1715m;
        if (contextMenuInfo != null) {
            a.m2367a(contextMenuInfo);
        }
        ArrayList<C0501k> arrayList = this.f1708f;
        arrayList.add(m2404a(arrayList, f), a);
        mo87b(true);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0496h m2414a(Drawable drawable) {
        m2416a(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0496h m2409a(View view) {
        m2416a(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0496h m2405a(CharSequence charSequence) {
        m2416a(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: a */
    C0501k m2417a(int i, KeyEvent keyEvent) {
        ArrayList<C0501k> arrayList = this.f1724v;
        arrayList.clear();
        m2403a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean p = mo2295p();
        for (int i2 = 0; i2 < size; i2++) {
            C0501k kVar = arrayList.get(i2);
            char alphabeticShortcut = p ? kVar.getAlphabeticShortcut() : kVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (p && alphabeticShortcut == '\b' && i == 67))) {
                return kVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m2422a() {
        AbstractC0497a aVar = this.f1707e;
        if (aVar != null) {
            aVar.mo65a(this);
        }
    }

    /* renamed from: a */
    public void m2413a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2298d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC0523v) item.getSubMenu()).m2413a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2412a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1708f.size();
        m2373s();
        for (int i = 0; i < size; i++) {
            C0501k kVar = this.f1708f.get(i);
            if (kVar.getGroupId() == groupId && kVar.m2351i() && kVar.isCheckable()) {
                kVar.m2361b(kVar == menuItem);
            }
        }
        m2374r();
    }

    /* renamed from: a */
    public void mo2302a(AbstractC0497a aVar) {
        this.f1707e = aVar;
    }

    /* renamed from: a */
    public void m2408a(AbstractC0513p pVar) {
        m2407a(pVar, this.f1703a);
    }

    /* renamed from: a */
    public void m2407a(AbstractC0513p pVar, Context context) {
        this.f1725w.add(new WeakReference<>(pVar));
        pVar.mo133a(context, this);
        this.f1713k = true;
    }

    /* renamed from: a */
    void m2403a(List<C0501k> list, int i, KeyEvent keyEvent) {
        boolean p = mo2295p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1708f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0501k kVar = this.f1708f.get(i2);
                if (kVar.hasSubMenu()) {
                    ((C0496h) kVar.getSubMenu()).m2403a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? kVar.getAlphabeticShortcut() : kVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? kVar.getAlphabeticModifiers() : kVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == '\b' && i == 67)) && kVar.isEnabled()) {
                        list.add(kVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2402a(boolean z) {
        if (!this.f1723u) {
            this.f1723u = true;
            Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0513p> next = it.next();
                AbstractC0513p pVar = next.get();
                if (pVar == null) {
                    this.f1725w.remove(next);
                } else {
                    pVar.mo126a(this, z);
                }
            }
            this.f1723u = false;
        }
    }

    /* renamed from: a */
    public boolean m2411a(MenuItem menuItem, int i) {
        return m2410a(menuItem, (AbstractC0513p) null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        m2402a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
        return r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m2410a(android.view.MenuItem r7, androidx.appcompat.view.menu.AbstractC0513p r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.k r7 = (androidx.appcompat.view.menu.C0501k) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.m2353g()
            a.g.l.b r2 = r7.mo2370a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo2344a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.m2354f()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.m2402a(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.m2402a(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.v r9 = new androidx.appcompat.view.menu.v
            android.content.Context r0 = r6.m2388e()
            r9.<init>(r0, r6, r7)
            r7.m2365a(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.v r7 = (androidx.appcompat.view.menu.SubMenuC0523v) r7
            if (r4 == 0) goto L_0x0063
            r2.mo2343a(r7)
        L_0x0063:
            boolean r7 = r6.m2406a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0496h.m2410a(android.view.MenuItem, androidx.appcompat.view.menu.p, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2301a(C0496h hVar, MenuItem menuItem) {
        AbstractC0497a aVar = this.f1707e;
        return aVar != null && aVar.mo64a(hVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo2300a(C0501k kVar) {
        boolean z = false;
        if (!this.f1725w.isEmpty() && this.f1726x == kVar) {
            m2373s();
            Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0513p> next = it.next();
                AbstractC0513p pVar = next.get();
                if (pVar == null) {
                    this.f1725w.remove(next);
                } else {
                    z = pVar.mo119b(this, kVar);
                    if (z) {
                        break;
                    }
                }
            }
            m2374r();
            if (z) {
                this.f1726x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m2418a(0, 0, 0, this.f1704b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2418a(i, i2, i3, this.f1704b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2418a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m2418a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1703a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1704b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1704b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0501k kVar = (C0501k) m2418a(i, i2, i3, charSequence);
        SubMenuC0523v vVar = new SubMenuC0523v(this.f1703a, this, kVar);
        kVar.m2365a(vVar);
        return vVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int m2400b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1708f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m2401b() {
        ArrayList<C0501k> n = m2375n();
        if (this.f1713k) {
            Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<AbstractC0513p> next = it.next();
                AbstractC0513p pVar = next.get();
                if (pVar == null) {
                    this.f1725w.remove(next);
                } else {
                    z |= pVar.mo122b();
                }
            }
            if (z) {
                this.f1711i.clear();
                this.f1712j.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0501k kVar = n.get(i);
                    (kVar.m2352h() ? this.f1711i : this.f1712j).add(kVar);
                }
            } else {
                this.f1711i.clear();
                this.f1712j.clear();
                this.f1712j.addAll(m2375n());
            }
            this.f1713k = false;
        }
    }

    /* renamed from: b */
    public void m2399b(Bundle bundle) {
        m2386e(bundle);
    }

    /* renamed from: b */
    public void m2398b(AbstractC0513p pVar) {
        Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0513p> next = it.next();
            AbstractC0513p pVar2 = next.get();
            if (pVar2 == null || pVar2 == pVar) {
                this.f1725w.remove(next);
            }
        }
    }

    /* renamed from: b */
    public void mo87b(boolean z) {
        if (!this.f1719q) {
            if (z) {
                this.f1710h = true;
                this.f1713k = true;
            }
            m2389d(z);
            return;
        }
        this.f1720r = true;
        if (z) {
            this.f1721s = true;
        }
    }

    /* renamed from: b */
    public boolean mo2299b(C0501k kVar) {
        boolean z = false;
        if (this.f1725w.isEmpty()) {
            return false;
        }
        m2373s();
        Iterator<WeakReference<AbstractC0513p>> it = this.f1725w.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0513p> next = it.next();
            AbstractC0513p pVar = next.get();
            if (pVar == null) {
                this.f1725w.remove(next);
            } else {
                z = pVar.mo127a(this, kVar);
                if (z) {
                    break;
                }
            }
        }
        m2374r();
        if (z) {
            this.f1726x = kVar;
        }
        return z;
    }

    /* renamed from: c */
    public C0496h m2396c(int i) {
        this.f1714l = i;
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0501k> m2397c() {
        m2401b();
        return this.f1711i;
    }

    /* renamed from: c */
    public void m2395c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0523v) item.getSubMenu()).m2395c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2298d(), sparseArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2394c(C0501k kVar) {
        this.f1713k = true;
        mo87b(true);
    }

    /* renamed from: c */
    public void m2393c(boolean z) {
        this.f1728z = z;
    }

    @Override // android.view.Menu
    public void clear() {
        C0501k kVar = this.f1726x;
        if (kVar != null) {
            mo2300a(kVar);
        }
        this.f1708f.clear();
        mo87b(true);
    }

    public void clearHeader() {
        this.f1717o = null;
        this.f1716n = null;
        this.f1718p = null;
        mo87b(false);
    }

    @Override // android.view.Menu
    public void close() {
        m2402a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public C0496h m2392d(int i) {
        m2416a(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String mo2298d() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: d */
    public void m2391d(Bundle bundle) {
        m2382f(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2390d(C0501k kVar) {
        this.f1710h = true;
        mo87b(true);
    }

    /* renamed from: e */
    public Context m2388e() {
        return this.f1703a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public C0496h m2387e(int i) {
        m2416a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: f */
    public C0501k m2384f() {
        return this.f1726x;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0501k kVar = this.f1708f.get(i2);
            if (kVar.getItemId() == i) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable m2381g() {
        return this.f1717o;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1708f.get(i);
    }

    /* renamed from: h */
    public CharSequence m2380h() {
        return this.f1716n;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1728z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1708f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View m2379i() {
        return this.f1718p;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2417a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0501k> m2378j() {
        m2401b();
        return this.f1712j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m2377k() {
        return this.f1722t;
    }

    /* renamed from: l */
    Resources m2376l() {
        return this.f1704b;
    }

    /* renamed from: m */
    public C0496h mo2297m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0501k> m2375n() {
        if (!this.f1710h) {
            return this.f1709g;
        }
        this.f1709g.clear();
        int size = this.f1708f.size();
        for (int i = 0; i < size; i++) {
            C0501k kVar = this.f1708f.get(i);
            if (kVar.isVisible()) {
                this.f1709g.add(kVar);
            }
        }
        this.f1710h = false;
        this.f1713k = true;
        return this.f1709g;
    }

    /* renamed from: o */
    public boolean mo2296o() {
        return this.f1727y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo2295p() {
        return this.f1705c;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m2411a(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0501k a = m2417a(i, keyEvent);
        boolean a2 = a != null ? m2411a(a, i2) : false;
        if ((i2 & 2) != 0) {
            m2402a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public boolean mo2294q() {
        return this.f1706d;
    }

    /* renamed from: r */
    public void m2374r() {
        this.f1719q = false;
        if (this.f1720r) {
            this.f1720r = false;
            mo87b(this.f1721s);
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int a = m2421a(i);
        if (a >= 0) {
            int size = this.f1708f.size() - a;
            int i2 = 0;
            while (true) {
                i2++;
                if (i2 >= size || this.f1708f.get(a).getGroupId() != i) {
                    break;
                }
                m2415a(a, false);
            }
            mo87b(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m2415a(m2400b(i), true);
    }

    /* renamed from: s */
    public void m2373s() {
        if (!this.f1719q) {
            this.f1719q = true;
            this.f1720r = false;
            this.f1721s = false;
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1708f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0501k kVar = this.f1708f.get(i2);
            if (kVar.getGroupId() == i) {
                kVar.m2359c(z2);
                kVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1727y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1708f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0501k kVar = this.f1708f.get(i2);
            if (kVar.getGroupId() == i) {
                kVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1708f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0501k kVar = this.f1708f.get(i2);
            if (kVar.getGroupId() == i && kVar.m2355e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo87b(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1705c = z;
        mo87b(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1708f.size();
    }
}
