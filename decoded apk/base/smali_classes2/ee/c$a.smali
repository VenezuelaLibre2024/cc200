.class public final synthetic Lee/c$a;
.super Ltd/k;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lee/c;->y()Lyd/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/k;",
        "Lsd/p<",
        "Ljava/lang/Long;",
        "Lee/h<",
        "TE;>;",
        "Lee/h<",
        "TE;>;>;"
    }
.end annotation


# static fields
.field public static final h:Lee/c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lee/c$a;

    invoke-direct {v0}, Lee/c$a;-><init>()V

    sput-object v0, Lee/c$a;->h:Lee/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-class v2, Lee/c;

    const/4 v1, 0x2

    const-string v3, "createSegment"

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ltd/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final c(JLee/h;)Lee/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lee/h<",
            "TE;>;)",
            "Lee/h<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lee/c;->c(JLee/h;)Lee/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lee/h;

    invoke-virtual {p0, v0, v1, p2}, Lee/c$a;->c(JLee/h;)Lee/h;

    move-result-object p1

    return-object p1
.end method
