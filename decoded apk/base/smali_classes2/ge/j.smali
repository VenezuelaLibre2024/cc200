.class public final Lge/j;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lsd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/q<",
            "Lfe/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lge/j$a;->h:Lge/j$a;

    const-string v1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>"

    invoke-static {v0, v1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ltd/a0;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsd/q;

    sput-object v0, Lge/j;->a:Lsd/q;

    return-void
.end method

.method public static final synthetic a()Lsd/q;
    .locals 1

    sget-object v0, Lge/j;->a:Lsd/q;

    return-object v0
.end method
