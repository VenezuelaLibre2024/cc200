.class public Ls3/x2;
.super Ljava/lang/Exception;
.source ""

# interfaces
.implements Ls3/h;


# static fields
.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;

.field public static final n:Ljava/lang/String;

.field public static final o:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/x2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/x2;->j:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/x2;->k:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/x2;->l:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/x2;->m:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/x2;->n:Ljava/lang/String;

    sget-object v0, Ls3/w2;->a:Ls3/w2;

    sput-object v0, Ls3/x2;->o:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 7

    sget-object v0, Ls3/x2;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ls3/x2;->c(Landroid/os/Bundle;)Ljava/lang/Throwable;

    move-result-object v3

    sget-object v0, Ls3/x2;->j:Ljava/lang/String;

    const/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    sget-object v0, Ls3/x2;->k:Ljava/lang/String;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-virtual {p1, v0, v5, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ls3/x2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p3, p0, Ls3/x2;->h:I

    iput-wide p4, p0, Ls3/x2;->i:J

    return-void
.end method

.method public static a(Ljava/lang/String;)Landroid/os/RemoteException;
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0, p0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Throwable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v3

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    return-object p0
.end method

.method public static c(Landroid/os/Bundle;)Ljava/lang/Throwable;
    .locals 4

    sget-object v0, Ls3/x2;->m:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ls3/x2;->n:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    :try_start_0
    const-class v3, Ls3/x2;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v0, v1, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p0}, Ls3/x2;->b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Throwable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v0

    :cond_0
    if-nez v2, :cond_1

    :catchall_0
    invoke-static {p0}, Ls3/x2;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object v2

    :cond_1
    return-object v2
.end method
