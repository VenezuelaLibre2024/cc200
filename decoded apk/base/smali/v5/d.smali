.class public final Lv5/d;
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

    check-cast v4, Lv5/g;

    new-instance p4, Lcom/google/android/gms/internal/auth-api/zbe;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/auth-api/zbe;-><init>(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Lv5/g;Lf6/f$a;Lf6/f$b;)V

    return-object p4
.end method
