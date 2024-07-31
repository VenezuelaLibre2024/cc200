.class public final Lhe/s$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhe/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public h:Ljava/lang/Runnable;

.field public final synthetic i:Lhe/s;


# direct methods
.method public constructor <init>(Lhe/s;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lhe/s$a;->i:Lhe/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lhe/s$a;->h:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lhe/s$a;->h:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Ljd/h;->h:Ljd/h;

    invoke-static {v2, v1}, Lce/m0;->a(Ljd/g;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v1, p0, Lhe/s$a;->i:Lhe/s;

    invoke-static {v1}, Lhe/s;->L0(Lhe/s;)Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iput-object v1, p0, Lhe/s$a;->h:Ljava/lang/Runnable;

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lhe/s$a;->i:Lhe/s;

    invoke-static {v1}, Lhe/s;->K0(Lhe/s;)Lce/k0;

    move-result-object v1

    iget-object v2, p0, Lhe/s$a;->i:Lhe/s;

    invoke-virtual {v1, v2}, Lce/k0;->I0(Ljd/g;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lhe/s$a;->i:Lhe/s;

    invoke-static {v0}, Lhe/s;->K0(Lhe/s;)Lce/k0;

    move-result-object v0

    iget-object v1, p0, Lhe/s$a;->i:Lhe/s;

    invoke-virtual {v0, v1, p0}, Lce/k0;->H0(Ljd/g;Ljava/lang/Runnable;)V

    return-void
.end method
