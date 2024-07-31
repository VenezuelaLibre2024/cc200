.class public final Lce/j0$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lce/j0;->a(Ljd/g;Ljd/g;Z)Ljd/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/p<",
        "Ljd/g;",
        "Ljd/g$b;",
        "Ljd/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lce/j0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/j0$a;

    invoke-direct {v0}, Lce/j0$a;-><init>()V

    sput-object v0, Lce/j0$a;->h:Lce/j0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljd/g;Ljd/g$b;)Ljd/g;
    .locals 1

    instance-of v0, p2, Lce/h0;

    if-eqz v0, :cond_0

    check-cast p2, Lce/h0;

    invoke-interface {p2}, Lce/h0;->g0()Lce/h0;

    move-result-object p2

    invoke-interface {p1, p2}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1, p2}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljd/g;

    check-cast p2, Ljd/g$b;

    invoke-virtual {p0, p1, p2}, Lce/j0$a;->a(Ljd/g;Ljd/g$b;)Ljd/g;

    move-result-object p1

    return-object p1
.end method
