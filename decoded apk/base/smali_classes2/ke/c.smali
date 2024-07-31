.class public final Lke/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lsd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/q<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lhe/l0;

.field public static final c:Lhe/l0;

.field public static final d:Lhe/l0;

.field public static final e:Lhe/l0;

.field public static final f:Lhe/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lke/c$a;->h:Lke/c$a;

    sput-object v0, Lke/c;->a:Lsd/q;

    new-instance v0, Lhe/l0;

    const-string v1, "STATE_REG"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lke/c;->b:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "STATE_COMPLETED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lke/c;->c:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "STATE_CANCELLED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lke/c;->d:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "NO_RESULT"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lke/c;->e:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "PARAM_CLAUSE_0"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lke/c;->f:Lhe/l0;

    return-void
.end method

.method public static final a(I)Lke/d;
    .locals 3

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lke/d;->k:Lke/d;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected internal result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lke/d;->j:Lke/d;

    goto :goto_0

    :cond_2
    sget-object p0, Lke/d;->i:Lke/d;

    goto :goto_0

    :cond_3
    sget-object p0, Lke/d;->h:Lke/d;

    :goto_0
    return-object p0
.end method

.method public static final synthetic b(I)Lke/d;
    .locals 0

    invoke-static {p0}, Lke/c;->a(I)Lke/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lhe/l0;
    .locals 1

    sget-object v0, Lke/c;->e:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic d()Lhe/l0;
    .locals 1

    sget-object v0, Lke/c;->d:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic e()Lhe/l0;
    .locals 1

    sget-object v0, Lke/c;->c:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic f()Lhe/l0;
    .locals 1

    sget-object v0, Lke/c;->b:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic g(Lce/n;Lsd/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lke/c;->h(Lce/n;Lsd/l;)Z

    move-result p0

    return p0
.end method

.method public static final h(Lce/n;Lsd/l;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/n<",
            "-",
            "Lgd/s;",
            ">;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, Lgd/s;->a:Lgd/s;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1, p1}, Lce/n;->e(Ljava/lang/Object;Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0, p1}, Lce/n;->m(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method
