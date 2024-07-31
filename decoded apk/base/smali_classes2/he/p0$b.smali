.class public final Lhe/p0$b;
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
        "Lce/x2<",
        "*>;",
        "Ljd/g$b;",
        "Lce/x2<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final h:Lhe/p0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhe/p0$b;

    invoke-direct {v0}, Lhe/p0$b;-><init>()V

    sput-object v0, Lhe/p0$b;->h:Lhe/p0$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lce/x2;Ljd/g$b;)Lce/x2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/x2<",
            "*>;",
            "Ljd/g$b;",
            ")",
            "Lce/x2<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, p2, Lce/x2;

    if-eqz p1, :cond_1

    check-cast p2, Lce/x2;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/x2;

    check-cast p2, Ljd/g$b;

    invoke-virtual {p0, p1, p2}, Lhe/p0$b;->a(Lce/x2;Ljd/g$b;)Lce/x2;

    move-result-object p1

    return-object p1
.end method
