.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Ln9/b$a;->h:Ln9/b$a;

    invoke-static {v0}, Ln9/a;->a(Ln9/b$a;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;Ly7/d;)La8/g;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b(Ly7/d;)La8/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ly7/d;)La8/g;
    .locals 5

    const-class v0, Ln7/g;

    invoke-interface {p1, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln7/g;

    const-class v1, Lb8/a;

    invoke-interface {p1, v1}, Ly7/d;->g(Ljava/lang/Class;)Ly8/a;

    move-result-object v1

    const-class v2, Lp7/a;

    invoke-interface {p1, v2}, Ly7/d;->g(Ljava/lang/Class;)Ly8/a;

    move-result-object v2

    const-class v3, Lz8/h;

    invoke-interface {p1, v3}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz8/h;

    const-class v4, Lk9/a;

    invoke-interface {p1, v4}, Ly7/d;->g(Ljava/lang/Class;)Ly8/a;

    move-result-object p1

    invoke-static {v0, v3, v1, v2, p1}, La8/g;->e(Ln7/g;Lz8/h;Ly8/a;Ly8/a;Ly8/a;)La8/g;

    move-result-object p1

    return-object p1
.end method

.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ly7/c;

    const-class v1, La8/g;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v2, "fire-cls"

    invoke-virtual {v1, v2}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    const-class v3, Ln7/g;

    invoke-static {v3}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lz8/h;

    invoke-static {v3}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lb8/a;

    invoke-static {v3}, Ly7/q;->a(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lp7/a;

    invoke-static {v3}, Ly7/q;->a(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lk9/a;

    invoke-static {v3}, Ly7/q;->a(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    new-instance v3, La8/f;

    invoke-direct {v3, p0}, La8/f;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    invoke-virtual {v1, v3}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->e()Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "18.6.2"

    invoke-static {v2, v1}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
