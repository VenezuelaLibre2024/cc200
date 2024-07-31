.class public Lcom/google/firebase/auth/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/auth/b$b;,
        Lcom/google/firebase/auth/b$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)Lw7/o0;
    .locals 0

    invoke-static {p0, p1}, Lw7/o0;->M(Ljava/lang/String;Ljava/lang/String;)Lw7/o0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/google/firebase/auth/a;)V
    .locals 0

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lcom/google/firebase/auth/FirebaseAuth;->f0(Lcom/google/firebase/auth/a;)V

    return-void
.end method
