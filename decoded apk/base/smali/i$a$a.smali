.class public final Li$a$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/a<",
        "Lj;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Li$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li$a$a;

    invoke-direct {v0}, Li$a$a;-><init>()V

    sput-object v0, Li$a$a;->h:Li$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lj;
    .locals 1

    sget-object v0, Lj;->a:Lj;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li$a$a;->a()Lj;

    move-result-object v0

    return-object v0
.end method
