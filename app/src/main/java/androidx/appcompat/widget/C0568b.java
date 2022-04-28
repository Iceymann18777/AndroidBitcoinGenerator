package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
class C0568b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f2039a;

    public C0568b(ActionBarContainer actionBarContainer) {
        this.f2039a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2039a;
        if (actionBarContainer.f1818i) {
            Drawable drawable = actionBarContainer.f1817h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1815f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2039a;
        Drawable drawable3 = actionBarContainer2.f1816g;
        if (drawable3 != null && actionBarContainer2.f1819j) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f2039a;
        if (actionBarContainer.f1818i) {
            drawable = actionBarContainer.f1817h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f1815f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
