.class public final Lh6/f1;
.super Lcom/google/android/gms/internal/common/zzi;
.source ""


# instance fields
.field public final synthetic a:Lh6/c;


# direct methods
.method public constructor <init>(Lh6/c;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lh6/f1;->a:Lh6/c;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/common/zzi;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public static final a(Landroid/os/Message;)V
    .locals 0

    iget-object p0, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Lh6/g1;

    invoke-virtual {p0}, Lh6/g1;->b()V

    invoke-virtual {p0}, Lh6/g1;->e()V

    return-void
.end method

.method public static final b(Landroid/os/Message;)Z
    .locals 2

    iget p0, p0, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x7

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    iget-object v0, v0, Lh6/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Lh6/f1;->b(Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lh6/f1;->a(Landroid/os/Message;)V

    :cond_0
    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x5

    if-eq v0, v2, :cond_3

    const/4 v4, 0x7

    if-eq v0, v4, :cond_3

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    invoke-virtual {v0}, Lh6/c;->enableLocalFallback()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_4

    :cond_3
    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    invoke-virtual {v0}, Lh6/c;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_12

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v4, 0x8

    const/4 v5, 0x3

    const/4 v6, 0x0

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    new-instance v1, Le6/b;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, p1}, Le6/b;-><init>(I)V

    invoke-static {v0, v1}, Lh6/c;->zzg(Lh6/c;Le6/b;)V

    iget-object p1, p0, Lh6/f1;->a:Lh6/c;

    invoke-static {p1}, Lh6/c;->zzo(Lh6/c;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lh6/f1;->a:Lh6/c;

    invoke-static {p1}, Lh6/c;->zzm(Lh6/c;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {p1, v5, v6}, Lh6/c;->zzi(Lh6/c;ILandroid/os/IInterface;)V

    return-void

    :cond_6
    :goto_0
    iget-object p1, p0, Lh6/f1;->a:Lh6/c;

    invoke-static {p1}, Lh6/c;->zza(Lh6/c;)Le6/b;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lh6/c;->zza(Lh6/c;)Le6/b;

    move-result-object p1

    goto :goto_1

    :cond_7
    new-instance p1, Le6/b;

    invoke-direct {p1, v4}, Le6/b;-><init>(I)V

    :goto_1
    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    iget-object v0, v0, Lh6/c;->zzc:Lh6/c$c;

    invoke-interface {v0, p1}, Lh6/c$c;->b(Le6/b;)V

    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    invoke-virtual {v0, p1}, Lh6/c;->onConnectionFailed(Le6/b;)V

    return-void

    :cond_8
    if-ne v0, v3, :cond_a

    iget-object p1, p0, Lh6/f1;->a:Lh6/c;

    invoke-static {p1}, Lh6/c;->zza(Lh6/c;)Le6/b;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {p1}, Lh6/c;->zza(Lh6/c;)Le6/b;

    move-result-object p1

    goto :goto_2

    :cond_9
    new-instance p1, Le6/b;

    invoke-direct {p1, v4}, Le6/b;-><init>(I)V

    :goto_2
    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    iget-object v0, v0, Lh6/c;->zzc:Lh6/c$c;

    invoke-interface {v0, p1}, Lh6/c$c;->b(Le6/b;)V

    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    invoke-virtual {v0, p1}, Lh6/c;->onConnectionFailed(Le6/b;)V

    return-void

    :cond_a
    if-ne v0, v5, :cond_c

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/PendingIntent;

    if-eqz v1, :cond_b

    move-object v6, v0

    check-cast v6, Landroid/app/PendingIntent;

    :cond_b
    new-instance v0, Le6/b;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v0, p1, v6}, Le6/b;-><init>(ILandroid/app/PendingIntent;)V

    iget-object p1, p0, Lh6/f1;->a:Lh6/c;

    iget-object p1, p1, Lh6/c;->zzc:Lh6/c$c;

    invoke-interface {p1, v0}, Lh6/c$c;->b(Le6/b;)V

    iget-object p1, p0, Lh6/f1;->a:Lh6/c;

    invoke-virtual {p1, v0}, Lh6/c;->onConnectionFailed(Le6/b;)V

    return-void

    :cond_c
    const/4 v1, 0x6

    if-ne v0, v1, :cond_e

    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    invoke-static {v0, v3, v6}, Lh6/c;->zzi(Lh6/c;ILandroid/os/IInterface;)V

    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    invoke-static {v0}, Lh6/c;->zzb(Lh6/c;)Lh6/c$a;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-static {v0}, Lh6/c;->zzb(Lh6/c;)Lh6/c$a;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-interface {v0, v1}, Lh6/c$a;->c(I)V

    :cond_d
    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, p1}, Lh6/c;->onConnectionSuspended(I)V

    iget-object p1, p0, Lh6/f1;->a:Lh6/c;

    invoke-static {p1, v3, v2, v6}, Lh6/c;->zzn(Lh6/c;IILandroid/os/IInterface;)Z

    return-void

    :cond_e
    const/4 v1, 0x2

    if-ne v0, v1, :cond_10

    iget-object v0, p0, Lh6/f1;->a:Lh6/c;

    invoke-virtual {v0}, Lh6/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_3

    :cond_f
    invoke-static {p1}, Lh6/f1;->a(Landroid/os/Message;)V

    return-void

    :cond_10
    :goto_3
    invoke-static {p1}, Lh6/f1;->b(Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lh6/g1;

    invoke-virtual {p1}, Lh6/g1;->c()V

    return-void

    :cond_11
    iget p1, p1, Landroid/os/Message;->what:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Don\'t know how to handle message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const-string v1, "GmsClient"

    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_12
    invoke-static {p1}, Lh6/f1;->a(Landroid/os/Message;)V

    return-void
.end method
