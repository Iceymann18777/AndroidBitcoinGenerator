package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0593g0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f1277A;

    /* renamed from: C */
    private Drawable f1279C;

    /* renamed from: D */
    private ImageView f1280D;

    /* renamed from: E */
    private TextView f1281E;

    /* renamed from: F */
    private TextView f1282F;

    /* renamed from: G */
    private View f1283G;

    /* renamed from: H */
    ListAdapter f1284H;

    /* renamed from: J */
    private int f1286J;

    /* renamed from: K */
    private int f1287K;

    /* renamed from: L */
    int f1288L;

    /* renamed from: M */
    int f1289M;

    /* renamed from: N */
    int f1290N;

    /* renamed from: O */
    int f1291O;

    /* renamed from: P */
    private boolean f1292P;

    /* renamed from: R */
    Handler f1294R;

    /* renamed from: a */
    private final Context f1296a;

    /* renamed from: b */
    final DialogC0464i f1297b;

    /* renamed from: c */
    private final Window f1298c;

    /* renamed from: d */
    private final int f1299d;

    /* renamed from: e */
    private CharSequence f1300e;

    /* renamed from: f */
    private CharSequence f1301f;

    /* renamed from: g */
    ListView f1302g;

    /* renamed from: h */
    private View f1303h;

    /* renamed from: i */
    private int f1304i;

    /* renamed from: j */
    private int f1305j;

    /* renamed from: k */
    private int f1306k;

    /* renamed from: l */
    private int f1307l;

    /* renamed from: m */
    private int f1308m;

    /* renamed from: o */
    Button f1310o;

    /* renamed from: p */
    private CharSequence f1311p;

    /* renamed from: q */
    Message f1312q;

    /* renamed from: r */
    private Drawable f1313r;

    /* renamed from: s */
    Button f1314s;

    /* renamed from: t */
    private CharSequence f1315t;

    /* renamed from: u */
    Message f1316u;

    /* renamed from: v */
    private Drawable f1317v;

    /* renamed from: w */
    Button f1318w;

    /* renamed from: x */
    private CharSequence f1319x;

    /* renamed from: y */
    Message f1320y;

    /* renamed from: z */
    private Drawable f1321z;

    /* renamed from: n */
    private boolean f1309n = false;

    /* renamed from: B */
    private int f1278B = 0;

    /* renamed from: I */
    int f1285I = -1;

    /* renamed from: Q */
    private int f1293Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f1295S = new View$OnClickListenerC0414a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: b */
        private final int f1322b;

        /* renamed from: c */
        private final int f1323c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.RecycleListView);
            this.f1323c = obtainStyledAttributes.getDimensionPixelOffset(C0009j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1322b = obtainStyledAttributes.getDimensionPixelOffset(C0009j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m2665a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1322b, getPaddingRight(), z2 ? getPaddingBottom() : this.f1323c);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0414a implements View.OnClickListener {
        View$OnClickListenerC0414a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f1310o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f1312q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f1314s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.f1316u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f1318w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f1320y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f1294R
                r1 = 1
                androidx.appcompat.app.i r3 = r3.f1297b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.View$OnClickListenerC0414a.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0415b implements NestedScrollView.AbstractC0707b {

        /* renamed from: a */
        final /* synthetic */ View f1325a;

        /* renamed from: b */
        final /* synthetic */ View f1326b;

        C0415b(AlertController alertController, View view, View view2) {
            this.f1325a = view;
            this.f1326b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.AbstractC0707b
        /* renamed from: a */
        public void mo1545a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m2681a(nestedScrollView, this.f1325a, this.f1326b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0416c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f1327b;

        /* renamed from: c */
        final /* synthetic */ View f1328c;

        RunnableC0416c(View view, View view2) {
            this.f1327b = view;
            this.f1328c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m2681a(AlertController.this.f1277A, this.f1327b, this.f1328c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0417d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f1330a;

        /* renamed from: b */
        final /* synthetic */ View f1331b;

        C0417d(AlertController alertController, View view, View view2) {
            this.f1330a = view;
            this.f1331b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m2681a(absListView, this.f1330a, this.f1331b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0418e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f1332b;

        /* renamed from: c */
        final /* synthetic */ View f1333c;

        RunnableC0418e(View view, View view2) {
            this.f1332b = view;
            this.f1333c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m2681a(AlertController.this.f1302g, this.f1332b, this.f1333c);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0419f {

        /* renamed from: A */
        public int f1335A;

        /* renamed from: B */
        public int f1336B;

        /* renamed from: C */
        public int f1337C;

        /* renamed from: D */
        public int f1338D;

        /* renamed from: F */
        public boolean[] f1340F;

        /* renamed from: G */
        public boolean f1341G;

        /* renamed from: H */
        public boolean f1342H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f1344J;

        /* renamed from: K */
        public Cursor f1345K;

        /* renamed from: L */
        public String f1346L;

        /* renamed from: M */
        public String f1347M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f1348N;

        /* renamed from: O */
        public AbstractC0424e f1349O;

        /* renamed from: a */
        public final Context f1350a;

        /* renamed from: b */
        public final LayoutInflater f1351b;

        /* renamed from: d */
        public Drawable f1353d;

        /* renamed from: f */
        public CharSequence f1355f;

        /* renamed from: g */
        public View f1356g;

        /* renamed from: h */
        public CharSequence f1357h;

        /* renamed from: i */
        public CharSequence f1358i;

        /* renamed from: j */
        public Drawable f1359j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1360k;

        /* renamed from: l */
        public CharSequence f1361l;

        /* renamed from: m */
        public Drawable f1362m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1363n;

        /* renamed from: o */
        public CharSequence f1364o;

        /* renamed from: p */
        public Drawable f1365p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1366q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1368s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1369t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1370u;

        /* renamed from: v */
        public CharSequence[] f1371v;

        /* renamed from: w */
        public ListAdapter f1372w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1373x;

        /* renamed from: y */
        public int f1374y;

        /* renamed from: z */
        public View f1375z;

        /* renamed from: c */
        public int f1352c = 0;

        /* renamed from: e */
        public int f1354e = 0;

        /* renamed from: E */
        public boolean f1339E = false;

        /* renamed from: I */
        public int f1343I = -1;

        /* renamed from: r */
        public boolean f1367r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class C0420a extends ArrayAdapter<CharSequence> {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f1376b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0420a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f1376b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0419f.this.f1340F;
                if (zArr != null && zArr[i]) {
                    this.f1376b.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class C0421b extends CursorAdapter {

            /* renamed from: b */
            private final int f1378b;

            /* renamed from: c */
            private final int f1379c;

            /* renamed from: d */
            final /* synthetic */ RecycleListView f1380d;

            /* renamed from: e */
            final /* synthetic */ AlertController f1381e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0421b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f1380d = recycleListView;
                this.f1381e = alertController;
                Cursor cursor2 = getCursor();
                this.f1378b = cursor2.getColumnIndexOrThrow(C0419f.this.f1346L);
                this.f1379c = cursor2.getColumnIndexOrThrow(C0419f.this.f1347M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f1378b));
                RecycleListView recycleListView = this.f1380d;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f1379c) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0419f.this.f1351b.inflate(this.f1381e.f1289M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class C0422c implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ AlertController f1383b;

            C0422c(AlertController alertController) {
                this.f1383b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0419f.this.f1373x.onClick(this.f1383b.f1297b, i);
                if (!C0419f.this.f1342H) {
                    this.f1383b.f1297b.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class C0423d implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f1385b;

            /* renamed from: c */
            final /* synthetic */ AlertController f1386c;

            C0423d(RecycleListView recycleListView, AlertController alertController) {
                this.f1385b = recycleListView;
                this.f1386c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0419f.this.f1340F;
                if (zArr != null) {
                    zArr[i] = this.f1385b.isItemChecked(i);
                }
                C0419f.this.f1344J.onClick(this.f1386c.f1297b, i, this.f1385b.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface AbstractC0424e {
            /* renamed from: a */
            void m2662a(ListView listView);
        }

        public C0419f(Context context) {
            this.f1350a = context;
            this.f1351b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m2663b(androidx.appcompat.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f1351b
                int r1 = r12.f1288L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f1341G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f1345K
                if (r4 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r11.f1350a
                int r4 = r12.f1289M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f1371v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r11.f1350a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f1342H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f1290N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f1291O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f1345K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f1350a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f1346L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f1372w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r2 = r11.f1350a
                java.lang.CharSequence[] r3 = r11.f1371v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                androidx.appcompat.app.AlertController$f$e r1 = r11.f1349O
                if (r1 == 0) goto L_0x006e
                r1.m2662a(r0)
            L_0x006e:
                r12.f1284H = r9
                int r1 = r11.f1343I
                r12.f1285I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f1373x
                if (r1 == 0) goto L_0x0081
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r12)
            L_0x007d:
                r0.setOnItemClickListener(r1)
                goto L_0x008b
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f1344J
                if (r1 == 0) goto L_0x008b
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r12)
                goto L_0x007d
            L_0x008b:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f1348N
                if (r1 == 0) goto L_0x0092
                r0.setOnItemSelectedListener(r1)
            L_0x0092:
                boolean r1 = r11.f1342H
                if (r1 == 0) goto L_0x009a
                r0.setChoiceMode(r8)
                goto L_0x00a2
            L_0x009a:
                boolean r1 = r11.f1341G
                if (r1 == 0) goto L_0x00a2
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a2:
                r12.f1302g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0419f.m2663b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void m2664a(AlertController alertController) {
            View view = this.f1356g;
            if (view != null) {
                alertController.m2684a(view);
            } else {
                CharSequence charSequence = this.f1355f;
                if (charSequence != null) {
                    alertController.m2671b(charSequence);
                }
                Drawable drawable = this.f1353d;
                if (drawable != null) {
                    alertController.m2685a(drawable);
                }
                int i = this.f1352c;
                if (i != 0) {
                    alertController.m2675b(i);
                }
                int i2 = this.f1354e;
                if (i2 != 0) {
                    alertController.m2675b(alertController.m2689a(i2));
                }
            }
            CharSequence charSequence2 = this.f1357h;
            if (charSequence2 != null) {
                alertController.m2677a(charSequence2);
            }
            if (!(this.f1358i == null && this.f1359j == null)) {
                alertController.m2687a(-1, this.f1358i, this.f1360k, (Message) null, this.f1359j);
            }
            if (!(this.f1361l == null && this.f1362m == null)) {
                alertController.m2687a(-2, this.f1361l, this.f1363n, (Message) null, this.f1362m);
            }
            if (!(this.f1364o == null && this.f1365p == null)) {
                alertController.m2687a(-3, this.f1364o, this.f1366q, (Message) null, this.f1365p);
            }
            if (!(this.f1371v == null && this.f1345K == null && this.f1372w == null)) {
                m2663b(alertController);
            }
            View view2 = this.f1375z;
            if (view2 == null) {
                int i3 = this.f1374y;
                if (i3 != 0) {
                    alertController.m2669c(i3);
                }
            } else if (this.f1339E) {
                alertController.m2683a(view2, this.f1335A, this.f1336B, this.f1337C, this.f1338D);
            } else {
                alertController.m2673b(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    private static final class HandlerC0425g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1388a;

        public HandlerC0425g(DialogInterface dialogInterface) {
            this.f1388a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1388a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0426h extends ArrayAdapter<CharSequence> {
        public C0426h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0464i iVar, Window window) {
        this.f1296a = context;
        this.f1297b = iVar;
        this.f1298c = window;
        this.f1294R = new HandlerC0425g(iVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0009j.AlertDialog, C0000a.alertDialogStyle, 0);
        this.f1286J = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_android_layout, 0);
        this.f1287K = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1288L = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_listLayout, 0);
        this.f1289M = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1290N = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1291O = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_listItemLayout, 0);
        this.f1292P = obtainStyledAttributes.getBoolean(C0009j.AlertDialog_showTitle, true);
        this.f1299d = obtainStyledAttributes.getDimensionPixelSize(C0009j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        iVar.m2530a(1);
    }

    /* renamed from: a */
    private ViewGroup m2682a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m2681a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m2680a(ViewGroup viewGroup) {
        boolean z;
        Button button;
        this.f1310o = (Button) viewGroup.findViewById(16908313);
        this.f1310o.setOnClickListener(this.f1295S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f1311p) || this.f1313r != null) {
            this.f1310o.setText(this.f1311p);
            Drawable drawable = this.f1313r;
            if (drawable != null) {
                int i = this.f1299d;
                drawable.setBounds(0, 0, i, i);
                this.f1310o.setCompoundDrawables(this.f1313r, null, null, null);
            }
            this.f1310o.setVisibility(0);
            z = true;
        } else {
            this.f1310o.setVisibility(8);
            z = false;
        }
        this.f1314s = (Button) viewGroup.findViewById(16908314);
        this.f1314s.setOnClickListener(this.f1295S);
        if (!TextUtils.isEmpty(this.f1315t) || this.f1317v != null) {
            this.f1314s.setText(this.f1315t);
            Drawable drawable2 = this.f1317v;
            if (drawable2 != null) {
                int i2 = this.f1299d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f1314s.setCompoundDrawables(this.f1317v, null, null, null);
            }
            this.f1314s.setVisibility(0);
            z |= true;
        } else {
            this.f1314s.setVisibility(8);
        }
        this.f1318w = (Button) viewGroup.findViewById(16908315);
        this.f1318w.setOnClickListener(this.f1295S);
        if (!TextUtils.isEmpty(this.f1319x) || this.f1321z != null) {
            this.f1318w.setText(this.f1319x);
            Drawable drawable3 = this.f1313r;
            if (drawable3 != null) {
                int i3 = this.f1299d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f1310o.setCompoundDrawables(this.f1313r, null, null, null);
            }
            this.f1318w.setVisibility(0);
            z |= true;
        } else {
            this.f1318w.setVisibility(8);
        }
        if (m2686a(this.f1296a)) {
            if (z) {
                button = this.f1310o;
            } else if (z) {
                button = this.f1314s;
            } else if (z) {
                button = this.f1318w;
            }
            m2678a(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m2679a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f1298c.findViewById(C0005f.scrollIndicatorUp);
        View findViewById2 = this.f1298c.findViewById(C0005f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0216r.m3442a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f1301f != null) {
                this.f1277A.setOnScrollChangeListener(new C0415b(this, findViewById, view2));
                this.f1277A.post(new RunnableC0416c(findViewById, view2));
                return;
            }
            ListView listView = this.f1302g;
            if (listView != null) {
                listView.setOnScrollListener(new C0417d(this, findViewById, view2));
                this.f1302g.post(new RunnableC0418e(findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    private void m2678a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m2686a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0000a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: b */
    private int m2676b() {
        int i = this.f1287K;
        return (i != 0 && this.f1293Q == 1) ? i : this.f1286J;
    }

    /* renamed from: b */
    private void m2672b(ViewGroup viewGroup) {
        this.f1277A = (NestedScrollView) this.f1298c.findViewById(C0005f.scrollView);
        this.f1277A.setFocusable(false);
        this.f1277A.setNestedScrollingEnabled(false);
        this.f1282F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f1282F;
        if (textView != null) {
            CharSequence charSequence = this.f1301f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f1277A.removeView(this.f1282F);
            if (this.f1302g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f1277A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f1277A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f1302g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m2670c() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f1298c.findViewById(C0005f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0005f.topPanel);
        View findViewById5 = findViewById3.findViewById(C0005f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0005f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0005f.customPanel);
        m2667c(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0005f.topPanel);
        View findViewById8 = viewGroup.findViewById(C0005f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0005f.buttonPanel);
        ViewGroup a = m2682a(findViewById7, findViewById4);
        ViewGroup a2 = m2682a(findViewById8, findViewById5);
        ViewGroup a3 = m2682a(findViewById9, findViewById6);
        m2672b(a2);
        m2680a(a3);
        m2666d(a);
        int i = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C0005f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f1277A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f1301f == null && this.f1302g == null)) {
                view = a.findViewById(C0005f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C0005f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f1302g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m2665a(z2, z3);
        }
        if (!z) {
            View view2 = this.f1302g;
            if (view2 == null) {
                view2 = this.f1277A;
            }
            if (view2 != null) {
                if (z3) {
                    i = 2;
                }
                int i2 = z2 ? 1 : 0;
                char c = z2 ? 1 : 0;
                m2679a(a2, view2, i2 | i, 3);
            }
        }
        ListView listView2 = this.f1302g;
        if (listView2 != null && (listAdapter = this.f1284H) != null) {
            listView2.setAdapter(listAdapter);
            int i3 = this.f1285I;
            if (i3 > -1) {
                listView2.setItemChecked(i3, true);
                listView2.setSelection(i3);
            }
        }
    }

    /* renamed from: c */
    private void m2667c(ViewGroup viewGroup) {
        View view = this.f1303h;
        boolean z = false;
        if (view == null) {
            view = this.f1304i != 0 ? LayoutInflater.from(this.f1296a).inflate(this.f1304i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m2668c(view)) {
            this.f1298c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f1298c.findViewById(C0005f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f1309n) {
                frameLayout.setPadding(this.f1305j, this.f1306k, this.f1307l, this.f1308m);
            }
            if (this.f1302g != null) {
                ((C0593g0.C0594a) viewGroup.getLayoutParams()).f2124a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: c */
    static boolean m2668c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2668c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m2666d(ViewGroup viewGroup) {
        if (this.f1283G != null) {
            viewGroup.addView(this.f1283G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1298c.findViewById(C0005f.title_template).setVisibility(8);
            return;
        }
        this.f1280D = (ImageView) this.f1298c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1300e)) || !this.f1292P) {
            this.f1298c.findViewById(C0005f.title_template).setVisibility(8);
            this.f1280D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f1281E = (TextView) this.f1298c.findViewById(C0005f.alertTitle);
        this.f1281E.setText(this.f1300e);
        int i = this.f1278B;
        if (i != 0) {
            this.f1280D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f1279C;
        if (drawable != null) {
            this.f1280D.setImageDrawable(drawable);
            return;
        }
        this.f1281E.setPadding(this.f1280D.getPaddingLeft(), this.f1280D.getPaddingTop(), this.f1280D.getPaddingRight(), this.f1280D.getPaddingBottom());
        this.f1280D.setVisibility(8);
    }

    /* renamed from: a */
    public int m2689a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1296a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public void m2690a() {
        this.f1297b.setContentView(m2676b());
        m2670c();
    }

    /* renamed from: a */
    public void m2687a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1294R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f1319x = charSequence;
            this.f1320y = message;
            this.f1321z = drawable;
        } else if (i == -2) {
            this.f1315t = charSequence;
            this.f1316u = message;
            this.f1317v = drawable;
        } else if (i == -1) {
            this.f1311p = charSequence;
            this.f1312q = message;
            this.f1313r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void m2685a(Drawable drawable) {
        this.f1279C = drawable;
        this.f1278B = 0;
        ImageView imageView = this.f1280D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f1280D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void m2684a(View view) {
        this.f1283G = view;
    }

    /* renamed from: a */
    public void m2683a(View view, int i, int i2, int i3, int i4) {
        this.f1303h = view;
        this.f1304i = 0;
        this.f1309n = true;
        this.f1305j = i;
        this.f1306k = i2;
        this.f1307l = i3;
        this.f1308m = i4;
    }

    /* renamed from: a */
    public void m2677a(CharSequence charSequence) {
        this.f1301f = charSequence;
        TextView textView = this.f1282F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean m2688a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1277A;
        return nestedScrollView != null && nestedScrollView.m1574a(keyEvent);
    }

    /* renamed from: b */
    public void m2675b(int i) {
        this.f1279C = null;
        this.f1278B = i;
        ImageView imageView = this.f1280D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f1280D.setImageResource(this.f1278B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: b */
    public void m2673b(View view) {
        this.f1303h = view;
        this.f1304i = 0;
        this.f1309n = false;
    }

    /* renamed from: b */
    public void m2671b(CharSequence charSequence) {
        this.f1300e = charSequence;
        TextView textView = this.f1281E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean m2674b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1277A;
        return nestedScrollView != null && nestedScrollView.m1574a(keyEvent);
    }

    /* renamed from: c */
    public void m2669c(int i) {
        this.f1303h = null;
        this.f1304i = i;
        this.f1309n = false;
    }
}
