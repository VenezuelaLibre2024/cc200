.class public final Lhe/s;
.super Lce/k0;
.source ""

# interfaces
.implements Lce/z0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhe/s$a;
    }
.end annotation


# static fields
.field public static final o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final j:Lce/k0;

.field public final k:I

.field public final synthetic l:Lce/z0;

.field public final m:Lhe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhe/x<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/lang/Object;

.field private volatile runningWorkers:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lhe/s;

    const-string v1, "runningWorkers"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lhe/s;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lce/k0;I)V
    .locals 0

    invoke-direct {p0}, Lce/k0;-><init>()V

    iput-object p1, p0, Lhe/s;->j:Lce/k0;

    iput p2, p0, Lhe/s;->k:I

    instance-of p2, p1, Lce/z0;

    if-eqz p2, :cond_0

    check-cast p1, Lce/z0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Lce/w0;->a()Lce/z0;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lhe/s;->l:Lce/z0;

    new-instance p1, Lhe/x;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lhe/x;-><init>(Z)V

    iput-object p1, p0, Lhe/s;->m:Lhe/x;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhe/s;->n:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic K0(Lhe/s;)Lce/k0;
    .locals 0

    iget-object p0, p0, Lhe/s;->j:Lce/k0;

    return-object p0
.end method

.method public static final synthetic L0(Lhe/s;)Ljava/lang/Runnable;
    .locals 0

    invoke-virtual {p0}, Lhe/s;->M0()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public G0(JLjava/lang/Runnable;Ljd/g;)Lce/i1;
    .locals 1

    iget-object v0, p0, Lhe/s;->l:Lce/z0;

    invoke-interface {v0, p1, p2, p3, p4}, Lce/z0;->G0(JLjava/lang/Runnable;Ljd/g;)Lce/i1;

    move-result-object p1

    return-object p1
.end method

.method public H0(Ljd/g;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, Lhe/s;->m:Lhe/x;

    invoke-virtual {p1, p2}, Lhe/x;->a(Ljava/lang/Object;)Z

    sget-object p1, Lhe/s;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lhe/s;->k:I

    if-ge p1, p2, :cond_1

    invoke-virtual {p0}, Lhe/s;->N0()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lhe/s;->M0()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lhe/s$a;

    invoke-direct {p2, p0, p1}, Lhe/s$a;-><init>(Lhe/s;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lhe/s;->j:Lce/k0;

    invoke-virtual {p1, p0, p2}, Lce/k0;->H0(Ljd/g;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final M0()Ljava/lang/Runnable;
    .locals 3

    :goto_0
    iget-object v0, p0, Lhe/s;->m:Lhe/x;

    invoke-virtual {v0}, Lhe/x;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lhe/s;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lhe/s;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v2, p0, Lhe/s;->m:Lhe/x;

    invoke-virtual {v2}, Lhe/x;->c()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method public final N0()Z
    .locals 4

    iget-object v0, p0, Lhe/s;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lhe/s;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    iget v3, p0, Lhe/s;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v2, v3, :cond_0

    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
