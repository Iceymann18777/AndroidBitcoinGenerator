package me.createbitcoins.androidbitcoingenerator;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import org.json.JSONObject;
import p000a.p036j.p037a.AbstractC0287m;
import p000a.p036j.p037a.ComponentCallbacksC0248c;

/* renamed from: me.createbitcoins.androidbitcoingenerator.c */
/* loaded from: classes.dex */
public class View$OnClickListenerC1010c extends ComponentCallbacksC0248c implements View.OnClickListener {

    /* renamed from: i0 */
    @SuppressLint("StaticFieldLeak")
    private static View$OnClickListenerC1010c f3667i0;

    /* renamed from: a0 */
    ProgressBar f3669a0;

    /* renamed from: b0 */
    ProgressDialog f3670b0;

    /* renamed from: c0 */
    TextView f3671c0;

    /* renamed from: d0 */
    TextView f3672d0;

    /* renamed from: e0 */
    EditText f3673e0;

    /* renamed from: Z */
    final Handler f3668Z = new Handler();

    /* renamed from: f0 */
    C1038d f3674f0 = new C1038d();

    /* renamed from: g0 */
    private Runnable f3675g0 = new RunnableC1015e();

    /* renamed from: h0 */
    private Runnable f3676h0 = new RunnableC1016f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$a */
    /* loaded from: classes.dex */
    public class RunnableC1011a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f3677b;

        /* renamed from: c */
        final /* synthetic */ int f3678c;

        RunnableC1011a(String str, int i) {
            this.f3677b = str;
            this.f3678c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = (TextView) View$OnClickListenerC1010c.this.m3183y().findViewById(R.id.internetstatus);
            textView.setText(this.f3677b);
            textView.setTextColor(this.f3678c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$b */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC1012b implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC1012b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            View$OnClickListenerC1010c.this.m5b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$c */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC1013c implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC1013c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Objects.requireNonNull(View$OnClickListenerC1010c.this.m3219d()).moveTaskToBack(true);
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$d */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC1014d implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC1014d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC0287m a = View$OnClickListenerC1010c.this.m3193o().mo3111a();
            a.mo2993a(R.id.fragment_container, new C1009b());
            a.mo2994a();
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$e */
    /* loaded from: classes.dex */
    class RunnableC1015e implements Runnable {
        RunnableC1015e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnClickListenerC1010c.this.f3669a0.setProgress(75);
            View$OnClickListenerC1010c.this.m3c0();
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f */
    /* loaded from: classes.dex */
    class RunnableC1016f implements Runnable {

        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a */
        /* loaded from: classes.dex */
        class RunnableC1017a implements Runnable {

            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a */
            /* loaded from: classes.dex */
            class RunnableC1018a implements Runnable {

                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a */
                /* loaded from: classes.dex */
                class RunnableC1019a implements Runnable {

                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a */
                    /* loaded from: classes.dex */
                    class RunnableC1020a implements Runnable {

                        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a */
                        /* loaded from: classes.dex */
                        class RunnableC1021a implements Runnable {

                            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a */
                            /* loaded from: classes.dex */
                            class RunnableC1022a implements Runnable {

                                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a */
                                /* loaded from: classes.dex */
                                class RunnableC1023a implements Runnable {

                                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a */
                                    /* loaded from: classes.dex */
                                    class RunnableC1024a implements Runnable {

                                        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a */
                                        /* loaded from: classes.dex */
                                        class RunnableC1025a implements Runnable {

                                            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a */
                                            /* loaded from: classes.dex */
                                            class RunnableC1026a implements Runnable {

                                                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a */
                                                /* loaded from: classes.dex */
                                                class RunnableC1027a implements Runnable {

                                                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a */
                                                    /* loaded from: classes.dex */
                                                    class RunnableC1028a implements Runnable {

                                                        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                        /* loaded from: classes.dex */
                                                        class RunnableC1029a implements Runnable {

                                                            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                            /* loaded from: classes.dex */
                                                            class RunnableC1030a implements Runnable {

                                                                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                /* loaded from: classes.dex */
                                                                class RunnableC1031a implements Runnable {

                                                                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                    /* loaded from: classes.dex */
                                                                    class RunnableC1032a implements Runnable {

                                                                        /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                        /* loaded from: classes.dex */
                                                                        class RunnableC1033a implements Runnable {

                                                                            /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                            /* loaded from: classes.dex */
                                                                            class RunnableC1034a implements Runnable {

                                                                                /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                                /* loaded from: classes.dex */
                                                                                class RunnableC1035a implements Runnable {

                                                                                    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$f$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a$a */
                                                                                    /* loaded from: classes.dex */
                                                                                    class RunnableC1036a implements Runnable {
                                                                                        RunnableC1036a() {
                                                                                        }

                                                                                        @SuppressLint("SetTextI18n")
                                                                                        @Override // java.lang.Runnable
                                                                                        public void run() {
                                                                                            View$OnClickListenerC1010c.this.f3669a0.setProgress(73);
                                                                                            View$OnClickListenerC1010c.this.f3672d0.setText("Payment Verification Failed!!!");
                                                                                            View$OnClickListenerC1010c cVar = View$OnClickListenerC1010c.this;
                                                                                            cVar.f3668Z.postDelayed(cVar.f3675g0, 2000L);
                                                                                        }
                                                                                    }

                                                                                    RunnableC1035a() {
                                                                                    }

                                                                                    @SuppressLint("SetTextI18n")
                                                                                    @Override // java.lang.Runnable
                                                                                    public void run() {
                                                                                        View$OnClickListenerC1010c.this.f3669a0.setProgress(70);
                                                                                        View$OnClickListenerC1010c.this.f3672d0.setText("Verifying Your Subscription...");
                                                                                        View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1036a(), 1000L);
                                                                                    }
                                                                                }

                                                                                RunnableC1034a() {
                                                                                }

                                                                                @SuppressLint("SetTextI18n")
                                                                                @Override // java.lang.Runnable
                                                                                public void run() {
                                                                                    View$OnClickListenerC1010c.this.f3669a0.setProgress(69);
                                                                                    View$OnClickListenerC1010c.this.f3672d0.setText("Verifying Your Subscription..");
                                                                                    View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1035a(), 1000L);
                                                                                }
                                                                            }

                                                                            RunnableC1033a() {
                                                                            }

                                                                            @SuppressLint("SetTextI18n")
                                                                            @Override // java.lang.Runnable
                                                                            public void run() {
                                                                                View$OnClickListenerC1010c.this.f3669a0.setProgress(68);
                                                                                View$OnClickListenerC1010c.this.f3672d0.setText("Verifying Your Subscription.");
                                                                                View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1034a(), 2000L);
                                                                            }
                                                                        }

                                                                        RunnableC1032a() {
                                                                        }

                                                                        @SuppressLint("SetTextI18n")
                                                                        @Override // java.lang.Runnable
                                                                        public void run() {
                                                                            View$OnClickListenerC1010c.this.f3669a0.setProgress(66);
                                                                            View$OnClickListenerC1010c.this.f3672d0.setText("Preparing to broadcast transaction..");
                                                                            View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1033a(), 1000L);
                                                                        }
                                                                    }

                                                                    RunnableC1031a() {
                                                                    }

                                                                    @SuppressLint("SetTextI18n")
                                                                    @Override // java.lang.Runnable
                                                                    public void run() {
                                                                        View$OnClickListenerC1010c.this.f3669a0.setProgress(65);
                                                                        View$OnClickListenerC1010c.this.f3672d0.setText("Preparing to broadcast transaction.");
                                                                        View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1032a(), 1000L);
                                                                    }
                                                                }

                                                                RunnableC1030a() {
                                                                }

                                                                @SuppressLint("SetTextI18n")
                                                                @Override // java.lang.Runnable
                                                                public void run() {
                                                                    View$OnClickListenerC1010c.this.f3669a0.setProgress(60);
                                                                    View$OnClickListenerC1010c.this.f3672d0.setText("Preparing to broadcast transaction...");
                                                                    View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1031a(), 2000L);
                                                                }
                                                            }

                                                            RunnableC1029a() {
                                                            }

                                                            @SuppressLint("SetTextI18n")
                                                            @Override // java.lang.Runnable
                                                            public void run() {
                                                                View$OnClickListenerC1010c.this.f3669a0.setProgress(59);
                                                                View$OnClickListenerC1010c.this.f3672d0.setText("Preparing to broadcast transaction..");
                                                                View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1030a(), 1000L);
                                                            }
                                                        }

                                                        RunnableC1028a() {
                                                        }

                                                        @SuppressLint("SetTextI18n")
                                                        @Override // java.lang.Runnable
                                                        public void run() {
                                                            View$OnClickListenerC1010c.this.f3669a0.setProgress(59);
                                                            View$OnClickListenerC1010c.this.f3672d0.setText("Preparing to broadcast transaction.");
                                                            View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1029a(), 1000L);
                                                        }
                                                    }

                                                    RunnableC1027a() {
                                                    }

                                                    @SuppressLint("SetTextI18n")
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        View$OnClickListenerC1010c.this.f3669a0.setProgress(57);
                                                        View$OnClickListenerC1010c.this.f3672d0.setText("Preparing to broadcast transaction...");
                                                        View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1028a(), 2000L);
                                                    }
                                                }

                                                RunnableC1026a() {
                                                }

                                                @SuppressLint("SetTextI18n")
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    View$OnClickListenerC1010c.this.f3669a0.setProgress(57);
                                                    View$OnClickListenerC1010c.this.f3672d0.setText("Preparing to broadcast transaction..");
                                                    View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1027a(), 1000L);
                                                }
                                            }

                                            RunnableC1025a() {
                                            }

                                            @SuppressLint("SetTextI18n")
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                View$OnClickListenerC1010c.this.f3669a0.setProgress(55);
                                                View$OnClickListenerC1010c.this.f3672d0.setText("Preparing to broadcast transaction.");
                                                View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1026a(), 1000L);
                                            }
                                        }

                                        RunnableC1024a() {
                                        }

                                        @SuppressLint("SetTextI18n")
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            View$OnClickListenerC1010c.this.f3669a0.setProgress(52);
                                            View$OnClickListenerC1010c.this.f3672d0.setText("Looking For Next Probable Block...");
                                            View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1025a(), 1000L);
                                        }
                                    }

                                    RunnableC1023a() {
                                    }

                                    @SuppressLint("SetTextI18n")
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        View$OnClickListenerC1010c.this.f3669a0.setProgress(47);
                                        View$OnClickListenerC1010c.this.f3672d0.setText("Transaction Successfully Generated!!");
                                        View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1024a(), 2000L);
                                    }
                                }

                                RunnableC1022a() {
                                }

                                @SuppressLint("SetTextI18n")
                                @Override // java.lang.Runnable
                                public void run() {
                                    View$OnClickListenerC1010c.this.f3669a0.setProgress(45);
                                    View$OnClickListenerC1010c.this.f3672d0.setText("Generating Transaction From Weak Signature..");
                                    View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1023a(), 1000L);
                                }
                            }

                            RunnableC1021a() {
                            }

                            @SuppressLint("SetTextI18n")
                            @Override // java.lang.Runnable
                            public void run() {
                                View$OnClickListenerC1010c.this.f3669a0.setProgress(35);
                                View$OnClickListenerC1010c.this.f3672d0.setText("Searching For Weak Signatures...");
                                View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1022a(), 1500L);
                            }
                        }

                        RunnableC1020a() {
                        }

                        @SuppressLint("SetTextI18n")
                        @Override // java.lang.Runnable
                        public void run() {
                            View$OnClickListenerC1010c.this.f3669a0.setProgress(35);
                            View$OnClickListenerC1010c.this.f3672d0.setText("Searching For Weak Signatures..");
                            View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1021a(), 1000L);
                        }
                    }

                    RunnableC1019a() {
                    }

                    @SuppressLint("SetTextI18n")
                    @Override // java.lang.Runnable
                    public void run() {
                        View$OnClickListenerC1010c.this.f3669a0.setProgress(30);
                        View$OnClickListenerC1010c.this.f3672d0.setText("Searching For Weak Signatures.");
                        View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1020a(), 500L);
                    }
                }

                RunnableC1018a() {
                }

                @SuppressLint("SetTextI18n")
                @Override // java.lang.Runnable
                public void run() {
                    View$OnClickListenerC1010c.this.f3669a0.setProgress(25);
                    View$OnClickListenerC1010c.this.f3672d0.setText("Searching For Weak Signatures...");
                    View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1019a(), 1000L);
                }
            }

            RunnableC1017a() {
            }

            @SuppressLint("SetTextI18n")
            @Override // java.lang.Runnable
            public void run() {
                View$OnClickListenerC1010c.this.f3669a0.setProgress(22);
                View$OnClickListenerC1010c.this.f3672d0.setText("Connected!!");
                View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1018a(), 1000L);
            }
        }

        RunnableC1016f() {
        }

        @SuppressLint("SetTextI18n")
        @Override // java.lang.Runnable
        public void run() {
            View$OnClickListenerC1010c.this.f3669a0.setProgress(8);
            View$OnClickListenerC1010c.this.f3672d0.setText("Initializing...");
            View$OnClickListenerC1010c.this.f3668Z.postDelayed(new RunnableC1017a(), 1000L);
        }
    }

    /* renamed from: me.createbitcoins.androidbitcoingenerator.c$g */
    /* loaded from: classes.dex */
    @SuppressLint("StaticFieldLeak")
    private class AsyncTaskC1037g extends AsyncTask<String, String, String> {
        private final View$OnClickListenerC1010c cVar;
        private final RunnableC1011a aVar;

        private AsyncTaskC1037g(RunnableC1011a aVar) {
            this.aVar = aVar;
            cVar = null;
        }

        /* synthetic */ AsyncTaskC1037g(View$OnClickListenerC1010c cVar, RunnableC1011a aVar) {
            View$OnClickListenerC1010c cVar1;
            this(aVar);
            cVar1 = cVar;
            this.cVar = cVar1;
            this.aVar = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* renamed from: a */
        public String doInBackground(HttpURLConnection strArr) {
            BufferedReader bufferedReader;
            Throwable th;
            BufferedReader bufferedReader2;
            MalformedURLException e;
            IOException e2;
            try {
                try {
                    try {
                        strArr = (HttpURLConnection) new URL(strArr[0]).openConnection();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        strArr.connect();
                        bufferedReader2 = new BufferedReader(new InputStreamReader(strArr.getInputStream()));
                        try {
                            StringBuffer stringBuffer = new StringBuffer();
                            while (true) {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                stringBuffer.append(readLine + "\n");
                                Log.d("Response: ", "> " + readLine);
                            }
                            String stringBuffer2 = stringBuffer.toString();
                            if (strArr != 0) {
                                strArr.disconnect();
                            }
                            try {
                                bufferedReader2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            return stringBuffer2;
                        } catch (MalformedURLException e4) {
                            e = e4;
                            e.printStackTrace();
                            if (strArr != 0) {
                                strArr.disconnect();
                            }
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                            }
                            return null;
                        } catch (IOException e5) {
                            e2 = e5;
                            e2.printStackTrace();
                            if (strArr != 0) {
                                strArr.disconnect();
                            }
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                            }
                            return null;
                        }
                    } catch (MalformedURLException e6) {
                        e = e6;
                        bufferedReader2 = null;
                    } catch (IOException e7) {
                        e2 = e7;
                        bufferedReader2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                        if (strArr != 0) {
                            strArr.disconnect();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (MalformedURLException e9) {
                    e = e9;
                    strArr = 0;
                    bufferedReader2 = null;
                } catch (IOException e10) {
                    e2 = e10;
                    strArr = 0;
                    bufferedReader2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                    strArr = 0;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (View$OnClickListenerC1010c.this.f3670b0.isShowing()) {
                View$OnClickListenerC1010c.this.f3670b0.dismiss();
            }
            try {
                StringBuilder sb = new StringBuilder();
                JSONObject jSONObject = new JSONObject(str).getJSONObject("bpi").getJSONObject("USD");
                sb.append("$");
                sb.append(jSONObject.getString("rate"));
                View$OnClickListenerC1010c.this.f3671c0.setText(sb.toString());
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            View$OnClickListenerC1010c cVar = View$OnClickListenerC1010c.this;
            cVar.f3670b0 = new ProgressDialog(cVar.m3219d());
            View$OnClickListenerC1010c.this.f3670b0.setMessage("Initializing");
            View$OnClickListenerC1010c.this.f3670b0.setCancelable(false);
            View$OnClickListenerC1010c.this.f3670b0.show();
        }

        public View$OnClickListenerC1010c getcVar() {
            return cVar;
        }

        public RunnableC1011a getaVar() {
            return aVar;
        }
    }

    /* renamed from: a0 */
    public static View$OnClickListenerC1010c m8a0() {
        return f3667i0;
    }

    /* renamed from: b */
    public static boolean m7b(Context context) {
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m5b0() {
        String string = m3188t().getString(R.string.emailbody);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:robslay90@gmail.com"));
        intent.putExtra("android.intent.extra.SUBJECT", "To Buy Unique ID for Android Bitcoin Generator");
        intent.putExtra("android.intent.extra.TEXT", string);
        m3244a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m3c0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(m3202j());
        builder.setTitle("Incorrect Unique ID !!!");
        builder.setCancelable(true);
        builder.setMessage(m3188t().getString(R.string.alert_message));
        builder.setPositiveButton("Yes", new DialogInterface$OnClickListenerC1012b());
        builder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: d0 */
    private void m2d0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(m3202j());
        builder.setTitle("Incorrect Unique ID !!!");
        builder.setCancelable(true);
        builder.setMessage(m3188t().getString(R.string.alert_message_one));
        builder.setPositiveButton("Exit", new DialogInterface$OnClickListenerC1013c());
        builder.setNegativeButton("Pay", new DialogInterface$OnClickListenerC1014d());
        builder.show();
    }

    @Override // p000a.p036j.p037a.ComponentCallbacksC0248c
    /* renamed from: G */
    public void mo13G() {
        super.mo13G();
        m3202j().unregisterReceiver(this.f3674f0);
    }

    /* renamed from: Z */
    public boolean m12Z() {
        Runtime runtime = Runtime.getRuntime();
        try {
            this.f3669a0.setProgress(3);
            this.f3672d0.setText("Pinging Bitcoin Network Nodes...");
            return runtime.exec("/system/bin/ping -c 1 -W 4 8.8.8.8").waitFor() == 0;
        } catch (IOException e) {
            e.printStackTrace();
            this.f3669a0.setProgress(0);
            this.f3672d0.setText("Failed To Connect to the Internet!!");
            return false;
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            this.f3669a0.setProgress(0);
            this.f3672d0.setText("Failed To Connect to the Internet!!");
            return false;
        }
    }

    @Override // p000a.p036j.p037a.ComponentCallbacksC0248c
    /* renamed from: a */
    public View mo11a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f3667i0 = this;
        m3202j().registerReceiver(this.f3674f0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        new AsyncTaskC1037g(this, null).execute("https://api.coindesk.com/v1/bpi/currentprice.json");
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        this.f3669a0 = (ProgressBar) inflate.findViewById(R.id.progressBar);
        this.f3672d0 = (TextView) inflate.findViewById(R.id.progressBar_status);
        this.f3671c0 = (TextView) inflate.findViewById(R.id.priceview);
        this.f3673e0 = (EditText) inflate.findViewById(R.id.editText);
        ((Button) inflate.findViewById(R.id.button)).setOnClickListener(this);
        return inflate;
    }

    /* renamed from: a */
    public void m10a(String str, int i) {
        m3219d().runOnUiThread(new RunnableC1011a(str, i));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            if (this.f3669a0.getProgress() == 75) {
                m2d0();
                return;
            }
            if (this.f3673e0.getText().toString().trim().length() <= 24 && !m7b(m3202j())) {
                this.f3673e0.setError("Enter a valid address so you can receive your bitcoins");
                Toast.makeText(m3202j(), "You must be connected to the internet before you can generate btc", 1).show();
            }
            if (TextUtils.isEmpty(this.f3673e0.getText()) || this.f3673e0.getText().toString().trim().length() <= 24) {
                this.f3673e0.setError("Enter a valid address so you can receive your bitcoins");
            } else if (m7b(m3202j())) {
                this.f3669a0.setVisibility(0);
                if (m12Z()) {
                    this.f3668Z.postDelayed(this.f3676h0, 3000L);
                }
            } else {
                Toast.makeText(m3202j(), "You must be connected to the internet before you can generate btc", 1).show();
            }
        }
    }
}
