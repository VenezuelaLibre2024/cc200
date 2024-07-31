.class public final Lhe/p0$c;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhe/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/p<",
        "Lhe/t0;",
        "Ljd/g$b;",
        "Lhe/t0;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lhe/p0$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhe/p0$c;

    invoke-direct {v0}, Lhe/p0$c;-><init>()V

    sput-object v0, Lhe/p0$c;->h:Lhe/p0$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lhe/t0;Ljd/g$b;)Lhe/t0;
    .locals 1

    instance-of v0, p2, Lce/x2;

    if-eqz v0, :cond_0

    check-cast p2, Lce/x2;

    iget-object v0, p1, Lhe/t0;->a:Ljd/g;

    invoke-interface {p2, v0}, Lce/x2;->r0(Ljd/g;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lhe/t0;->a(Lce/x2;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhe/t0;

    check-cast p2, Ljd/g$b;

    invoke-virtual {p0, p1, p2}, Lhe/p0$c;->a(Lhe/t0;Ljd/g$b;)Lhe/t0;

    move-result-object p1

    return-object p1
.end method
