.class public final Lv5/e;
.super Lf6/a$a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf6/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Ljava/lang/Object;Lf6/f$a;Lf6/f$b;)Lf6/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    new-instance p4, Lb6/i;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lb6/i;-><init>(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lf6/f$a;Lf6/f$b;)V

    return-object p4
.end method

.method public final bridge synthetic getImpliedScopes(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->K()Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    return-object p1
.end method
