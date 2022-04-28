package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

/* renamed from: androidx.constraintlayout.widget.f */
/* loaded from: classes.dex */
public class C0672f extends View {

    /* renamed from: b */
    private int f2565b;

    /* renamed from: c */
    private View f2566c;

    /* renamed from: d */
    private int f2567d;

    /* renamed from: a */
    public void m1728a(ConstraintLayout constraintLayout) {
        if (this.f2566c != null) {
            ConstraintLayout.C0662a aVar = (ConstraintLayout.C0662a) getLayoutParams();
            ConstraintLayout.C0662a aVar2 = (ConstraintLayout.C0662a) this.f2566c.getLayoutParams();
            aVar2.f2447k0.m3829n(0);
            aVar.f2447k0.m3827o(aVar2.f2447k0.m3820s());
            aVar.f2447k0.m3843g(aVar2.f2447k0.m3840i());
            aVar2.f2447k0.m3829n(8);
        }
    }

    /* renamed from: b */
    public void m1727b(ConstraintLayout constraintLayout) {
        if (this.f2565b == -1 && !isInEditMode()) {
            setVisibility(this.f2567d);
        }
        this.f2566c = constraintLayout.findViewById(this.f2565b);
        View view = this.f2566c;
        if (view != null) {
            ((ConstraintLayout.C0662a) view.getLayoutParams()).f2425Z = true;
            this.f2566c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2566c;
    }

    public int getEmptyVisibility() {
        return this.f2567d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2565b != i) {
            View view = this.f2566c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0662a) this.f2566c.getLayoutParams()).f2425Z = false;
                this.f2566c = null;
            }
            this.f2565b = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2567d = i;
    }
}
