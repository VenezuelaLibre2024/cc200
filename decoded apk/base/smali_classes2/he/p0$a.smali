.class public final Lhe/p0$a;
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
        "Ljava/lang/Object;",
        "Ljd/g$b;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lhe/p0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhe/p0$a;

    invoke-direct {v0}, Lhe/p0$a;-><init>()V

    sput-object v0, Lhe/p0$a;->h:Lhe/p0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljd/g$b;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p2, Lce/x2;

    if-eqz v0, :cond_3

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_2
    return-object p2

    :cond_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljd/g$b;

    invoke-virtual {p0, p1, p2}, Lhe/p0$a;->a(Ljava/lang/Object;Ljd/g$b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
