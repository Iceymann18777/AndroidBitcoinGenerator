package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.widget.C0638t0;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0009j;
import p000a.p018g.p029l.C0216r;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements AbstractC0515q.AbstractC0516a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    private C0501k f1598b;

    /* renamed from: c */
    private ImageView f1599c;

    /* renamed from: d */
    private RadioButton f1600d;

    /* renamed from: e */
    private TextView f1601e;

    /* renamed from: f */
    private CheckBox f1602f;

    /* renamed from: g */
    private TextView f1603g;

    /* renamed from: h */
    private ImageView f1604h;

    /* renamed from: i */
    private ImageView f1605i;

    /* renamed from: j */
    private LinearLayout f1606j;

    /* renamed from: k */
    private Drawable f1607k;

    /* renamed from: l */
    private int f1608l;

    /* renamed from: m */
    private Context f1609m;

    /* renamed from: n */
    private boolean f1610n;

    /* renamed from: o */
    private Drawable f1611o;

    /* renamed from: p */
    private boolean f1612p;

    /* renamed from: q */
    private LayoutInflater f1613q;

    /* renamed from: r */
    private boolean f1614r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0638t0 a = C0638t0.m1900a(getContext(), attributeSet, C0009j.MenuView, i, 0);
        this.f1607k = a.m1899b(C0009j.MenuView_android_itemBackground);
        this.f1608l = a.m1888g(C0009j.MenuView_android_itemTextAppearance, -1);
        this.f1610n = a.m1903a(C0009j.MenuView_preserveIconSpacing, false);
        this.f1609m = context;
        this.f1611o = a.m1899b(C0009j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0000a.dropDownListViewStyle, 0);
        this.f1612p = obtainStyledAttributes.hasValue(0);
        a.m1908a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m2454a(View view) {
        m2453a(view, -1);
    }

    /* renamed from: a */
    private void m2453a(View view, int i) {
        LinearLayout linearLayout = this.f1606j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: b */
    private void m2451b() {
        this.f1602f = (CheckBox) getInflater().inflate(C0006g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        m2454a(this.f1602f);
    }

    /* renamed from: c */
    private void m2450c() {
        this.f1599c = (ImageView) getInflater().inflate(C0006g.abc_list_menu_item_icon, (ViewGroup) this, false);
        m2453a(this.f1599c, 0);
    }

    /* renamed from: d */
    private void m2449d() {
        this.f1600d = (RadioButton) getInflater().inflate(C0006g.abc_list_menu_item_radio, (ViewGroup) this, false);
        m2454a(this.f1600d);
    }

    private LayoutInflater getInflater() {
        if (this.f1613q == null) {
            this.f1613q = LayoutInflater.from(getContext());
        }
        return this.f1613q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1604h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public void mo148a(C0501k kVar, int i) {
        this.f1598b = kVar;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.m2366a(this));
        setCheckable(kVar.isCheckable());
        m2452a(kVar.m2347m(), kVar.m2358d());
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.getContentDescription());
    }

    /* renamed from: a */
    public void m2452a(boolean z, char c) {
        int i = (!z || !this.f1598b.m2347m()) ? 8 : 0;
        if (i == 0) {
            this.f1603g.setText(this.f1598b.m2356e());
        }
        if (this.f1603g.getVisibility() != i) {
            this.f1603g.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public boolean mo149a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1605i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1605i.getLayoutParams();
            rect.top += this.f1605i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    public C0501k getItemData() {
        return this.f1598b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0216r.m3434a(this, this.f1607k);
        this.f1601e = (TextView) findViewById(C0005f.title);
        int i = this.f1608l;
        if (i != -1) {
            this.f1601e.setTextAppearance(this.f1609m, i);
        }
        this.f1603g = (TextView) findViewById(C0005f.shortcut);
        this.f1604h = (ImageView) findViewById(C0005f.submenuarrow);
        ImageView imageView = this.f1604h;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1611o);
        }
        this.f1605i = (ImageView) findViewById(C0005f.group_divider);
        this.f1606j = (LinearLayout) findViewById(C0005f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1599c != null && this.f1610n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1599c.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1600d != null || this.f1602f != null) {
            if (this.f1598b.m2351i()) {
                if (this.f1600d == null) {
                    m2449d();
                }
                compoundButton2 = this.f1600d;
                compoundButton = this.f1602f;
            } else {
                if (this.f1602f == null) {
                    m2451b();
                }
                compoundButton2 = this.f1602f;
                compoundButton = this.f1600d;
            }
            if (z) {
                compoundButton2.setChecked(this.f1598b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1602f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1600d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1598b.m2351i()) {
            if (this.f1600d == null) {
                m2449d();
            }
            compoundButton = this.f1600d;
        } else {
            if (this.f1602f == null) {
                m2451b();
            }
            compoundButton = this.f1602f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1614r = z;
        this.f1610n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1605i;
        if (imageView != null) {
            imageView.setVisibility((this.f1612p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1598b.m2348l() || this.f1614r;
        if (!z && !this.f1610n) {
            return;
        }
        if (this.f1599c != null || drawable != null || this.f1610n) {
            if (this.f1599c == null) {
                m2450c();
            }
            if (drawable != null || this.f1610n) {
                ImageView imageView = this.f1599c;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1599c.getVisibility() != 0) {
                    this.f1599c.setVisibility(0);
                    return;
                }
                return;
            }
            this.f1599c.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f1601e.setText(charSequence);
            if (this.f1601e.getVisibility() != 0) {
                textView = this.f1601e;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f1601e.getVisibility() != 8) {
                textView = this.f1601e;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
