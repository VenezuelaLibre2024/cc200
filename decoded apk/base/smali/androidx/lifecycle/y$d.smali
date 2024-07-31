.class public final Landroidx/lifecycle/y$d;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/y;->e(Landroidx/lifecycle/i0;)Landroidx/lifecycle/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/l<",
        "Le1/a;",
        "Landroidx/lifecycle/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Landroidx/lifecycle/y$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/y$d;

    invoke-direct {v0}, Landroidx/lifecycle/y$d;-><init>()V

    sput-object v0, Landroidx/lifecycle/y$d;->h:Landroidx/lifecycle/y$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le1/a;)Landroidx/lifecycle/a0;
    .locals 1

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/lifecycle/a0;

    invoke-direct {p1}, Landroidx/lifecycle/a0;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le1/a;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/y$d;->a(Le1/a;)Landroidx/lifecycle/a0;

    move-result-object p1

    return-object p1
.end method
