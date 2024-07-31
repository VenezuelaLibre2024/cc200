.class public final Lcom/google/firebase/iid/Registrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/iid/Registrar$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic lambda$getComponents$0$Registrar(Ly7/d;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 5

    new-instance v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    const-class v1, Ln7/g;

    invoke-interface {p0, v1}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/g;

    const-class v2, Lj9/i;

    invoke-interface {p0, v2}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v2

    const-class v3, Lv8/j;

    invoke-interface {p0, v3}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v3

    const-class v4, Lz8/h;

    invoke-interface {p0, v4}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lz8/h;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Ln7/g;Ly8/b;Ly8/b;Lz8/h;)V

    return-object v0
.end method

.method public static final synthetic lambda$getComponents$1$Registrar(Ly7/d;)Lx8/a;
    .locals 2

    new-instance v0, Lcom/google/firebase/iid/Registrar$a;

    const-class v1, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-interface {p0, v1}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-direct {v0, p0}, Lcom/google/firebase/iid/Registrar$a;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-static {v0}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-class v2, Ln7/g;

    invoke-static {v2}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v2, Lj9/i;

    invoke-static {v2}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v2, Lv8/j;

    invoke-static {v2}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v2, Lz8/h;

    invoke-static {v2}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v2, Lw8/o;->a:Ly7/g;

    invoke-virtual {v1, v2}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->c()Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const-class v2, Lx8/a;

    invoke-static {v2}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v2

    invoke-static {v0}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v0

    invoke-virtual {v2, v0}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v0

    sget-object v2, Lw8/p;->a:Ly7/g;

    invoke-virtual {v0, v2}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ly7/c$b;->d()Ly7/c;

    move-result-object v0

    const-string v2, "fire-iid"

    const-string v3, "21.1.0"

    invoke-static {v2, v3}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ly7/c;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
