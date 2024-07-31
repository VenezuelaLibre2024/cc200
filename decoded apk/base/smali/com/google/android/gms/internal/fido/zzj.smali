.class public final Lcom/google/android/gms/internal/fido/zzj;
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
    .locals 6

    check-cast p4, Lf6/a$d$c;

    new-instance p4, Lcom/google/android/gms/internal/fido/zzk;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/fido/zzk;-><init>(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Lf6/f$a;Lf6/f$b;)V

    return-object p4
.end method
