package p000a.p031h.p032a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: a.h.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0231a extends BaseAdapter implements Filterable, C0234b.AbstractC0235a {

    /* renamed from: b */
    protected boolean f686b;

    /* renamed from: c */
    protected boolean f687c;

    /* renamed from: d */
    protected Cursor f688d;

    /* renamed from: e */
    protected Context f689e;

    /* renamed from: f */
    protected int f690f;

    /* renamed from: g */
    protected C0232a f691g;

    /* renamed from: h */
    protected DataSetObserver f692h;

    /* renamed from: i */
    protected C0234b f693i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.h.a.a$a */
    /* loaded from: classes.dex */
    public class C0232a extends ContentObserver {
        C0232a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC0231a.this.m3351b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.h.a.a$b */
    /* loaded from: classes.dex */
    public class C0233b extends DataSetObserver {
        C0233b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0231a aVar = AbstractC0231a.this;
            aVar.f686b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0231a aVar = AbstractC0231a.this;
            aVar.f686b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public AbstractC0231a(Context context, Cursor cursor, boolean z) {
        m3352a(context, cursor, z ? 1 : 2);
    }

    @Override // p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: a */
    public Cursor mo3349a() {
        return this.f688d;
    }

    /* renamed from: a */
    public abstract View mo3348a(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: a */
    public abstract CharSequence mo1942a(Cursor cursor);

    /* renamed from: a */
    void m3352a(Context context, Cursor cursor, int i) {
        C0233b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f687c = true;
        } else {
            this.f687c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f688d = cursor;
        this.f686b = z;
        this.f689e = context;
        this.f690f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f691g = new C0232a();
            bVar = new C0233b();
        } else {
            bVar = null;
            this.f691g = null;
        }
        this.f692h = bVar;
        if (z) {
            C0232a aVar = this.f691g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f692h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo1938a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public abstract View mo1931b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: b */
    protected void m3351b() {
        Cursor cursor;
        if (this.f687c && (cursor = this.f688d) != null && !cursor.isClosed()) {
            this.f686b = this.f688d.requery();
        }
    }

    @Override // p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: b */
    public void mo1930b(Cursor cursor) {
        Cursor c = m3350c(cursor);
        if (c != null) {
            c.close();
        }
    }

    /* renamed from: c */
    public Cursor m3350c(Cursor cursor) {
        Cursor cursor2 = this.f688d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0232a aVar = this.f691g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f692h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f688d = cursor;
        if (cursor != null) {
            C0232a aVar2 = this.f691g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f692h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f690f = cursor.getColumnIndexOrThrow("_id");
            this.f686b = true;
            notifyDataSetChanged();
        } else {
            this.f690f = -1;
            this.f686b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f686b || (cursor = this.f688d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f686b) {
            return null;
        }
        this.f688d.moveToPosition(i);
        if (view == null) {
            view = mo3348a(this.f689e, this.f688d, viewGroup);
        }
        mo1938a(view, this.f689e, this.f688d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f693i == null) {
            this.f693i = new C0234b(this);
        }
        return this.f693i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f686b || (cursor = this.f688d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f688d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f686b || (cursor = this.f688d) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f688d.getLong(this.f690f);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f686b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f688d.moveToPosition(i)) {
            if (view == null) {
                view = mo1931b(this.f689e, this.f688d, viewGroup);
            }
            mo1938a(view, this.f689e, this.f688d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }
}
