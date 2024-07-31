.class public final Lce/y2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lce/y2;

.field public static final b:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lce/m1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lce/y2;

    invoke-direct {v0}, Lce/y2;-><init>()V

    sput-object v0, Lce/y2;->a:Lce/y2;

    new-instance v0, Lhe/l0;

    const-string v1, "ThreadLocalEventLoop"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lhe/q0;->a(Lhe/l0;)Ljava/lang/ThreadLocal;

    move-result-object v0

    sput-object v0, Lce/y2;->b:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lce/m1;
    .locals 1

    sget-object v0, Lce/y2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/m1;

    return-object v0
.end method

.method public final b()Lce/m1;
    .locals 2

    sget-object v0, Lce/y2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lce/m1;

    if-nez v1, :cond_0

    invoke-static {}, Lce/p1;->a()Lce/m1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public final c()V
    .locals 2

    sget-object v0, Lce/y2;->b:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Lce/m1;)V
    .locals 1

    sget-object v0, Lce/y2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
