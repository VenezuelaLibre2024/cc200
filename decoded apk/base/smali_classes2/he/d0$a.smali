.class public final Lhe/d0$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhe/d0;->a(Lsd/l;Ljava/lang/Object;Ljd/g;)Lsd/l;
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
.field public final synthetic h:Lsd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/l<",
            "TE;",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljd/g;


# direct methods
.method public constructor <init>(Lsd/l;Ljava/lang/Object;Ljd/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-TE;",
            "Lgd/s;",
            ">;TE;",
            "Ljd/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lhe/d0$a;->h:Lsd/l;

    iput-object p2, p0, Lhe/d0$a;->i:Ljava/lang/Object;

    iput-object p3, p0, Lhe/d0$a;->j:Ljd/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lhe/d0$a;->h:Lsd/l;

    iget-object v0, p0, Lhe/d0$a;->i:Ljava/lang/Object;

    iget-object v1, p0, Lhe/d0$a;->j:Ljd/g;

    invoke-static {p1, v0, v1}, Lhe/d0;->b(Lsd/l;Ljava/lang/Object;Ljd/g;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lhe/d0$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
