.class public final Lhe/p0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lhe/l0;

.field public static final b:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "Ljava/lang/Object;",
            "Ljd/g$b;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "Lce/x2<",
            "*>;",
            "Ljd/g$b;",
            "Lce/x2<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static final d:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "Lhe/t0;",
            "Ljd/g$b;",
            "Lhe/t0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhe/l0;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lhe/p0;->a:Lhe/l0;

    sget-object v0, Lhe/p0$a;->h:Lhe/p0$a;

    sput-object v0, Lhe/p0;->b:Lsd/p;

    sget-object v0, Lhe/p0$b;->h:Lhe/p0$b;

    sput-object v0, Lhe/p0;->c:Lsd/p;

    sget-object v0, Lhe/p0$c;->h:Lhe/p0$c;

    sput-object v0, Lhe/p0;->d:Lsd/p;

    return-void
.end method

.method public static final a(Ljd/g;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lhe/p0;->a:Lhe/l0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lhe/t0;

    if-eqz v0, :cond_1

    check-cast p1, Lhe/t0;

    invoke-virtual {p1, p0}, Lhe/t0;->b(Ljd/g;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    sget-object v1, Lhe/p0;->c:Lsd/p;

    invoke-interface {p0, v0, v1}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lce/x2;

    invoke-interface {v0, p0, p1}, Lce/x2;->E(Ljd/g;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final b(Ljd/g;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lhe/p0;->b:Lsd/p;

    invoke-interface {p0, v0, v1}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ltd/m;->c(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c(Ljd/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lhe/p0;->b(Ljd/g;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lhe/p0;->a:Lhe/l0;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lhe/t0;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lhe/t0;-><init>(Ljd/g;I)V

    sget-object p1, Lhe/p0;->d:Lsd/p;

    invoke-interface {p0, v0, p1}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lce/x2;

    invoke-interface {p1, p0}, Lce/x2;->r0(Ljd/g;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
