.class public final Lr0/m$e;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/m;-><init>(Lsd/a;Lr0/k;Ljava/util/List;Lr0/b;Lce/p0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/p<",
        "Lr0/m$b<",
        "TT;>;",
        "Ljava/lang/Throwable;",
        "Lgd/s;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lr0/m$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/m$e;

    invoke-direct {v0}, Lr0/m$e;-><init>()V

    sput-object v0, Lr0/m$e;->h:Lr0/m$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr0/m$b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/m$b<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "msg"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr0/m$b$b;

    if-eqz v0, :cond_1

    check-cast p1, Lr0/m$b$b;

    invoke-virtual {p1}, Lr0/m$b$b;->a()Lce/x;

    move-result-object p1

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/concurrent/CancellationException;

    const-string v0, "DataStore scope was cancelled before updateData could complete"

    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1, p2}, Lce/x;->l0(Ljava/lang/Throwable;)Z

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr0/m$b;

    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {p0, p1, p2}, Lr0/m$e;->a(Lr0/m$b;Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
