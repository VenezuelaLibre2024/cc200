.class public final Lce/s1$a$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lce/s1$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/l<",
        "Ljd/g$b;",
        "Lce/s1;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lce/s1$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/s1$a$a;

    invoke-direct {v0}, Lce/s1$a$a;-><init>()V

    sput-object v0, Lce/s1$a$a;->h:Lce/s1$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljd/g$b;)Lce/s1;
    .locals 1

    instance-of v0, p1, Lce/s1;

    if-eqz v0, :cond_0

    check-cast p1, Lce/s1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljd/g$b;

    invoke-virtual {p0, p1}, Lce/s1$a$a;->a(Ljd/g$b;)Lce/s1;

    move-result-object p1

    return-object p1
.end method
