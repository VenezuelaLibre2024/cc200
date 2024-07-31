.class public final Lle/d$b;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lle/d;-><init>(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/l<",
        "Ljava/lang/Throwable;",
        "Lgd/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lle/d;


# direct methods
.method public constructor <init>(Lle/d;)V
    .locals 0

    iput-object p1, p0, Lle/d$b;->h:Lle/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lle/d$b;->h:Lle/d;

    invoke-virtual {p1}, Lle/d;->i()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lle/d$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
