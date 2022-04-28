package p000a.p031h.p032a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: a.h.a.b */
/* loaded from: classes.dex */
class C0234b extends Filter {

    /* renamed from: a */
    AbstractC0235a f696a;

    /* renamed from: a.h.a.b$a */
    /* loaded from: classes.dex */
    interface AbstractC0235a {
        /* renamed from: a */
        Cursor mo3349a();

        /* renamed from: a */
        Cursor mo1935a(CharSequence charSequence);

        /* renamed from: a */
        CharSequence mo1942a(Cursor cursor);

        /* renamed from: b */
        void mo1930b(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0234b(AbstractC0235a aVar) {
        this.f696a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f696a.mo1942a((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f696a.mo1935a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f696a.mo3349a();
        Object obj = filterResults.values;
        if (obj != null && obj != a) {
            this.f696a.mo1930b((Cursor) obj);
        }
    }
}
