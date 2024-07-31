.class public final Ld6/h;
.super Lcom/google/android/gms/internal/cloudmessaging/zzf;
.source ""


# instance fields
.field public final synthetic a:Ld6/d;


# direct methods
.method public constructor <init>(Ld6/d;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Ld6/h;->a:Ld6/d;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/cloudmessaging/zzf;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Ld6/h;->a:Ld6/d;

    invoke-static {v0, p1}, Ld6/d;->e(Ld6/d;Landroid/os/Message;)V

    return-void
.end method
