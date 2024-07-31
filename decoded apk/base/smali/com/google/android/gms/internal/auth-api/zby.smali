.class final Lcom/google/android/gms/internal/auth-api/zby;
.super Lf6/a$a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf6/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Ljava/lang/Object;Lg6/e;Lg6/m;)Lf6/a$f;
    .locals 7

    move-object v3, p4

    check-cast v3, Lx5/l;

    new-instance p4, Lcom/google/android/gms/internal/auth-api/zbg;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/auth-api/zbg;-><init>(Landroid/content/Context;Landroid/os/Looper;Lx5/l;Lh6/e;Lg6/e;Lg6/m;)V

    return-object p4
.end method
