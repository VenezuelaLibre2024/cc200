.class public final Lce/g3;
.super Lce/k0;
.source ""


# static fields
.field public static final j:Lce/g3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/g3;

    invoke-direct {v0}, Lce/g3;-><init>()V

    sput-object v0, Lce/g3;->j:Lce/g3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lce/k0;-><init>()V

    return-void
.end method


# virtual methods
.method public H0(Ljd/g;Ljava/lang/Runnable;)V
    .locals 0

    sget-object p2, Lce/k3;->j:Lce/k3$a;

    invoke-interface {p1, p2}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p1

    check-cast p1, Lce/k3;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Lce/k3;->i:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public I0(Ljd/g;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method
