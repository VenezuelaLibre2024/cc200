.class public Lk0/l0$l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# static fields
.field public static final b:Lk0/l0;


# instance fields
.field public final a:Lk0/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk0/l0$b;

    invoke-direct {v0}, Lk0/l0$b;-><init>()V

    invoke-virtual {v0}, Lk0/l0$b;->a()Lk0/l0;

    move-result-object v0

    invoke-virtual {v0}, Lk0/l0;->a()Lk0/l0;

    move-result-object v0

    invoke-virtual {v0}, Lk0/l0;->b()Lk0/l0;

    move-result-object v0

    invoke-virtual {v0}, Lk0/l0;->c()Lk0/l0;

    move-result-object v0

    sput-object v0, Lk0/l0$l;->b:Lk0/l0;

    return-void
.end method

.method public constructor <init>(Lk0/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/l0$l;->a:Lk0/l0;

    return-void
.end method


# virtual methods
.method public a()Lk0/l0;
    .locals 1

    iget-object v0, p0, Lk0/l0$l;->a:Lk0/l0;

    return-object v0
.end method

.method public b()Lk0/l0;
    .locals 1

    iget-object v0, p0, Lk0/l0$l;->a:Lk0/l0;

    return-object v0
.end method

.method public c()Lk0/l0;
    .locals 1

    iget-object v0, p0, Lk0/l0$l;->a:Lk0/l0;

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(Lk0/l0;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lk0/l0$l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lk0/l0$l;

    invoke-virtual {p0}, Lk0/l0$l;->o()Z

    move-result v1

    invoke-virtual {p1}, Lk0/l0$l;->o()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Lk0/l0$l;->n()Z

    move-result v1

    invoke-virtual {p1}, Lk0/l0$l;->n()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Lk0/l0$l;->k()La0/b;

    move-result-object v1

    invoke-virtual {p1}, Lk0/l0$l;->k()La0/b;

    move-result-object v3

    invoke-static {v1, v3}, Lj0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lk0/l0$l;->i()La0/b;

    move-result-object v1

    invoke-virtual {p1}, Lk0/l0$l;->i()La0/b;

    move-result-object v3

    invoke-static {v1, v3}, Lj0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lk0/l0$l;->f()Lk0/d;

    move-result-object v1

    invoke-virtual {p1}, Lk0/l0$l;->f()Lk0/d;

    move-result-object p1

    invoke-static {v1, p1}, Lj0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f()Lk0/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(I)La0/b;
    .locals 0

    sget-object p1, La0/b;->e:La0/b;

    return-object p1
.end method

.method public h()La0/b;
    .locals 1

    invoke-virtual {p0}, Lk0/l0$l;->k()La0/b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lk0/l0$l;->o()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lk0/l0$l;->n()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lk0/l0$l;->k()La0/b;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lk0/l0$l;->i()La0/b;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lk0/l0$l;->f()Lk0/d;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lj0/b;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()La0/b;
    .locals 1

    sget-object v0, La0/b;->e:La0/b;

    return-object v0
.end method

.method public j()La0/b;
    .locals 1

    invoke-virtual {p0}, Lk0/l0$l;->k()La0/b;

    move-result-object v0

    return-object v0
.end method

.method public k()La0/b;
    .locals 1

    sget-object v0, La0/b;->e:La0/b;

    return-object v0
.end method

.method public l()La0/b;
    .locals 1

    invoke-virtual {p0}, Lk0/l0$l;->k()La0/b;

    move-result-object v0

    return-object v0
.end method

.method public m(IIII)Lk0/l0;
    .locals 0

    sget-object p1, Lk0/l0$l;->b:Lk0/l0;

    return-object p1
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public q([La0/b;)V
    .locals 0

    return-void
.end method

.method public r(La0/b;)V
    .locals 0

    return-void
.end method

.method public s(Lk0/l0;)V
    .locals 0

    return-void
.end method

.method public t(La0/b;)V
    .locals 0

    return-void
.end method
